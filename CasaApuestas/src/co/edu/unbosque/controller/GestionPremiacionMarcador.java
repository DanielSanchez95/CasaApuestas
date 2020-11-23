package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.PremioMarcadorModel;
import co.edu.unbosque.persistencia.PersistenciaPremiacionMarcador;

public class GestionPremiacionMarcador {

	private PersistenciaPremiacionMarcador persistencia;
	private List<PremioMarcadorModel> listaPremio = new ArrayList<>();

	/**
	 * Instancia el objeto PersistenciaPremiacionMarcador Llena la lista con los
	 * resultados del archivo
	 */
	public GestionPremiacionMarcador() {
		persistencia = new PersistenciaPremiacionMarcador();
		this.listaPremio = persistencia.leerArchivo();
	}

	/**
	 * Se encarga de crear un Premio Marcadores Recibe un objeto Premio Marcadores
	 */
	public boolean crearPremioMarcador(PremioMarcadorModel objJuego) {
		// Lista los premios de Marcador existentes
		this.listaPremio = this.listarPremioMarcador();
		// Agrega a la lista el objeto que recibe
		listaPremio.add(objJuego);
		// Guarda el listado de premios en el archivo
		if (persistencia.guardarEnArchivo(listaPremio)) {
			return true;
		} else {
			return false;
		}
	}

	// Se encarga de leer el archivo y devuelve el listado de premios marcadores
	public List<PremioMarcadorModel> listarPremioMarcador() {
		return persistencia.leerArchivo();
	}
}
