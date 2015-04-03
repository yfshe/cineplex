package edu.nju.cineplex.dao;

import edu.nju.cineplex.model.MemberFilm;

public interface MemberFilmDao extends BaseDao<MemberFilm> {
	
	MemberFilm findByMidFid(int m_id, int f_id);

}
