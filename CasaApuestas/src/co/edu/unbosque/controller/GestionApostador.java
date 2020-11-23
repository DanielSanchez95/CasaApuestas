package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Apostador;
import co.edu.unbosque.persistencia.PersistenciaApostador;

public class GestionApostador {

	private PersistenciaApostador persistencia;
	private List<Apostador> listaApostadores = new ArrayList<>();
	
	/**
	 * Instancia el objeto PersistenciaApostador
	 * Llena la lista con los resultados del archivo
	 */
	public GestionApostador() {
		persistencia = new PersistenciaApostador();
		this.listaApostadores = persistencia.leerArchivo();
	}
	
	/**
	 * Recibe un objeto apostador
	 * Retorna un booleano para el control de los mensajes de notificación
	 */
	public boolean crearApostador(Apostador objApostador) {
		// Busca si el apostador existe, filtra por cedula
		if(buscarPorCedula(objApostador.getCedula()) == null) {
			//Agrega a la lista el objeto del apostador
			this.listaApostadores.add(objApostador);
			//Guarda el apostador
			persistencia.guardarEnArchivo(this.listaApostadores);
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Recibe la cedula
	 */
	public Apostador buscarPorCedula(long cedula) {
		//Instancia el objeto nulo para controlar los mensajes de notificacion
		Apostador objApostador = null;
		//Itera el listado de apostadores
		for(Apostador apostador : this.listaApostadores){
			//filtra si el la cedula que recibio el metodo sea igual a la del objeto de la lista
			if(apostador.getCedula()==cedula) {
				//Si encuentra un resultado setea el objeto para retornar y termina la iteración
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
	
	/*
	 * Retorna la lista de apostadores
	 */
	public List<Apostador> listarApostadores() {
		return this.listaApostadores;
	}
	

	/*
	 * Recibe el objeto apostador
	 */
	public void eliminarApostador(Apostador apostador) {
		//Elimina el apostador de la lista de apostadores
		this.listaApostadores.remove(this.listaApostadores.indexOf(apostador));
		//Guarda en el archivo el listado sin el objeto eliminado
		persistencia.guardarEnArchivo(this.listaApostadores);

	}
}
