package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.SedeCasaApuesta;
import co.edu.unbosque.persistencia.PersistenciaSede;

public class GestionSede {

	private PersistenciaSede persistencia;
	private List<SedeCasaApuesta> listaSede = new ArrayList<>();

	/**
	 * Instancia el objeto PersistenciaSede
	 * Llena la lista con los resultados del archivo
	 */
	public GestionSede() {
		persistencia = new PersistenciaSede();
		this.listaSede = persistencia.leerArchivo();
	}


	/**
	 * Se encarga de crear una Sede
	 * Recibe un objeto Sede
	 */
	public boolean crearSede(SedeCasaApuesta objApostador) {
		try {
			// Agrega a la lista el objeto que recibe
			this.listaSede.add(objApostador);
			// Guarda en el archivo la lista con el nuevo objeto
			persistencia.guardarEnArchivo(this.listaSede);
			//Actualiza la lista con los registros del archivo
			this.listaSede = persistencia.leerArchivo();
			//Actualiza en la instacia de casa el numero de sedes
			GestionCasaApuesta.getInstance().getCasa().setNumeroSede(this.listaSede.size());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Se encarga de buscar una sede por nombre
	 */
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

	/**
	 * Se encarga de actualizar una sede
	 */
	public void actualizarSede(SedeCasaApuesta objSede, SedeCasaApuesta objOldSede) {
		int index = this.listaSede.indexOf(objOldSede);
		this.listaSede.set(index, objSede);
		persistencia.guardarEnArchivo(this.listaSede);
	}

	/**
	 * Se encarga de leer el archivo y devuelve el listado de sedes
	 */
	public List<SedeCasaApuesta> listarSedes() {
		this.listaSede = persistencia.leerArchivo();
		GestionCasaApuesta.getInstance().getCasa().setNumeroSede(this.listaSede.size());
		return this.listaSede;
	}

	/**
	 * Se encarga de eliminar una sede
	 */
	public void eliminarSede(SedeCasaApuesta sede) {
		this.listaSede.remove(this.listaSede.indexOf(sede));
		persistencia.guardarEnArchivo(this.listaSede);

	}
}
