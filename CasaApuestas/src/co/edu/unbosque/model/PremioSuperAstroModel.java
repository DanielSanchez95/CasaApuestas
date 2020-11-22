package co.edu.unbosque.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class PremioSuperAstroModel implements Serializable {

	private Date fecha;
	private Long numero;
	private List<String> listaGanadores;
	
	public PremioSuperAstroModel() {
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

	public List<String> getListaGanadores() {
		return listaGanadores;
	}

	public void setListaGanadores(List<String> listaGanadores) {
		this.listaGanadores = listaGanadores;
	}

	
}
