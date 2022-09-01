package com.timetable.scheduler.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import com.timetable.scheduler.model.Newclass;

public class ClassInterfaceImpl implements ClassInterface {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<Newclass> findClassIds(String subject) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Newclass> query = criteriaBuilder.createQuery(Newclass.class);
        Root<Newclass> newclass = query.from(Newclass.class);

       query.select(newclass)
       .where(criteriaBuilder.like(newclass.get("subjects"),"%"+subject+"%"));
       List<Newclass> resultList = entityManager.createQuery(query).getResultList();
       entityManager.close();
       return resultList;
	}

}
