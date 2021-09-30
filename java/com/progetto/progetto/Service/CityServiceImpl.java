package com.progetto.progetto.Service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.progetto.progetto.Model.City;


@Service
public class CityServiceImpl implements CityService{
	private static Map<Integer, City> cityRepo = new HashMap<>();
	private final AtomicLong counter = new AtomicLong();//setta in automatico l'id progressivo
	
/**lista delle 5 città 
 * @param City
 */
	public CityServiceImpl() {
		City London = new City();
		London.setId((int) counter.incrementAndGet());
		London.setName("New York");
		cityRepo.put(London.getId(), London);
		
		City Washingon = new City();
		Washingon.setId((int) counter.incrementAndGet());
		Washingon.setName("Washington");
		cityRepo.put(Washingon.getId(), Washingon);
		
		City Newark = new City();
		Newark.setId((int) counter.incrementAndGet());
		Newark.setName("Newark");
		cityRepo.put(Newark.getId(), Newark);
		

		City Venice = new City();
	    Venice.setId((int) counter.incrementAndGet());
	    Venice.setName("Venice");
		cityRepo.put(Venice.getId(), Venice);
		 
		City Chicago = new City();
		Chicago.setId((int) counter.incrementAndGet());
		Chicago.setName("Venice");
		cityRepo.put(Chicago.getId(), Chicago);
		
	}

	@Override
	
	 
	public void createCity(City city) {
		//controllo se quel prodotto esiste nella hashmap
		if(cityRepo.containsKey(city.getId())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Existing id...");
		}
		cityRepo.put(city.getId(), city);	// se non esiste, allora lo aggiungo alla hashmap
	}

	@Override
	public void updateCity(Integer id, City city) {
		cityRepo.remove(id);	// rimuovo l'elemento dall'hashmap
		city.setId(id);
		cityRepo.put(id, city);	
	}

	@Override
	public void deleteCity(Integer id) {
		cityRepo.remove(id);
	}

	@Override
	public Collection<City> getCities() {
		return cityRepo.values();	//lista di tutte le città
	}
}

