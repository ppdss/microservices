package com.estudo.ms.resources;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.ms.entities.Worker;
import com.estudo.ms.repositories.WorkerRepository;

@RefreshScope
@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);
	
	//@Value("${test.config}")
	//private String testConfig;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerRepository repo; 
	
	@GetMapping(value="/configs")
	public ResponseEntity<Void> getConfigs(){
		//logger.info("Config =" + testConfig);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
	
		List<Worker> workers = repo.findAll();
		return ResponseEntity.ok(workers);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id){
	
		/*try {    // Por default o ribbon tem 1 segundo de tolerancia de timeout
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		*/
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Optional<Worker> worker = repo.findById(id);
		return ResponseEntity.ok(worker.orElse(null));
	}
	
	
	
}
