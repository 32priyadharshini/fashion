package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:4200")
@RestController
public class FashionController {
	@Autowired
	FashionService fs;
	@PostMapping("postl")
	public Fashion post(@RequestBody Fashion a) {
		return fs.post(a);
	}
	
	@GetMapping("/getall")
	public List<Fashion> getAll(){
		return fs.getAll();
	}

}
