package edu.escuelaing.arep.nanoSpring;

import edu.escuelaing.arep.nanoSpring.RequestMapping;


public class HelloWebService {

	@RequestMapping(value="/hellomundo")
	public String index() {
		return "hola mundo";	
	}	
	
}
