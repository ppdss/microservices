package com.estudo.ms.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.ms.entities.Worker;
import com.estudo.ms.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	@Autowired
	private WorkerRepository repo; 
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
	
		List<Worker> workers = repo.findAll();
		return ResponseEntity.ok(workers);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id){
	
		Optional<Worker> worker = repo.findById(id);
		return ResponseEntity.ok(worker.orElse(null));
	}
}
