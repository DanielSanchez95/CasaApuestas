package co.edu.unbosque.model;

import java.io.Serializable;

public class CasaApuesta implements Serializable{

	private String nombreCasaApuesta;
	private int numeroSede;
	private double presupuestoPremiacion;
	
	public CasaApuesta() {
	}
	
	

	public String getNombreCasaApuesta() {
		return nombreCasaApuesta;
	}

	public void setNombreCasaApuesta(String nombreCasaApuesta) {
		this.nombreCasaApuesta = nombreCasaApuesta;
	}

	public int getNumeroSede() {
		return numeroSede;
	}

	public void setNumeroSede(int numeroSede) {
		this.numeroSede = numeroSede;
	}

	public double getPresupuestoPremiacion() {
		return presupuestoPremiacion;
	}

	public void setPresupuestoPremiacion(double presupuestoPremiacion) {
		this.presupuestoPremiacion = presupuestoPremiacion;
	}

}
