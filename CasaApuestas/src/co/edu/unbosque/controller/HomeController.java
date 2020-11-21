package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Apostador;
import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.model.CasaApuesta;
import co.edu.unbosque.model.Juego;
import co.edu.unbosque.model.SedeCasaApuesta;
import co.edu.unbosque.model.SuperAstro;
import co.edu.unbosque.view.Apostadores;
import co.edu.unbosque.view.Apuestas;
import co.edu.unbosque.view.FormCrearApostador;
import co.edu.unbosque.view.FormCrearBaloto;
import co.edu.unbosque.view.FormCrearJuego;
import co.edu.unbosque.view.FormCrearMarcador;
import co.edu.unbosque.view.FormCrearSede;
import co.edu.unbosque.view.FormCrearSuperAstro;
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
	private FormCrearSuperAstro formCrearSuperAstro;
	private FormCrearBaloto formCrearBaloto;
	private FormCrearMarcador formCrearMarcador;

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
		formCrearSuperAstro = new FormCrearSuperAstro(this);
		formCrearSuperAstro.setVisible(false);
		formCrearBaloto = new FormCrearBaloto(this);
		formCrearBaloto.setVisible(false);
		formCrearMarcador = new FormCrearMarcador(this);
		formCrearMarcador.setVisible(false);
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
			}
			// HOMES
			// Home Juegos
			else if (home.getBtnJuegos() == e.getSource()) {
				abrirHomeJuegos();
			}
			// Home Sedes
			else if (home.getBtnSedes() == e.getSource()) {
				abrirHomeSedes();
			}
			// Home Apostadores
			else if (home.getBtnApostadores() == e.getSource()) {
				abrirHomeApostadores();
			}
			// Home Apuestas
			else if (home.getBtnApuestas() == e.getSource()) {
				abrirHomeApuestas();
			}
			// FORMULARIOS
			// Formulario Creacion Juego
			else if (juegos.getBtnOpenCrearJuego() == e.getSource()) {
				abrirFormJuegos();
			}
			// Formulario Creacion Sede
			else if (sedes.getBtnAbrirCrearSede() == e.getSource()) {
				abrirFormSedes();
			}
			// Formulario Creacion Apostador
			else if (apostadores.getBtnAbrirCrearApostador() == e.getSource()) {
				abrirFormApostadores();
			}
			// Formulario Creacion SuperAstro
			else if (apuestas.getBtnAbrirCrearSuperAstro() == e.getSource()) {
				abrirFormSuperAstro();
			}
			// Formulario Creacion Baloto
			else if (apuestas.getBtnAbrirCrearBaloto() == e.getSource()) {
				abrirFormBaloto();
			}
			// Formulario Creacion Marcador
			else if (apuestas.getBtnAbrirCrearMarcador() == e.getSource()) {
				abrirFormMarcador();
			}
			// CREACION
			// Crear Baloto
			else if (formCrearBaloto.getBtnCreatBaloto() == e.getSource()) {
				if (validarCamposBaloto()) {
					if (contruirObjBaloto() != null) {
						GestionBaloto objGestionBaloto = new GestionBaloto();
						if(objGestionBaloto.crearBaloto(contruirObjBaloto())) {
							JOptionPane.showMessageDialog(null, "Baloto creado con exito", "Exitoso", 2);
							cerrarFormBaloto();
							objGestionBaloto.listarJuego();
						}else {
							JOptionPane.showMessageDialog(null, "Error al crear un baloto", "Error", 2);

						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Todos los campos deben ser diligenciados", "Error", 2);
				}
			}
			// Crear SuperAstro
			else if(formCrearSuperAstro.getBtnCreaSuperAstro() == e.getSource()) {
				if(validarCamposSuperAstro()) {
					if(contruirObjSuperAstro()!=null) {
						GestionSuperAstro objGestionSuperAstro = new GestionSuperAstro(); 
						if(objGestionSuperAstro.crearSuperAstro(contruirObjSuperAstro())){
							JOptionPane.showMessageDialog(null, "Super Astro creado con exito", "Exitoso", 2);
							cerrarFormSuperAstro();
							objGestionSuperAstro.listarJuego();
						}else {
							JOptionPane.showMessageDialog(null, "Error al crear un Super Astro", "Error", 2);

						}
					}
				}else {
					JOptionPane.showMessageDialog(null, "Todos los campos deben ser diligenciados", "Error", 2);
				}
			}
			// Crear Sede
			else if (formCrearSede.getBtnCreatSede() == e.getSource()) {
				if (validarCamposSedes()) {
					SedeCasaApuesta objSede = new SedeCasaApuesta();
					objSede.setUbicacion(formCrearSede.getTxtUbicacion().getText());
					objSede.setNumeroEmpleados(Integer.parseInt(formCrearSede.getTxtNumEmpleados().getText()));
					GestionSede objGestionSede = new GestionSede();
					if (objGestionSede.crearSede(objSede)) {
						JOptionPane.showMessageDialog(null, "Sede creada con exito", "Exitoso", 2);
						cerrarFormSedes();
					} else {
						JOptionPane.showMessageDialog(null, "Error al crear un sede", "Error", 2);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Todos los campos deben ser diligenciados", "Error", 2);
				}
			}
			// Crear Juego
			else if (formCrearJuego.getBtnCreatJuego() == e.getSource()) {
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
			}
			// Crear Apostador
			else if (formCrearApostador.getBtnCreatApostador() == e.getSource()) {
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
					} else {
						JOptionPane.showMessageDialog(null, "Debe diligenciar todos los campos", "Error", 2);
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error creando Apostador", "Error", 2);
				}
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Error en la aplicación", "Error", 2);
		}
	}

	public boolean campoDiligenciado(String a) {
		if (a.equals("")) {
			return false;
		} else {
			return true;
		}
	}

	// HOME
	public void abrirHomeJuegos() {
		inicio.setVisible(false);
		juegos.setVisible(true);
	}

	public void abrirHomeSedes() {
		inicio.setVisible(false);
		sedes.setVisible(true);
	}

	public void abrirHomeApostadores() {
		inicio.setVisible(false);
		apostadores.setVisible(true);
	}

	public void abrirHomeApuestas() {
		inicio.setVisible(false);
		apuestas.setVisible(true);
	}

	// FORMULARIOS
	public void abrirFormJuegos() {
		formCrearJuego.setVisible(true);
		juegos.setVisible(false);
	}

	public void abrirFormSedes() {
		formCrearSede.setVisible(true);
		sedes.setVisible(false);
	}

	public void cerrarFormSedes() {
		formCrearSede.setVisible(false);
		sedes.setVisible(true);
		sedes.cargarSedes();
	}

	public void abrirFormApostadores() {
		formCrearApostador.setVisible(true);
		apostadores.setVisible(false);
	}

	public void abrirFormSuperAstro() {
		formCrearSuperAstro.setVisible(true);
		apuestas.setVisible(false);
	}
	
	public void cerrarFormSuperAstro() {
		formCrearSuperAstro.setVisible(false);
		apuestas.setVisible(true);
	}
	

	public void abrirFormBaloto() {
		formCrearBaloto.setVisible(true);
		apuestas.setVisible(false);
	}

	public void cerrarFormBaloto() {
		formCrearBaloto.setVisible(false);
		apuestas.setVisible(true);
	}
	

	public void abrirFormMarcador() {
		formCrearMarcador.setVisible(true);
		apuestas.setVisible(false);
	}

	public boolean validarCamposSedes() {
		boolean camposValidos = true;
		if (!campoDiligenciado(formCrearSede.getTxtUbicacion().getText()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearSede.getTxtNumEmpleados().getText()))
			camposValidos = false;
		return camposValidos;
	}

	public boolean validarCamposBaloto() {
		boolean camposValidos = true;
		if (!campoDiligenciado(formCrearBaloto.getTxtNumero().getText()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearBaloto.getTxtValor().getText()))
			camposValidos = false;

		return camposValidos;
	}

	public boolean validarCamposSuperAstro() {
		boolean camposValidos = true;
		if (!campoDiligenciado(formCrearSuperAstro.getTxtNumero().getText()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearSuperAstro.getTxtValor().getText()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearSuperAstro.getTxtSigno().getSelectedItem().toString()))
			camposValidos = false;

		return camposValidos;
	}

	public Baloto contruirObjBaloto() {
		try {
			Baloto objBaloto = new Baloto();
			objBaloto.setCedula(Long.parseLong(formCrearBaloto.getTxtCedula().getSelectedItem().toString()));
			objBaloto.setSede(formCrearBaloto.getTxtSede().getSelectedItem().toString());
			objBaloto.setFecha(new Date());
			objBaloto.setValor(Long.parseLong(formCrearBaloto.getTxtValor().getText()));
			objBaloto.setNumero(Long.parseLong(formCrearBaloto.getTxtNumero().getText()));
			if (formCrearBaloto.getTxtNumero().getText().length() != 14) {
				JOptionPane.showMessageDialog(null, "El numero de baloto es invalido debe ser de 14 digitos", "Error",
						2);
				return null;
			}
			return objBaloto;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El valor o numero de baloto son invalidos", "Error", 2);
			return null;
		}
	}
	
	public SuperAstro contruirObjSuperAstro() {
		try {
			SuperAstro objSuperAstro = new SuperAstro();
			objSuperAstro.setCedula(Long.parseLong(formCrearSuperAstro.getTxtCedula().getSelectedItem().toString()));
			objSuperAstro.setSede(formCrearSuperAstro.getTxtSede().getSelectedItem().toString());
			objSuperAstro.setFecha(new Date());
			objSuperAstro.setValor(Long.parseLong(formCrearSuperAstro.getTxtValor().getText()));
			objSuperAstro.setNumero(Integer.parseInt(formCrearSuperAstro.getTxtNumero().getText()));
			objSuperAstro.setSigno(formCrearSuperAstro.getTxtSigno().getSelectedItem().toString());
			if (formCrearSuperAstro.getTxtNumero().getText().length() != 4) {
				JOptionPane.showMessageDialog(null, "El numero es invalido debe ser de 4 digitos", "Error",
						2);
				return null;
			}
			return objSuperAstro;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El valor o numero son invalidos", "Error", 2);
			return null;
		}
	}
}
