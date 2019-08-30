package com.sri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.dao.EmploeedaoImpl;
import com.sri.data.Employeetwo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmploeedaoImpl emploeedaoImpl;

	@Override
	public List<Employeetwo> getAll() {
		// TODO Auto-generated method stub
		return emploeedaoImpl.getAll();
	}

}
