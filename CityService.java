package it.univpm.demoSpringBoot.service;

import java.util.Collection;
import it.univpm.demoSpringBoot.model.City;
public interface CityService {
	public abstract void createCity(City city);
	public abstract void updateCity(Integer id, City city);
	public abstract void deleteCity(Integer id);
	public abstract Collection<City> getCities();

}
