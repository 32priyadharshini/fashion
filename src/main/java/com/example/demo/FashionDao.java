package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public class FashionDao {

	@Autowired
	FashionRepo fr;
	public Fashion post(Fashion a) {
		// TODO Auto-generated method stub
		return fr.save(a);
		
	}
	public List<Fashion> getAll() {
		// TODO Auto-generated method stub
		return fr.findAll();
	}

}
