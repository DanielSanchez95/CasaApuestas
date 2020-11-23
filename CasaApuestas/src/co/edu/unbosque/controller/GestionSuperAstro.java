package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.SuperAstro;
import co.edu.unbosque.persistencia.PersistenciaSuperAstro;

public class GestionSuperAstro {
	
	private PersistenciaSuperAstro persistencia;
	private List<SuperAstro> listaSuperAstro= new ArrayList<>();

	/**
	 * Instancia el objeto PersistenciaSuperAstro
	 * Llena la lista con los resultados del archivo
	 */
	public GestionSuperAstro() {
		persistencia = new PersistenciaSuperAstro();
		this.listaSuperAstro = persistencia.leerArchivo();
	}


	/**
	 * Se encarga de crear un Super Astro
	 * Recibe un objeto Super Astro
	 */
	public boolean crearSuperAstro(SuperAstro objJuego) {
		//Actualiza el listado de superAstro
		this.listaSuperAstro = this.listarJuego();
		// Agrega a la lista el objeto que recibe
		this.listaSuperAstro.add(objJuego);
		// Guarda en el archivo la lista con el nuevo objeto
		if(persistencia.guardarEnArchivo(listaSuperAstro)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Se encarga de leer el archivo y devuelve el listado de Juegos SuperAstro
	 */
	public List<SuperAstro> listarJuego(){
		return persistencia.leerArchivo();
	}
}
