package edu.nju.cineplex.dao;

import java.util.List;

import edu.nju.cineplex.model.Film;

public interface FilmDao extends BaseDao<Film> {

	public List<Film> getFilmList();
	public List<Film> getFilmNoJoinAc(int m_id);
}
