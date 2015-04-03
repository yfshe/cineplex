package edu.nju.cineplex.service.film;

import java.sql.Date;
import java.util.List;

import edu.nju.cineplex.vo.*;

public interface FilmService {

	public ActivityVO getFilmActivity(int film_id);
	public void addFilmActivity(ActivityVO activity);
	public List<FilmBriefInfoVO> getRecommendedFilmList();
	public FilmDetailInfoVO getFileDetailInfo(int id);
	public MemberFilmVO getFilmWithMember(int member_id, int film_id);
	public List<Date> getCheckedFilmPlanDate();
	public List<Date> getUncheckFilmPlanDate();
	public PlanVO getPlanByFilmList(Date date);
	public PlanVO getPlanByHallList(Date date);
	public void addNewFilmPlan(PlanVO plan);
	public boolean changeFilmPlan(PlanVO plan);
	public void checkPassFilmPlan(Date date);
	public boolean film_buyTicket(TicketVO ticket);

}
