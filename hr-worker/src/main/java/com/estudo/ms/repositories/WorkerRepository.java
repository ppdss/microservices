package com.estudo.ms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.ms.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

	
}
