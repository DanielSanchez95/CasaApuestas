package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.Date;

public class Apuesta implements Serializable{

	private String sede;
	private Long cedula;
	private Date fecha;
	private Long valor;
	
	public Apuesta() {
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
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
