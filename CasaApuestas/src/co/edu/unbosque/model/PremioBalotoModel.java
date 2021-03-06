package co.edu.unbosque.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class PremioBalotoModel implements Serializable {

	private Date fecha;
	private Long numero;
	private String signo;
	private List<String> listaGanadores;
	
	public PremioBalotoModel() {
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	
	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	public List<String> getListaGanadores() {
		return listaGanadores;
	}

	public void setListaGanadores(List<String> listaGanadores) {
		this.listaGanadores = listaGanadores;
	}
	
}
