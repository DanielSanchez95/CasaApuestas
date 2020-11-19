package co.edu.unbosque.model;

import java.io.Serializable;

public class Juego extends CasaApuesta {

	public static final String DEPORTIVO = "deportivo";
	public static final String LOTERIA = "lotería";
	public static final String CHANCE = "chance";
	
	private String nombreJuego;
	private String tipoJuego;
	private double presupuestoJuego;
	
	public Juego() {
		super();
	}

	public Juego(String nombreJuego, String tipoJuego, double presupuestoJuego) {
		this.nombreJuego = nombreJuego;
		this.tipoJuego = tipoJuego;
		this.presupuestoJuego = presupuestoJuego;
	}

	public String getNombreJuego() {
		return nombreJuego;
	}

	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	public String getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuego(String tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	public double getPresupuestoJuego() {
		return presupuestoJuego;
	}

	public void setPresupuestoJuego(double presupuestoJuego) {
		this.presupuestoJuego = presupuestoJuego;
	}
	
	
	
	

}
