package it.univpm.demoSpringBoot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.demoSpringBoot.model.City;
import it.univpm.demoSpringBoot.service.CityService;


@RestController
	public class CityController {
		@Autowired
		CityService cityService;
		
		@RequestMapping(value = "/cities", method = RequestMethod.GET)
		public ResponseEntity<Object> getCity(){
			//ritorna la lista dei prodotti - invoco il servizio con getProducts
			return new ResponseEntity<>(cityService.getCities(), HttpStatus.OK);
		}
		
		@RequestMapping(value = "/cities/{id}", method = RequestMethod.PUT)
		//uso @PathVariabile, in questo modo l'id viene mappato in un intero (int id) che poi potremo utilizzare
		public ResponseEntity<Object> updateCity(@PathVariable("id") int id, @RequestBody City city){
			cityService.updateCity(id,  city);
			return new ResponseEntity<>("City is updated successfully", HttpStatus.OK);
		}
		
		@RequestMapping(value = "/cities/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<Object> delete(@PathVariable("id") Integer id){
			cityService.deleteCity(id);
			return new ResponseEntity<>("City is deleted successfully", HttpStatus.OK);
		}
		
		@RequestMapping(value = "/cities", method = RequestMethod.POST)
		public ResponseEntity<Object> createCity(@RequestBody City city){
			cityService.createCity(city);
			return new ResponseEntity<>("City is created successfully", HttpStatus.CREATED);
		}
		
	}


