package edu.escuelaing.arep.nanoSpring;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que se encarga de cargar la pagina web usando anotaciones
 * @author Alexander Torres
 *
 */
public class NanoSpring {
	private static NanoSpring _instance= new NanoSpring();
	private boolean componentLoaded=false;
	private Map<String, Method> componentsRoute;
	
	
	/**
	 * Constructor de la clase NanoSpring la cual permite almacenar en el hashMap 
	 */
	public NanoSpring() {
		componentsRoute= new HashMap<>();
	}

	
	public void run(String[] args) {
		if (_instance.componentLoaded) {
			
			try {
				_instance.loadComponents(args);
				_instance.componentLoaded=true;
				_instance.startServer();
				
			}catch(ClassNotFoundException ex) {
				Logger.getLogger(NanoSpring.class.getName()).log(Level.SEVERE, "aqui");
			}
		}

	}

	private void startServer() {
		
	}

	/**
	 * Carga los componentes 
	 * @param args listado de classpath
	 * @throws ClassNotFoundException excepcion de no encontrar lo solicitado
	 */
	private void loadComponents(String[] args) throws ClassNotFoundException {
		
		for (String classpath : args) {
			for (Method m : Class.forName(classpath).getMethods()) {
				System.out.println("revisando: " + m.getName());
				if (m.isAnnotationPresent(RequestMapping.class)) {
					System.out.println("ENCONTRO UN REQUESTMAPPING");
					componentsRoute.put(m.getAnnotation(RequestMapping.class).value(),m);
				}
			}
		}
	}
	
	
	 public  String invoke(String path) throws InvocationTargetException, IllegalAccessException {
	        return componentsRoute.get(path).invoke(null).toString();
	    }
}