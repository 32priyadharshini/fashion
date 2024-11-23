package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FashionService {
	@Autowired
	FashionDao fd;

	public Fashion post(Fashion a) {
		// TODO Auto-generated method stub
		return fd.post(a);
	}

	public List<Fashion> getAll() {
		// TODO Auto-generated method stub
		return fd.getAll();
	}

}
