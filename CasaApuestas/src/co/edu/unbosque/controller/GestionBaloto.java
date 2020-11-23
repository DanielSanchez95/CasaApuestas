package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.persistencia.PersistenciaBaloto;

public class GestionBaloto {
	
	private PersistenciaBaloto persistencia;
	private List<Baloto> listaSuperAstro= new ArrayList<>();

	/**
	 * Instancia el objeto PersistenciaBaloto
	 * Llena la lista con los resultados del archivo
	 */
	public GestionBaloto() {
		persistencia = new PersistenciaBaloto();
		this.listaSuperAstro = persistencia.leerArchivo();
	}

	/**
	 * Recibe un objeto Baloto
	 * Retorna un booleano para el control de los mensajes de notificación
	 */
	public boolean crearBaloto(Baloto objJuego) {
		this.listaSuperAstro = this.listarJuego();
		//Agrega el objeto a la lista
		listaSuperAstro.add(objJuego);
		//Guarda en el archivo la lista
		if(persistencia.guardarEnArchivo(listaSuperAstro)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Lista los balotos registrados
	 */
	public List<Baloto> listarJuego(){
		return persistencia.leerArchivo();
	}
}
