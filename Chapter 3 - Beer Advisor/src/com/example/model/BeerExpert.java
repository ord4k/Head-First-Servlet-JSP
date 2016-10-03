package com.example.model2;
import java.util.*;

public class BeerExpert {
	public List getBrands(String color) {
		List brands = new ArrayList();
		if (color.equals("amber")) {
			brands.add("Jack AMber");
			brands.add("Red Moose");
		}
		else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
				
		}
		return(brands);
				
	}
}
