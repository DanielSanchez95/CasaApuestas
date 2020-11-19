package co.edu.unbosque.test.controller;

import java.util.List;

import co.edu.unbosque.controller.GestionApostador;
import co.edu.unbosque.model.Apostador;
import junit.framework.TestCase;

public class ApostadorTest extends TestCase {

	GestionApostador objGestionApostador;

	public ApostadorTest() {
		this.objGestionApostador = new GestionApostador();
	}

	public void testListarApostador() {
		List<Apostador> list = objGestionApostador.listarApostadores();
	}
	
	public void testAgregarApostador() {
		Apostador objApostador = new Apostador("Daniel Sanchez", Long.parseLong("4321"), "Sede 2", "Calle falsa 123",
				Long.parseLong("3137654321"));
		objGestionApostador.crearApostador(objApostador);
	}

	public void testEditarApostador() {
		Apostador apostador = objGestionApostador.buscarPorCedula(12345);
		objGestionApostador.actualizarApostador(apostador,
				new Apostador("Daniel Sanchez Vanegas", 12345, "Sede 1", "Calle falsa", Long.parseLong("3131234567")));
	}

	public void testEliminarApostador() {
		Apostador apostador = objGestionApostador.buscarPorCedula(12345);
		objGestionApostador.eliminarApostador(apostador);
	}
}
