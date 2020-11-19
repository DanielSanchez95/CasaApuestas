package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Apostador;
import co.edu.unbosque.persistencia.PersistenciaApostador;

public class GestionApostador {

	private PersistenciaApostador persistencia;
	private List<Apostador> listaApostadores = new ArrayList<>();
	
	public GestionApostador() {
		persistencia = new PersistenciaApostador();
		this.listaApostadores = persistencia.leerArchivo();
	}
	
	public boolean crearApostador(Apostador objApostador) {
		if(buscarPorCedula(objApostador.getCedula()) == null) {
			this.listaApostadores.add(objApostador);
			persistencia.guardarEnArchivo(this.listaApostadores);
			return true;
		}else {
			return false;
		}
	}
	
	public Apostador buscarPorCedula(long cedula) {
		Apostador objApostador = null;
		for(Apostador apostador : this.listaApostadores){
			if(apostador.getCedula()==cedula) {
				objApostador = apostador;
				break;
			}
		}
		return objApostador;
	}
	
	public void actualizarApostador(Apostador anteriorApostador, Apostador nuevoApostador) {
		int index = this.listaApostadores.indexOf(anteriorApostador);
		this.listaApostadores.set(index, nuevoApostador);
		persistencia.guardarEnArchivo(this.listaApostadores);
	}
	
	public List<Apostador> listarApostadores() {
		return this.listaApostadores;
	}
	
	public void eliminarApostador(Apostador apostador) {
		this.listaApostadores.remove(this.listaApostadores.indexOf(apostador));
		persistencia.guardarEnArchivo(this.listaApostadores);

	}
}
