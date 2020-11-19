package co.edu.unbosque.controller;

import co.edu.unbosque.model.CasaApuesta;
import co.edu.unbosque.persistencia.ReadProperties;

public class GestionCasaApuesta {

	private static GestionCasaApuesta instance;
    private static final CasaApuesta casa = new CasaApuesta();


    private GestionCasaApuesta() {
    }
	
    public void asignarPresupuesto(double presupuesto) {
    	casa.setPresupuestoPremiacion(presupuesto);
    }
    
    public void numeroSedes(int varNumeroSedes) {
    	casa.setNumeroSede(varNumeroSedes);
    }
    
    public CasaApuesta getCasa() {
    	return casa;
    }
    
    public static GestionCasaApuesta getInstance() {
        if (instance == null) {
            instance = new GestionCasaApuesta();
            ReadProperties read = new ReadProperties();
            casa.setNombreCasaApuesta(read.readProperties("property.nombre"));
            casa.setNumeroSede(0);
        }
        return instance;
    }
	
    

}
