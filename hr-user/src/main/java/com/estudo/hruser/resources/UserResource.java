package com.estudo.hruser.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.hruser.entities.User;
import com.estudo.hruser.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@Autowired
	private UserRepository repo; 
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){		
		Optional<User> obj = repo.findById(id);
		return ResponseEntity.ok(obj.orElse(null));
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){		
		Optional<User> obj = repo.findByEmail(email);
		return ResponseEntity.ok(obj.orElse(null));
	}
	
	
}