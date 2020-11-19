package co.edu.unbosque.test.controller;

import co.edu.unbosque.controller.GestionCasaApuesta;
import co.edu.unbosque.model.CasaApuesta;
import junit.framework.TestCase;

public class CasaApuestaTest extends TestCase {

	GestionCasaApuesta objGestionCasaApuesta;
	
	public CasaApuestaTest() {
	}
	
	public void testCrearCasa() {
		objGestionCasaApuesta.getInstance().asignarPresupuesto(20000000);
		CasaApuesta obj = objGestionCasaApuesta.getInstance().getCasa();
	}


}
