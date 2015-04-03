package edu.nju.cineplex.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import edu.nju.cineplex.dao.BaseDao;
import edu.nju.cineplex.utils.ReflectionUtils;

public abstract class BaseDaoImpl<T> implements BaseDao<T>{
	private Class<T> entityClass;

	@Autowired
	private SessionFactory sessionFactory;

	public BaseDaoImpl() {
		this.entityClass = ReflectionUtils.getSuperClassGenericType(getClass());
	}

	protected Session getSession() {
		return this.sessionFactory.openSession();
	}

	public void save(T entity) {
//		this.getSession().save(entity);
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.save(entity);
		tx.commit();
	}

	public void update(T entity) {
//		this.getSession().update(entity);
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.update(entity);
		tx.commit();
	}

	public void delete(Serializable id) {
//		this.getSession().delete(this.findById(id));
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.delete(this.findById(id));
		tx.commit();
	}

	public T findById(Serializable id) {
		return (T) this.getSession().get(this.entityClass, id);
	}

	public List<T> findByHQL(String hql, Object... params) {
		Query query = this.getSession().createQuery(hql);
		for (int i = 0; params != null && i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		return query.list();
	}
}