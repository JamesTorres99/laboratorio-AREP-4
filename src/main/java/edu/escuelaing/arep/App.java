package edu.escuelaing.arep;
import edu.escuelaing.arep.htppServer.HttpServerReto;
import edu.escuelaing.arep.nanoSpring.*;

/**
 * Hello world!
 *
 */
public class App 
{
		/**
		 * ejecuta el servidor usando anotaciones
		 * @param args listado de anotaciones
		 */
	    public static void main(String[] args){
	        String[] args1=new String[1];
	        args1[0]="edu.escuelaing.arep.nanoSpring.HelloWebService";
	        try {
	        NanoSpring nanoSpring= new NanoSpring();
	        nanoSpring.run(args1);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
