package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.*;
import edu.nju.cineplex.dao.impl.*;

public class FilmDaoTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		FilmDao fd = applicationContext.getBean(FilmDaoImpl.class);
		
		System.out.println(fd.getFilmList().get(0).getName());
		
		System.out.println(fd.getFilmNoJoinAc(1000002).get(0).getName());

	}

}
