package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.model.PremioMarcador;
import co.edu.unbosque.persistencia.PersistenciaBaloto;
import co.edu.unbosque.persistencia.PersistenciaPremiacionBaloto;
import co.edu.unbosque.persistencia.PersistenciaPremiacionMarcador;

public class GestionPremiacionMarcador {
	
	private PersistenciaPremiacionMarcador persistencia;
	private List<PremioMarcador> listaPremio= new ArrayList<>();

	public GestionPremiacionMarcador() {
		persistencia = new PersistenciaPremiacionMarcador();
		this.listaPremio = persistencia.leerArchivo();
	}

	public boolean crearPremioMarcador(PremioMarcador objJuego) {
		this.listaPremio = this.listarPremioMarcador();
		listaPremio.add(objJuego);
		if(persistencia.guardarEnArchivo(listaPremio)) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<PremioMarcador> listarPremioMarcador(){
		return persistencia.leerArchivo();
	}
}
