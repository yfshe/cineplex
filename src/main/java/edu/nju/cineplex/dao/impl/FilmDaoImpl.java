package edu.nju.cineplex.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.FilmDao;
import edu.nju.cineplex.model.Film;

@Repository
public class FilmDaoImpl extends BaseDaoImpl<Film> implements FilmDao{

	public List<Film> getFilmList() {
		String query = "from Film";
		
		List<Film> flist = findByHQL(query);

		return flist;
	}

	public List<Film> getFilmNoJoinAc(int m_id) {
		String query = "select f from Film f, MemberFilm mf where f.id = mf.film_id "
				+ "and mf.member_id = ? and mf.activity = ?";
		
		List<Film> flist = findByHQL(query, m_id, "n");
		
		return flist;
	}

}
