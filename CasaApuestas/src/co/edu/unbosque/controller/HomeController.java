package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Apostador;
import co.edu.unbosque.model.CasaApuesta;
import co.edu.unbosque.model.Juego;
import co.edu.unbosque.view.Apostadores;
import co.edu.unbosque.view.Apuestas;
import co.edu.unbosque.view.FormCrearApostador;
import co.edu.unbosque.view.FormCrearJuego;
import co.edu.unbosque.view.FormCrearSede;
import co.edu.unbosque.view.HomeCasaApuesta;
import co.edu.unbosque.view.Inicio;
import co.edu.unbosque.view.Juegos;
import co.edu.unbosque.view.Sedes;

public class HomeController implements ActionListener {

	private Inicio inicio;
	private HomeCasaApuesta home;
	private Apuestas apuestas;
	private Apostadores apostadores;
	private Juegos juegos;
	private Sedes sedes;
	private FormCrearJuego formCrearJuego;
	private FormCrearSede formCrearSede;
	private FormCrearApostador formCrearApostador;

	public HomeController() {
		super();
		inicio = new Inicio(this);
		inicio.setVisible(true);
		home = new HomeCasaApuesta(this);
		home.setVisible(false);
		sedes = new Sedes(this);
		sedes.setVisible(false);
		apostadores = new Apostadores(this);
		apostadores.setVisible(false);
		apuestas = new Apuestas(this);
		apuestas.setVisible(false);
		juegos = new Juegos(this);
		juegos.setVisible(false);
		formCrearJuego = new FormCrearJuego(this);
		formCrearJuego.setVisible(false);
		formCrearSede = new FormCrearSede(this);
		formCrearSede.setVisible(false);
		formCrearApostador = new FormCrearApostador(this);
		formCrearApostador.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (inicio.getBtnRegistrar() == e.getSource()) {
				GestionCasaApuesta.getInstance()
						.asignarPresupuesto(Double.parseDouble(inicio.getTxtPresupuesto().getText()));
				CasaApuesta obj = GestionCasaApuesta.getInstance().getCasa();
				inicio.setVisible(false);
				home.setVisible(true);
			} else if (home.getBtnJuegos() == e.getSource()) {
				inicio.setVisible(false);
				juegos.setVisible(true);
			} else if (home.getBtnSedes() == e.getSource()) {
				inicio.setVisible(false);
				sedes.setVisible(true);
			} else if (home.getBtnApostadores() == e.getSource()) {
				inicio.setVisible(false);
				apostadores.setVisible(true);
			} else if (home.getBtnApuestas() == e.getSource()) {
				inicio.setVisible(false);
				apuestas.setVisible(true);
			} else if (juegos.getBtnOpenCrearJuego() == e.getSource()) {
				formCrearJuego.setVisible(true);
				juegos.setVisible(false);
			} else if (formCrearJuego.getBtnCreatJuego() == e.getSource()) {
				try {
					GestionJuegos objGestJuegos = new GestionJuegos();
					Juego objJuego = new Juego();
					boolean juegoValido = true;
					if (campoDiligenciado(formCrearJuego.getTxtNombreJuego().getText())) {
						objJuego.setNombreJuego(formCrearJuego.getTxtNombreJuego().getText());
					} else {
						juegoValido = false;
					}
					if (campoDiligenciado(formCrearJuego.getTxtPresupuestoJuego().getText())) {
						objJuego.setPresupuestoJuego(
								Double.parseDouble(formCrearJuego.getTxtPresupuestoJuego().getText()));
					} else {
						juegoValido = false;
					}
					objJuego.setTipoJuego(String.valueOf(formCrearJuego.getTxtTipoJuego().getSelectedItem()));
					if (juegoValido) {
						if (objGestJuegos.crearJuegos(objJuego)) {
							formCrearJuego.setVisible(false);
							juegos.setVisible(true);
							JOptionPane.showMessageDialog(null, "Juego creado con exito", "Exitoso", 2);
							juegos.cargarJuegos();
						} else {
							JOptionPane.showMessageDialog(null, "El presupuesto del juego supera los limites", "Error",
									2);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Debe diligenciar todos los campos", "Error", 2);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Presupuesto invalido", "Error", 2);
				}
			} else if (sedes.getBtnAbrirCrearSede() == e.getSource()) {
				formCrearSede.setVisible(true);
				sedes.setVisible(false);
			} else if (apostadores.getBtnAbrirCrearApostador() == e.getSource()) {
				formCrearApostador.setVisible(true);
				apostadores.setVisible(false);
			} else if (formCrearApostador.getBtnCreatApostador() == e.getSource()) {
				try {
					boolean apostadorValido = true;

					GestionApostador objGestionApostador = new GestionApostador();
					Apostador objApostador = new Apostador();
					if (campoDiligenciado(formCrearApostador.getTxtCedula().getText())) {
						objApostador.setCedula(Long.parseLong(formCrearApostador.getTxtCedula().getText()));
					} else {
						apostadorValido = false;
					}
					if (campoDiligenciado(formCrearApostador.getTxtNombre().getText())) {
						objApostador.setNombre(formCrearApostador.getTxtNombre().getText());
					} else {
						apostadorValido = false;
					}
					if (campoDiligenciado(formCrearApostador.getTxtCelular().getText())) {
						objApostador.setCelular(Long.parseLong(formCrearApostador.getTxtCelular().getText()));
					} else {
						apostadorValido = false;
					}
					if (campoDiligenciado(formCrearApostador.getTxtDireccion().getText())) {
						objApostador.setDireccion(formCrearApostador.getTxtDireccion().getText());
					} else {
						apostadorValido = false;
					}
					objApostador.setSede(String.valueOf(formCrearApostador.getTxtSede().getSelectedItem()));
					if (apostadorValido) {
						if (objGestionApostador.crearApostador(objApostador)) {
							formCrearApostador.setVisible(false);
							apostadores.setVisible(true);
							JOptionPane.showMessageDialog(null, "Apostador creado con exito", "Exitoso", 2);
							apostadores.cargarApostadores();
						} else {
							JOptionPane.showMessageDialog(null, "Error a crear apostador", "Error", 2);
						}
					}else {
						JOptionPane.showMessageDialog(null, "Debe diligenciar todos los campos", "Error", 2);
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error creando Apostador", "Error", 2);
				}
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Presupuesto invalido", "Error", 2);
		}
	}

	public boolean campoDiligenciado(String a) {
		if (a.equals("")) {
			return false;
		} else {
			return true;
		}
	}

}
