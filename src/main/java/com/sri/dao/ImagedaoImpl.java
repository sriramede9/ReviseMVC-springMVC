package com.sri.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sri.data.Image;

@Component
public class ImagedaoImpl implements ImageDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public void save(Image imgobj) {
		// TODO Auto-generated method stub

		System.out.println("Saved boss go check!");

		hibernateTemplate.save(imgobj);
	}

}
