package co.edu.unbosque.model;

import java.util.Date;

public class Apuesta {

	private Long sede;
	private Long cedula;
	private Date fecha;
	private Long valor;
	
	public Apuesta() {
	}

	public Long getSede() {
		return sede;
	}

	public void setSede(Long sede) {
		this.sede = sede;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	
}
