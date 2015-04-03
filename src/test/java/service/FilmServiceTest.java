package service;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.service.film.impl.FilmServiceImpl;
import edu.nju.cineplex.service.member.impl.MemberServiceImpl;
import edu.nju.cineplex.vo.ActivityVO;
import edu.nju.cineplex.vo.FilmBriefInfoVO;
import edu.nju.cineplex.vo.FilmDetailInfoVO;
import edu.nju.cineplex.vo.MemberFilmVO;
import edu.nju.cineplex.vo.PlanByFilmVO;
import edu.nju.cineplex.vo.PlanByHallVO;
import edu.nju.cineplex.vo.PlanVO;
import edu.nju.cineplex.vo.TicketVO;

public class FilmServiceTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		FilmServiceImpl f = applicationContext.getBean(FilmServiceImpl.class);
		
		/*
		List<FilmBriefInfoVO> list = f.getRecommendedFilmList();
		FilmBriefInfoVO fvo = list.get(0);
		System.out.println(fvo.getName());
		FilmDetailInfoVO fvo = f.getFileDetailInfo(1);
		System.out.println(fvo.getActor());
		System.out.println(fvo.getCountry());
		System.out.println(fvo.getDirector());
		System.out.println(fvo.getPlot());
		
		MemberFilmVO mvo = f.getFilmWithMember(1000002, 1);
		System.out.println(mvo.hasJoinedActivity());
		System.out.println(mvo.hasViewed());
		List<Date> list = f.getUncheckFilmPlanDate();
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).toString());
		PlanVO p = f.getPlanByFilmList(Date.valueOf("2015-4-24"));
		System.out.println(p.getDate());
		List<PlanByFilmVO> list = p.getPlanByFilmList();
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getFilm_name());
			List<String> ll = list.get(i).getSession_list();
			for(int j = 0; j < ll.size(); j++)
				System.out.print(ll.get(j));
		}
		PlanVO p = f.getPlanByHallList(Date.valueOf("2015-4-24"));
		System.out.println(p.getDate());
		List<PlanByHallVO> list = p.getPlanByHallList();
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getHall_no());
			List<String> name = list.get(i).getFilm_name_list();
			List<String> session = list.get(i).getSession_list();
			for(int j = 0; j < name.size(); j++){
				System.out.println(name.get(j) + session.get(j));
			}
		}

		PlanVO p = new PlanVO();
		p.setDate(Date.valueOf("2015-4-30"));
		List<PlanByHallVO> list = new ArrayList<PlanByHallVO>();
		PlanByHallVO pvo = new PlanByHallVO();
		pvo.setHall_no(1);
		List<String> sl = new ArrayList<String>();
		sl.add("9:00-10:00");
		sl.add("3:00-5:00");
		List<String> nl = new ArrayList<String>();
		nl.add("蝙蝠侠：黑暗骑士崛起");
		nl.add("蝙蝠侠：黑暗骑士崛起");
		List<Integer> il = new ArrayList<Integer>();
		il.add(new Integer(1));
		il.add(new Integer(1));
		pvo.setFilm_id_list(il);
		pvo.setFilm_name_list(nl);
		pvo.setSession_list(sl);
		p.addPlanByHallVO(pvo);
		pvo = new PlanByHallVO();
		pvo.setHall_no(2);
		pvo.setFilm_id_list(il);
		pvo.setFilm_name_list(nl);
		pvo.setSession_list(sl);
		p.addPlanByHallVO(pvo);
		f.addNewFilmPlan(p);
		
		f.checkPassFilmPlan(Date.valueOf("2015-4-30"));
		
		TicketVO ticket = new TicketVO();
		ticket.setFilm_id(1);
		ticket.setFilm_name("蝙蝠侠：黑暗骑士崛起");
		ticket.setFilm_session("9:00-10:00");
		ticket.setMember_id(1000002);
		ticket.setPrice(50);
		ticket.setSeat_no(20);
		ticket.setView_date(Date.valueOf("2015-3-28"));
		f.film_buyTicket(ticket);
		*/
		
		ActivityVO a = f.getFilmActivity(2);
		System.out.println(a.getQuestion() + a.getOption1() + a.getOption2() + a.getOption3());
		a = f.getFilmActivity(1);
		System.out.println(a.getQuestion() + a.getOption1() + a.getOption2() + a.getOption3());
		a = new ActivityVO();
		a.setAnswer("Answer");
		a.setFilm_id(2);
		a.setFilm_name("name");
		a.setOption1("option1");
		a.setOption2("option2");
		a.setOption3("option3");
		f.addFilmActivity(a);
		
	}

}
