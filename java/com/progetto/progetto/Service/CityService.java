package com.progetto.progetto.Service;
import com.progetto.progetto.Model.City;
import java.util.Collection;
/**classe che definisce le operazioni possibili per ogni città
 * 
 *@param id
 *@param name 
 */

public interface CityService {
		public abstract void createCity(City city);
		public abstract void updateCity(Integer id, City city);
		public abstract void deleteCity(Integer id);
		public abstract Collection<City> getCities();

}


