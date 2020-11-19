package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.persistencia.PersistenciaJuego;

public class GestionJuegos {

	private PersistenciaJuego persistencia;
	private List<Juego> listaJuego = new ArrayList<>();

	public GestionJuegos() {
		persistencia = new PersistenciaJuego();
		this.listaJuego = persistencia.leerArchivo();
	}

	public boolean crearJuegos(Juego objJuego) {
		double presupuestoTotal = 0;
		this.listarJuego();
		for (Juego juego : this.listaJuego) {
			presupuestoTotal = presupuestoTotal + juego.getPresupuestoJuego();
		}
		presupuestoTotal = presupuestoTotal + objJuego.getPresupuestoJuego();
		if (presupuestoTotal <= GestionCasaApuesta.getInstance().getCasa().getPresupuestoPremiacion()) {
			this.listaJuego.add(objJuego);
			persistencia.guardarEnArchivo(this.listaJuego);
			return true;
		}
		return false;
	}
	
	public List<Juego> listarJuego(){
		return persistencia.leerArchivo();
	}

}
