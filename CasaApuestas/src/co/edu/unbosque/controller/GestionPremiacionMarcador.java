package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.model.PremioMarcadorModel;
import co.edu.unbosque.persistencia.PersistenciaBaloto;
import co.edu.unbosque.persistencia.PersistenciaPremiacionBaloto;
import co.edu.unbosque.persistencia.PersistenciaPremiacionMarcador;

public class GestionPremiacionMarcador {
	
	private PersistenciaPremiacionMarcador persistencia;
	private List<PremioMarcadorModel> listaPremio= new ArrayList<>();

	public GestionPremiacionMarcador() {
		persistencia = new PersistenciaPremiacionMarcador();
		this.listaPremio = persistencia.leerArchivo();
	}

	public boolean crearPremioMarcador(PremioMarcadorModel objJuego) {
		this.listaPremio = this.listarPremioMarcador();
		listaPremio.add(objJuego);
		if(persistencia.guardarEnArchivo(listaPremio)) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<PremioMarcadorModel> listarPremioMarcador(){
		return persistencia.leerArchivo();
	}
}
