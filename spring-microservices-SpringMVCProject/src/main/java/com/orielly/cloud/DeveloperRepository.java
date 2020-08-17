package com.orielly.cloud;

 

import org.springframework.data.repository.CrudRepository;

public interface DeveloperRepository extends CrudRepository<Developer, Long>{

	Developer findAllById(Long id);
	 
	}

