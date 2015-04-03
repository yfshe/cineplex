package edu.nju.cineplex.service.film.impl;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.ActivityDao;
import edu.nju.cineplex.dao.CostRecordDao;
import edu.nju.cineplex.dao.FilmDao;
import edu.nju.cineplex.dao.MemberDao;
import edu.nju.cineplex.dao.MemberFilmDao;
import edu.nju.cineplex.dao.PlanDao;
import edu.nju.cineplex.dao.PlanDateDao;
import edu.nju.cineplex.dao.impl.ActivityDaoImpl;
import edu.nju.cineplex.dao.impl.CostRecordDaoImpl;
import edu.nju.cineplex.dao.impl.FilmDaoImpl;
import edu.nju.cineplex.dao.impl.MemberDaoImpl;
import edu.nju.cineplex.dao.impl.MemberFilmDaoImpl;
import edu.nju.cineplex.dao.impl.PlanDaoImpl;
import edu.nju.cineplex.dao.impl.PlanDateDaoImpl;
import edu.nju.cineplex.model.Activity;
import edu.nju.cineplex.model.CostRecord;
import edu.nju.cineplex.model.Film;
import edu.nju.cineplex.model.Member;
import edu.nju.cineplex.model.MemberFilm;
import edu.nju.cineplex.model.Plan;
import edu.nju.cineplex.model.PlanDate;
import edu.nju.cineplex.service.film.FilmService;
import edu.nju.cineplex.vo.ActivityVO;
import edu.nju.cineplex.vo.FilmBriefInfoVO;
import edu.nju.cineplex.vo.FilmDetailInfoVO;
import edu.nju.cineplex.vo.MemberBriefInfoVO;
import edu.nju.cineplex.vo.MemberFilmVO;
import edu.nju.cineplex.vo.PlanByFilmVO;
import edu.nju.cineplex.vo.PlanByHallVO;
import edu.nju.cineplex.vo.PlanVO;
import edu.nju.cineplex.vo.TicketVO;

@Repository
public class FilmServiceImpl implements FilmService{
	@Resource(type=ActivityDaoImpl.class)
	private ActivityDao activityDao;
	
	@Resource(type=FilmDaoImpl.class)
	private FilmDao filmDao;
	
	@Resource(type=MemberFilmDaoImpl.class)
	private MemberFilmDao memberFilmDao;
	
	@Resource(type=PlanDaoImpl.class)
	private PlanDao planDao;
	
	@Resource(type=PlanDateDaoImpl.class)
	private PlanDateDao planDateDao;
	
	@Resource(type=MemberDaoImpl.class)
	private MemberDao	memberDao;
	
	@Resource(type=CostRecordDaoImpl.class)
	private CostRecordDao costRecordDao;

	public List<FilmBriefInfoVO> getRecommendedFilmList() {
		List<Film> flist = filmDao.getFilmList();
		Iterator<Film> iterator = flist.iterator();
		
		ArrayList<FilmBriefInfoVO> fblist = new ArrayList<FilmBriefInfoVO>();
		
		while(iterator.hasNext()){
			fblist.add(new FilmBriefInfoVO(iterator.next()));
		}
		
		return fblist;
	}

	public FilmDetailInfoVO getFileDetailInfo(int id) {
		Film film = filmDao.findById(id);
		
		if(null == film)
			return null;
		
		FilmDetailInfoVO fdvo = new FilmDetailInfoVO(film);
		 
		return fdvo;
	}

	public MemberFilmVO getFilmWithMember(int member_id, int film_id) {
		MemberFilmVO mfv = new MemberFilmVO();
		MemberFilm mf = memberFilmDao.findByMidFid(member_id, film_id);
		
		if(null == mf){
			mfv.setView(false);
		}else{
			mfv.setView(true);
		}
		
		if(mf.getActivity().equals("n")){
			mfv.setActivity(false);
		}else{
			mfv.setActivity(true);
		}
		
		return mfv;
	}

	public List<Date> getCheckedFilmPlanDate() {
		ArrayList<Date> dlist = new ArrayList<Date>();
		List<PlanDate> pdlist = planDateDao.getCheckedPlanDate();
		
		Iterator<PlanDate> iterator = pdlist.iterator();
		
		while(iterator.hasNext()){
			dlist.add(iterator.next().getPlan_date());
		}
		
		return dlist;
	}

	public List<Date> getUncheckFilmPlanDate() {
		ArrayList<Date> dlist = new ArrayList<Date>();
		List<PlanDate> pdlist = planDateDao.getUnCheckPlanDate();
		
		Iterator<PlanDate> iterator = pdlist.iterator();
		
		while(iterator.hasNext()){
			dlist.add(iterator.next().getPlan_date());
		}
		
		return dlist;
	}

	public PlanVO getPlanByFilmList(Date date) {
		PlanVO planVO = new PlanVO();
		planVO.setDate(date);
		
		
		List<Plan> plist = planDao.getPlanList(date);
		Map<Integer, List<Plan>> plan_map = new HashMap<Integer, List<Plan>>();
		
		Iterator<Plan> iterator = plist.iterator();
		
		while(iterator.hasNext()){
			Plan plan = iterator.next();
			Integer id = new Integer(plan.getFilm_id());
			
			if(! plan_map.containsKey(id)){
				plan_map.put(id, new ArrayList<Plan>());
			}
			
			plan_map.get(id).add(plan);
		}
		
		Set<Integer> id_set = plan_map.keySet();
		
		Iterator<Integer> iter = id_set.iterator();
		while(iter.hasNext()){
			List<Plan> pl = plan_map.get(iter.next());
			PlanByFilmVO pfvo = new PlanByFilmVO();
			pfvo.setFilm_id(pl.get(0).getFilm_id());
			pfvo.setFilm_name(pl.get(0).getFilm_name());
			pfvo.setSession_list(pl);
			
			planVO.addPlanByFilmVO(pfvo);
		}

		return planVO;
	}

