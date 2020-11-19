package co.edu.unbosque.test.controller;

import java.util.List;

import co.edu.unbosque.controller.GestionSede;
import co.edu.unbosque.model.Juego;
import co.edu.unbosque.model.SedeCasaApuesta;
import junit.framework.TestCase;

public class SedesTest extends TestCase {

	GestionSede gestionSede;

	public SedesTest() {
		gestionSede = new GestionSede();
	}

	public void testCrearSede() {
		SedeCasaApuesta objSede= new SedeCasaApuesta();
		objSede.setUbicacion("Villa Luz");
		objSede.setNumeroEmpleados(1);
		gestionSede.crearSede(objSede);
	}

	public void testListarSedes() {
		List<SedeCasaApuesta> listaSedes = gestionSede.listarSedes();
	}
	
	public void testEditarSede() {
		SedeCasaApuesta objOldSede= gestionSede.listarSedes().get(0);
		SedeCasaApuesta objSede= new SedeCasaApuesta();
		objSede.setUbicacion("cAstilla");
		objSede.setNumeroEmpleados(2);
		gestionSede.actualizarSede(objSede, objOldSede);
	}
	
	
}
