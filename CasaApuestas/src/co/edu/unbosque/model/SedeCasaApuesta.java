package co.edu.unbosque.model;

import java.io.Serializable;

public class SedeCasaApuesta extends CasaApuesta implements Serializable{

	private String ubicacion;
	private int numeroEmpleados;
	
	public SedeCasaApuesta() {
		super();
	}
	
	public SedeCasaApuesta(String ubicacion, int numeroEmpleados) {
		super();
		this.ubicacion = ubicacion;
		this.numeroEmpleados = numeroEmpleados;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}
	
	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}

}
