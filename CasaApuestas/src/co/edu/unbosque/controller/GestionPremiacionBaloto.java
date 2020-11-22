package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.model.PremioBalotoModel;
import co.edu.unbosque.persistencia.PersistenciaBaloto;
import co.edu.unbosque.persistencia.PersistenciaPremiacionBaloto;

public class GestionPremiacionBaloto {
	
	private PersistenciaPremiacionBaloto persistencia;
	private List<PremioBalotoModel> listaPremio= new ArrayList<>();

	public GestionPremiacionBaloto() {
		persistencia = new PersistenciaPremiacionBaloto();
		this.listaPremio = persistencia.leerArchivo();
	}

	public boolean crearBaloto(PremioBalotoModel objJuego) {
		this.listaPremio = this.listarPremioBaloto();
		listaPremio.add(objJuego);
		if(persistencia.guardarEnArchivo(listaPremio)) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<PremioBalotoModel> listarPremioBaloto(){
		return persistencia.leerArchivo();
	}
}
