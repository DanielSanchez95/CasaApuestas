package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Marcadores;
import co.edu.unbosque.persistencia.PersistenciaMarcador;

public class GestionMarcador {
	
	private PersistenciaMarcador persistencia;
	private List<Marcadores> listaMarcadores= new ArrayList<>();

	/**
	 * Instancia el objeto PersistenciaMarcador
	 * Llena la lista con los resultados del archivo
	 */
	public GestionMarcador() {
		persistencia = new PersistenciaMarcador();
		this.listaMarcadores = persistencia.leerArchivo();
	}

	
	/**
	 * Se encarga de crear un Marcador 
	 * Recibe un objeto Marcador
	 */
	public boolean crearMarcador(Marcadores objJuego) {
		//Llama el metodo listarMarcadores
		this.listaMarcadores = this.listarMarcadores();
		//Agrega a la lusta el objeti recibido
		listaMarcadores.add(objJuego);
		//Se guarda en el archivo la lista con el nuevo objeto si todo es exitoso retorna tru de lo contrario false
		if(persistencia.guardarEnArchivo(listaMarcadores)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Se encarga de leer el archivo y devuelve el listado de marcadores
	 */
	public List<Marcadores> listarMarcadores(){
		return persistencia.leerArchivo();
	}
}
