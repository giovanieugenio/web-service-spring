package com.javaprojectspring.javaproject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaprojectspring.javaproject.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourceWeb {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Mary", "mary@gmail.com","(23)2616022", "62845m");
		return ResponseEntity.ok().body(u);
	}

}
