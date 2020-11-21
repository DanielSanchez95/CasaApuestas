package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Marcadores;
import co.edu.unbosque.persistencia.PersistenciaMarcador;

public class GestionMarcador {
	
	private PersistenciaMarcador persistencia;
	private List<Marcadores> listaSuperAstro= new ArrayList<>();

	public GestionMarcador() {
		persistencia = new PersistenciaMarcador();
		this.listaSuperAstro = persistencia.leerArchivo();
	}

	public boolean crearMarcador(Marcadores objJuego) {
		this.listaSuperAstro = this.listarJuego();
		listaSuperAstro.add(objJuego);
		if(persistencia.guardarEnArchivo(listaSuperAstro)) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<Marcadores> listarJuego(){
		return persistencia.leerArchivo();
	}
}
