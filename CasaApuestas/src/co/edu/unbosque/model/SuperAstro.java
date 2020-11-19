package co.edu.unbosque.model;

public class SuperAstro extends Apuesta {

	public static final String ACUARIO = "acuario";
	public static final String PISCIS = "piscis";
	public static final String ARIES = "aries";
	public static final String TAURO = "tauro";
	public static final String GEMINIS = "geminis";
	public static final String CANCER = "cancer";
	public static final String LEO = "leo";
	public static final String VIRGO = "virgo";
	public static final String LIBRA = "libra";
	public static final String ESCORPIO = "escorpio";
	public static final String SAGITARIO = "sagitario";
	public static final String CAPRICORNIO = "capricornio";
	
	private int numero;
	private String signo;
	
	public SuperAstro() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}
	
	

}
