package com.progetto.progetto.controller;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.progetto.progetto.Model.Job;
import com.progetto.progetto.Service.*;
import com.progetto.progetto.Utils.Statistiche;
import com.progetto.progetto.Service.CityService;
import com.progetto.progetto.Exception.WrongArgumentException;
import com.progetto.progetto.Exception.UnexistingFilterException;


/**classe che gestisce le chiamate al server
 * 
 * @author pietrobonsanto
 *
 */

@RestController
public class controller {
	@Autowired
	private JobServiceImpl jobService;
	private CityServiceImpl cityService;

@RequestMapping(value = "/cities", method = RequestMethod.GET)
public ResponseEntity<Object> getCity(){
	//ritorna la lista delle città - invoco il servizio con getProducts
	return new ResponseEntity<>(cityService.getCities(), HttpStatus.OK);
}
		/**rotta per ottenere tutti i job 
		 * 
		 */
		@RequestMapping(value = "/jobs")
		public ResponseEntity<Object> getJob() {
			return new ResponseEntity<>(jobService.getJob(), HttpStatus.OK);
		}
	
	


/**
 * Rotta che permette di filtrare la timeline
 * 
 * @param filter filtro che si vuole applicare
 * @returnun ArrayList di job filtrato
 * @throws UnexistingFilterException eccezione lanciata se il filtro non esiste
 * @throws WrongArgumentException   eccezione lanciata se l'argomento passato
 *                                    e' errato
 * @throws Exception
 */
@RequestMapping(value = "/data", method = RequestMethod.POST)
public ResponseEntity<ArrayList<Job>> getFilteredJobs(@RequestBody Object filter)
		throws UnexistingFilterException, WrongArgumentException, Exception {
	return new ResponseEntity<>(CO.COColumn(filter), HttpStatus.CREATED);
}
}
	