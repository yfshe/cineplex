package edu.nju.cineplex.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.MemberFilmDao;
import edu.nju.cineplex.model.MemberFilm;

@Repository
public class MemberFilmDaoImpl extends BaseDaoImpl<MemberFilm> implements MemberFilmDao{

	public MemberFilm findByMidFid(int m_id, int f_id) {
		String query = "from MemberFilm where member_id = ? and film_id = ?";
		List<MemberFilm> mflist = findByHQL(query, m_id, f_id);
		
		if(mflist.isEmpty())
			return null;
		
		return mflist.get(0);
	}


}
