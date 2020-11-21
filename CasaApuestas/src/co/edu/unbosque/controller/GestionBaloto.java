package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.persistencia.PersistenciaBaloto;

public class GestionBaloto {
	
	private PersistenciaBaloto persistencia;
	private List<Baloto> listaSuperAstro= new ArrayList<>();

	public GestionBaloto() {
		persistencia = new PersistenciaBaloto();
		this.listaSuperAstro = persistencia.leerArchivo();
	}

	public boolean crearBaloto(Baloto objJuego) {
		this.listaSuperAstro = this.listarJuego();
		listaSuperAstro.add(objJuego);
		if(persistencia.guardarEnArchivo(listaSuperAstro)) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<Baloto> listarJuego(){
		return persistencia.leerArchivo();
	}
}
