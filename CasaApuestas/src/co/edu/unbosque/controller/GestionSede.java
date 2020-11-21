package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.SedeCasaApuesta;
import co.edu.unbosque.persistencia.PersistenciaSede;

public class GestionSede {

	private PersistenciaSede persistencia;
	private List<SedeCasaApuesta> listaSede = new ArrayList<>();

	public GestionSede() {
		persistencia = new PersistenciaSede();
		this.listaSede = persistencia.leerArchivo();
	}

	public boolean crearSede(SedeCasaApuesta objApostador) {
		try {
			this.listaSede.add(objApostador);
			persistencia.guardarEnArchivo(this.listaSede);
			this.listaSede = persistencia.leerArchivo();
			GestionCasaApuesta.getInstance().getCasa().setNumeroSede(this.listaSede.size());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public SedeCasaApuesta buscarPorNombre(String nombre) {
		SedeCasaApuesta objSede = null;
		for(SedeCasaApuesta sede : this.listaSede){
			if(sede.getNombreCasaApuesta().equalsIgnoreCase(nombre)) {
				objSede = sede;
				break;
			}
		}
		return objSede;
	}

	public void actualizarSede(SedeCasaApuesta objSede, SedeCasaApuesta objOldSede) {
		int index = this.listaSede.indexOf(objOldSede);
		this.listaSede.set(index, objSede);
		persistencia.guardarEnArchivo(this.listaSede);
	}

	public List<SedeCasaApuesta> listarSedes() {
		this.listaSede = persistencia.leerArchivo();
		GestionCasaApuesta.getInstance().getCasa().setNumeroSede(this.listaSede.size());
		return this.listaSede;
	}

	public void eliminarSede(SedeCasaApuesta sede) {
		this.listaSede.remove(this.listaSede.indexOf(sede));
		persistencia.guardarEnArchivo(this.listaSede);

	}
}