	public PlanVO getPlanByHallList(Date date) {
		PlanVO planVO = new PlanVO();
		planVO.setDate(date);
		
		
		List<Plan> plist = planDao.getPlanList(date);
		Map<Integer, List<Plan>> plan_map = new HashMap<Integer, List<Plan>>();
		
		Iterator<Plan> iterator = plist.iterator();
		
		while(iterator.hasNext()){
			Plan plan = iterator.next();
			Integer hall = new Integer(plan.getHall_no());
			
			if(! plan_map.containsKey(hall)){
				plan_map.put(hall, new ArrayList<Plan>());
			}
			
			plan_map.get(hall).add(plan);
		}
		
		Set<Integer> hall_set = plan_map.keySet();
		
		Iterator<Integer> iter = hall_set.iterator();
		while(iter.hasNext()){
			List<Plan> pl = plan_map.get(iter.next());
			
			PlanByHallVO phvo = new PlanByHallVO();
			phvo.setHall_no(pl.get(0).getHall_no());
			phvo.setList(pl);
			
			planVO.addPlanByHallVO(phvo);
		}

		return planVO;
	}

	public void addNewFilmPlan(PlanVO planVO) {
		PlanDate planDate = new PlanDate();
		planDate.setPlan_date(planVO.getDate());
		planDate.setState("n");
		planDateDao.save(planDate);
		
		List<PlanByHallVO> plan_list = planVO.getPlanByHallList();
		
		Iterator<PlanByHallVO> iterator = plan_list.iterator();
		while(iterator.hasNext()){
			PlanByHallVO phvo = iterator.next();
			Date date = planVO.getDate();
			
			List<Integer> film_id_list = phvo.getFilm_id_list();
			List<String> film_name_list = phvo.getFilm_name_list();
			List<String> session_list = phvo.getSession_list();
			int hall_no = phvo.getHall_no();
			
			for(int i = 0; i < film_id_list.size(); i++){
				Plan plan = new Plan();
				plan.setPlan_date(date);
				plan.setFilm_id(film_id_list.get(i).intValue());
				plan.setFilm_name(film_name_list.get(i));
				plan.setHall_no(hall_no);
				
				String session = session_list.get(i);
				String start = session.split("-")[0] + ":00";
				String end = session.split("-")[1] + ":00";
				
				plan.setStart_time(Time.valueOf(start));
				plan.setEnd_time(Time.valueOf(end));
				
				planDao.save(plan);
			}
		}
	}

	public boolean changeFilmPlan(PlanVO plan) {
		// TODO Auto-generated method stub
		return false;
	}

	public void checkPassFilmPlan(Date date) {
		PlanDate planDate = planDateDao.findById(date);
		planDate.setState("y");
		planDateDao.update(planDate);
	}

	public boolean film_buyTicket(TicketVO ticket) {
		Member member = memberDao.findById(ticket.getMember_id());
		int level = member.getM_level();
		
		int price = 0;
		int points = 0;
		switch(level){
		case 1:
			price = (int) (ticket.getPrice() * 0.9);
			points = 10;
			break;
		case 2:
			price = (int) (ticket.getPrice() * 0.8);
			points = 12;
			break;
		case 3:
			price = (int) (ticket.getPrice() * 0.7);
			points = 15;
			break;
		}
		
		if(member.getBalance() < price)
			return false;
		
		member.setBalance(member.getBalance() - price);
		member.setPoints(member.getPoints() + points);
		memberDao.update(member);
		
		CostRecord cr = new CostRecord();
		cr.setBalance(member.getBalance());
		cr.setCost(price);
		cr.setCost_date(new Timestamp(new java.util.Date().getTime()));
		cr.setDescription("购买《" + ticket.getFilm_name() + "》电影票");
		cr.setMember_id(member.getId());
		
		costRecordDao.save(cr);

		MemberFilm mf = new MemberFilm();
		mf.setActivity("n");
		mf.setFilm_id(ticket.getFilm_id());
		mf.setFilm_name(ticket.getFilm_name());
		mf.setFilm_session(ticket.getFilm_session());
		mf.setMember_id(member.getId());
		mf.setPrice(price);
		mf.setSeat_no(ticket.getSeat_no());
		mf.setView_date(ticket.getView_date());
		
		memberFilmDao.save(mf);
		
		return true;
	}

	public ActivityVO getFilmActivity(int film_id) {
		List<Activity> alist = activityDao.getActivityList(film_id);
		
		if(alist.isEmpty()){
			return new ActivityVO();
		}else{
			return new ActivityVO(alist.get(0));
		}
	}

	public void addFilmActivity(ActivityVO activity) {
		Activity a = new Activity();
		a.setAnswer(activity.getAnswer());
		a.setFilm_id(activity.getFilm_id());
		a.setOption1(activity.getOption1());
		a.setOption2(activity.getOption2());
		a.setOption3(activity.getOption3());
		a.setQuestion(activity.getQuestion());
		
		activityDao.save(a);
	}
}