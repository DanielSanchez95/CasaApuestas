package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.persistencia.PersistenciaJuego;

public class GestionJuegos {

	private PersistenciaJuego persistencia;
	private List<Juego> listaJuego = new ArrayList<>();

	/**
	 * Instancia el objeto PersistenciaJuego Llena la lista con los resultados del
	 * archivo
	 */
	public GestionJuegos() {
		persistencia = new PersistenciaJuego();
		this.listaJuego = persistencia.leerArchivo();
	}

	/**
	 * Se encarga de crear un Juego
	 * Recibe un objeto Juego
	 */
	public boolean crearJuegos(Juego objJuego) {
		// crea la variable de presupuesto en 0
		double presupuestoTotal = 0;
		// Actualiza la lista de juegos
		this.listarJuego();

		// Recorre el listado de juegos y suma los presupuestos
		for (Juego juego : this.listaJuego) {
			presupuestoTotal = presupuestoTotal + juego.getPresupuestoJuego();
		}

		// Suma el presupuesto de la lista y el del juego que se va a crear
		presupuestoTotal = presupuestoTotal + objJuego.getPresupuestoJuego();
		// Si el presupuesto total es menos o igual al presupuesto de la casa se crea el
		// juego
		if (presupuestoTotal <= GestionCasaApuesta.getInstance().getCasa().getPresupuestoPremiacion()) {
			this.listaJuego.add(objJuego);
			persistencia.guardarEnArchivo(this.listaJuego);
			return true;
		}
		return false;
	}

	// Lee el archivo y lista los juegos
	public List<Juego> listarJuego() {
		return persistencia.leerArchivo();
	}

}
