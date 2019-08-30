package com.sri.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sri.data.Employeetwo;

@Component
public class EmploeedaoImpl implements EmployeeDao {

	// hibernateTemplate
	// @transactional

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public List<Employeetwo> getAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Employeetwo.class);
	}

}
