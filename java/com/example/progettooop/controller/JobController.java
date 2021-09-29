package com.example.progettooop.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import it.univpm.demoSpringBoot.model.City;
import it.univpm.demoSpringBoot.service.CityService;
 
@RestController
public class JobController {
	
		@Autowired
		JobService jobService;
		
		@RequestMapping(value = "/jobs", method = RequestMethod.GET)
		public ResponseEntity<Object> getJob(){
			//ritorna la lista dei lavori tà - invoco il servizio con getProducts
			return new ResponseEntity<>(cityService.getCities(), HttpStatus.OK);
		}
		
		@RequestMapping(value = "/jobs/{id}", method = RequestMethod.PUT)
		//uso @PathVariabile, in questo modo l'id viene mappato in un intero (int id) che poi potremo utilizzare
		public ResponseEntity<Object> updateJob(@PathVariable("id") int id, @RequestBody Job job){
			jobService.updateJob(id,  job);
			return new ResponseEntity<>("<Job is updated successfully", HttpStatus.OK);
		}
		
		@RequestMapping(value = "/jobs/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<Object> delete(@PathVariable("id") Integer id){
			jobService.deleteJob(id);
			return new ResponseEntity<>("Job is deleted successfully", HttpStatus.OK);
		}
		
		@RequestMapping(value = "/jobs", method = RequestMethod.POST)
		public ResponseEntity<Object> createJob(@RequestBody Job job){
			cityService.createJob(job);
			return new ResponseEntity<>("job is created successfully", HttpStatus.CREATED);
		}
		
	}


