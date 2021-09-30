package com.progetto.progetto.controller;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.BeanFactory.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	private CityServiceImpl CityService;
 
	
	/*+ rotta per mostrare le città su cui fare le ricerche ( la location sarà la città stessa)
	 * 
	 */
	
       @RequestMapping(value = "/cities", headers = "Authorization=Token dfac007afb1130c8d529e192f72097f254bb4fa2" , method = RequestMethod.GET)
       public ResponseEntity<Object> getCity(){
	   //ritorna la lista delle città - invoco il servizio con getProducts
	return new ResponseEntity<>(CityService.getCities(), HttpStatus.OK);
}
		



  /*rotta per ottenere i jobs
   * 
		@RequestMapping(value = "/jobs")
		public ResponseEntity<Object> getJob() {
			return new ResponseEntity<>(jobService.getJob(), HttpStatus.OK);
		}
	*/
	

 /**
 * Rotta che mostra i metadati relativi ad ogni job presente nella lista
 * 
 * @return Restituisce i metadati sotto forma di JSON
 */
		@RequestMapping(value = "/metadata", headers = "Authorization=Token dfac007afb1130c8d529e192f72097f254bb4fa2" ,method = RequestMethod.GET)
		public ResponseEntity<Object> getMetadata() {
			return new ResponseEntity<>(jobService.getMetada(), HttpStatus.OK);
		}

/**
 * Rotta che permette di filtrare la lista 
 * 
 * @param filter filtro che si vuole applicare (location, full time, remote)
 * @returnun ArrayList di job filtrato
 * @throws UnexistingFilterException eccezione lanciata se il filtro non esiste
 * @throws WrongArgumentException   eccezione lanciata se l'argomento passato
 *                                    e' errato
 * @throws Exception
 */
@RequestMapping(value = "/jobs", headers = "Authorization=Token dfac007afb1130c8d529e192f72097f254bb4fa2" , method = RequestMethod.POST)
public ResponseEntity<ArrayList<Job>> getFilteredJobs(@RequestBody Object filter)
		throws UnexistingFilterException, WrongArgumentException, Exception {
	return new ResponseEntity<>(CO.COColumn(filter), HttpStatus.CREATED);
}


/** rotta per calcolare le statistiche sui lavori part time, remoto e in presenza
 *  
 *@return restituisce le statistiche
 * 
 */


@RequestMapping(value = "/stats", headers = "Authorization=Token dfac007afb1130c8d529e192f72097f254bb4fa2" , method = RequestMethod.GET)
public ResponseEntity<Object> getStats()
		throws UnexistingFilterException, WrongArgumentException, Exception {
	     return new ResponseEntity<>(jobService.getStats(), HttpStatus.OK);
}




}
	