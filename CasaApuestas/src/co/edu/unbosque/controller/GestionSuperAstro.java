package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.SuperAstro;
import co.edu.unbosque.persistencia.PersistenciaSuperAstro;

public class GestionSuperAstro {
	
	private PersistenciaSuperAstro persistencia;
	private List<SuperAstro> listaSuperAstro= new ArrayList<>();

	public GestionSuperAstro() {
		persistencia = new PersistenciaSuperAstro();
		this.listaSuperAstro = persistencia.leerArchivo();
	}

	public boolean crearSuperAstro(SuperAstro objJuego) {
		this.listaSuperAstro = this.listarJuego();
		this.listaSuperAstro.add(objJuego);
		if(persistencia.guardarEnArchivo(listaSuperAstro)) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<SuperAstro> listarJuego(){
		return persistencia.leerArchivo();
	}
}
