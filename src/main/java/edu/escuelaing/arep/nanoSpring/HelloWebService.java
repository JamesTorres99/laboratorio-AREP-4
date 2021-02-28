package edu.escuelaing.arep.nanoSpring;

import edu.escuelaing.arep.nanoSpring.RequestMapping;

/**
 * Clase de servicio web controller
 * @author Alexander Torres
 *
 */
public class HelloWebService {
	
	/**
	 * indice de busqueda
	 * @return string de busqueda
	 */
	@RequestMapping(value="/hellomundo")
	public String index() {
		return "hola mundo";	
	}	
	
}
