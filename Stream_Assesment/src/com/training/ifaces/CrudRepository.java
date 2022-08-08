package com.training.ifaces;

import com.training.Country;
import java.util.*;

public interface CrudRepository {
	public Country add(Country con);
	public Country findByPlace(String Place);
	public Country findAll();
	public Country findPopulation();
}
