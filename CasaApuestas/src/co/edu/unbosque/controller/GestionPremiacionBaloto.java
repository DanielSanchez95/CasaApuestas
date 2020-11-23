package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.PremioBalotoModel;
import co.edu.unbosque.persistencia.PersistenciaPremiacionBaloto;

public class GestionPremiacionBaloto {
	
	private PersistenciaPremiacionBaloto persistencia;
	private List<PremioBalotoModel> listaPremio= new ArrayList<>();

	/**
	 * Instancia el objeto PersistenciaPremiacionBaloto
	 * Llena la lista con los resultados del archivo
	 */
	public GestionPremiacionBaloto() {
		persistencia = new PersistenciaPremiacionBaloto();
		this.listaPremio = persistencia.leerArchivo();
	}


	/**
	 * Se encarga de crear un Premio Baloto
	 * Recibe un objeto Premio Baloto
	 */
	public boolean crearPremioBaloto(PremioBalotoModel objJuego) {
		//Lista los premios de baloto existentes
		this.listaPremio = this.listarPremioBaloto();
		//Agrega a la lista el objeto que recibe
		listaPremio.add(objJuego);
		//Guarda el listado de premios en el archivo
		if(persistencia.guardarEnArchivo(listaPremio)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Se encarga de leer el archivo y devuelve el listado de Premios Baloto
	 */
	public List<PremioBalotoModel> listarPremioBaloto(){
		return persistencia.leerArchivo();
	}
}
