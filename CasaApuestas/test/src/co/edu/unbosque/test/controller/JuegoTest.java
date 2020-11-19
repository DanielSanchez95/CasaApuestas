package co.edu.unbosque.test.controller;

import java.util.List;

import co.edu.unbosque.controller.GestionCasaApuesta;
import co.edu.unbosque.controller.GestionJuegos;
import co.edu.unbosque.model.CasaApuesta;
import co.edu.unbosque.model.Juego;
import junit.framework.TestCase;

public class JuegoTest extends TestCase {

	GestionJuegos gestionJuegos;
	GestionCasaApuesta objGestionCasaApuesta;

	public JuegoTest() {
		gestionJuegos = new GestionJuegos();
	}

	public void testLeerJuego() {
		List<Juego> listaJuego = gestionJuegos.listarJuego();
	}

	public void testCrearJuego() {
		objGestionCasaApuesta.getInstance().asignarPresupuesto(2000000);
		CasaApuesta objCasa = objGestionCasaApuesta.getInstance().getCasa();
		
		Juego objJuego = new Juego();
		objJuego.setNombreJuego("Super astro");
		objJuego.setTipoJuego(objJuego.CHANCE);
		objJuego.setPresupuestoJuego(1000000);
		gestionJuegos.crearJuegos(objJuego);
	}

}
