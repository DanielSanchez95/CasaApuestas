package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.PremioSuperAstroModel;
import co.edu.unbosque.persistencia.PersistenciaPremiacionSuperAstro;

public class GestionPremiacionSuperAstro {

	private PersistenciaPremiacionSuperAstro persistencia;
	private List<PremioSuperAstroModel> listaPremio = new ArrayList<>();

	/**
	 * Instancia el objeto PersistenciaPremiacionSuperAstro Llena la lista con los
	 * resultados del archivo
	 */
	public GestionPremiacionSuperAstro() {
		persistencia = new PersistenciaPremiacionSuperAstro();
		this.listaPremio = persistencia.leerArchivo();
	}


	/**
	 * Se encarga de crear un Premio Super Astro
	 * Recibe un objeto Premio Super Astro
	 */
	public boolean crearPremioSuperAstro(PremioSuperAstroModel objJuego) {
		// Lista los premios de Super Astro existentes
		this.listaPremio = this.listarPremioSuperAstro();
		// Agrega a la lista el objeto que recibe
		listaPremio.add(objJuego);
		// Guarda el listado de premios en el archivo
		if (persistencia.guardarEnArchivo(listaPremio)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 *  Se encarga de leer el archivo y devuelve el listado de premios SuperAstro
	 */
	public List<PremioSuperAstroModel> listarPremioSuperAstro() {
		return persistencia.leerArchivo();
	}
}
