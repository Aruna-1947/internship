package com.javatechie.h2.api.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.javatechie.h2.api.dao.userRepository;
import com.javatechie.h2.api.model.user;

@RestController

public class userController {
	
	@Autowired
	private userRepository repository;
	
	@PostMapping("/saveuser")
	public String saveuser(@RequestBody user u1) {
		repository.save(u1);
		return "user details saved...";
	}
	
	@GetMapping("/getAlluser")
	public List<user> getAll(){
		return repository.findAll();
		
	}
	@GetMapping("/getuser/{fname}")
	public List<user>getuserByFname(@PathVariable String fname)
	{
		return repository.findByFname(fname);
	}

}
