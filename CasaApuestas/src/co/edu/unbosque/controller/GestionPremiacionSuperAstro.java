package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.PremioSuperAstroModel;
import co.edu.unbosque.persistencia.PersistenciaPremiacionSuperAstro;

public class GestionPremiacionSuperAstro {
	
	private PersistenciaPremiacionSuperAstro persistencia;
	private List<PremioSuperAstroModel> listaPremio= new ArrayList<>();

	public GestionPremiacionSuperAstro() {
		persistencia = new PersistenciaPremiacionSuperAstro();
		this.listaPremio = persistencia.leerArchivo();
	}

	public boolean crearPremioSuperAstro(PremioSuperAstroModel objJuego) {
		this.listaPremio = this.listarPremioSuperAstro();
		listaPremio.add(objJuego);
		if(persistencia.guardarEnArchivo(listaPremio)) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<PremioSuperAstroModel> listarPremioSuperAstro(){
		return persistencia.leerArchivo();
	}
}
