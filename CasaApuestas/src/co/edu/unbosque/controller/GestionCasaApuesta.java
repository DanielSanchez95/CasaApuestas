package co.edu.unbosque.controller;

import co.edu.unbosque.model.CasaApuesta;
import co.edu.unbosque.persistencia.ReadProperties;

public class GestionCasaApuesta {

	private static GestionCasaApuesta instance;
	private static final CasaApuesta casa = new CasaApuesta();

	private GestionCasaApuesta() {
	}

	/**
	 * Asigna el presupuesto a la instacion de la casa de apuestas
	 */
	public void asignarPresupuesto(double presupuesto) {
		casa.setPresupuestoPremiacion(presupuesto);
	}

	/**
	 * Actualiza en instancia el numero de sedes que tiene la casa de apuestas
	 */
	public void numeroSedes(int varNumeroSedes) {
		casa.setNumeroSede(varNumeroSedes);
	}

	/**
	 * Retorna la instacion del objeto CasaDeApuestas
	 */
	public CasaApuesta getCasa() {
		return casa;
	}

	/**
	 * Retorna la instacion del objeto CasaDeApuestas
	 */
	public static GestionCasaApuesta getInstance() {
		//Valida si la instancia es nula
		if (instance == null) {
			//Si es nula crea una unstancia nueva y setea los datos por defecto
			instance = new GestionCasaApuesta();
			ReadProperties read = new ReadProperties();
			casa.setNombreCasaApuesta(read.readProperties("property.nombre"));
			casa.setNumeroSede(0);
		}
		return instance;
	}

}
