package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Apostador;
import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.model.CasaApuesta;
import co.edu.unbosque.model.Juego;
import co.edu.unbosque.model.Marcadores;
import co.edu.unbosque.model.PremioBalotoModel;
import co.edu.unbosque.model.PremioMarcadorModel;
import co.edu.unbosque.model.PremioSuperAstroModel;
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
import co.edu.unbosque.view.HistoricoVentas;
import co.edu.unbosque.view.HomeCasaApuesta;
import co.edu.unbosque.view.Inicio;
import co.edu.unbosque.view.Juegos;
import co.edu.unbosque.view.PremioBaloto;
import co.edu.unbosque.view.PremioMarcador;
import co.edu.unbosque.view.PremioSuperAstro;
import co.edu.unbosque.view.Premios;
import co.edu.unbosque.view.Reportes;
import co.edu.unbosque.view.Sedes;
import co.edu.unbosque.view.TopSedes;

public class HomeController implements ActionListener {

	private Inicio inicio;
	private HomeCasaApuesta home;
	private Apuestas apuestas;
	private Apostadores apostadores;
	private Juegos juegos;
	private Sedes sedes;
	private Reportes reportes;
	private Premios premios;

	private PremioBaloto premioBaloto;
	private PremioSuperAstro premiosuperAstro;
	private PremioMarcador premioMarcador;

	private HistoricoVentas historicoVentas;
	private TopSedes topSedes;

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
		reportes = new Reportes(this);
		reportes.setVisible(false);
		premios = new Premios(this);
		premios.setVisible(false);

		premioBaloto = new PremioBaloto(this);
		premioBaloto.setVisible(false);
		premiosuperAstro = new PremioSuperAstro(this);
		premiosuperAstro.setVisible(false);
		premioMarcador = new PremioMarcador(this);
		premioMarcador.setVisible(false);

		historicoVentas = new HistoricoVentas(this);
		historicoVentas.setVisible(false);
		topSedes = new TopSedes(this);
		topSedes.setVisible(false);

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
				//Asiugna el presupuesto a la instacia del objeto casa
				GestionCasaApuesta.getInstance()
						.asignarPresupuesto(Double.parseDouble(inicio.getTxtPresupuesto().getText()));
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
			// Home Reportes
			else if (home.getBtnReportes() == e.getSource()) {
				abrirHomeReportes();
			}
			// Home Premios
			else if (home.getBtnPremiacion() == e.getSource()) {
				abrirHomePremios();
			}
			// PREMIACION
			// Registrar Premio Baloto
			else if (premios.getBtnRegistrarBaloto() == e.getSource()) {
				premios.setVisible(false);
				premioBaloto.setVisible(true);
			}
			// Registrar Premio Super Astro
			else if (premios.getBtnRegistrarSuperAstro() == e.getSource()) {
				premios.setVisible(false);
				premiosuperAstro.setVisible(true);
			}
			// Registrar Premio Marcadores
			else if (premios.getBtnRegistrarMarcadores() == e.getSource()) {
				premios.setVisible(false);
				premioMarcador.setVisible(true);
			}
			// TOPS
			// Historico
			else if (reportes.getBtnAbrirHistorico() == e.getSource()) {
				abrirHistoricoVentas();
			}
			// Top Sedes
			else if (reportes.getBtnAbrirTopSedes() == e.getSource()) {
				abrirTopSedes();
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
				formCrearApostador.cargarApostadores();
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
				//Valida que los campos requeridos esten diligenciados 
				if (validarCamposBaloto()) {
					//Contruye el objeto y valida que no sea nulo
					if (contruirObjBaloto() != null) {
						GestionBaloto objGestionBaloto = new GestionBaloto();
						//Crea el registro y valida si es exitoso
						if (objGestionBaloto.crearBaloto(contruirObjBaloto())) {
							JOptionPane.showMessageDialog(null, "Baloto creado con exito", "Exitoso", 2);
							cerrarFormBaloto();
							//Actualiza la lista
							objGestionBaloto.listarJuego();
							formCrearBaloto.getTxtNumero().setText("");
							formCrearBaloto.getTxtValor().setText("");
						} else {
							JOptionPane.showMessageDialog(null, "Error al crear un baloto", "Error", 2);

						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Todos los campos deben ser diligenciados", "Error", 2);
				}
			}
			// Crear SuperAstro
			else if (formCrearSuperAstro.getBtnCreaSuperAstro() == e.getSource()) {
				//Valida campos requeridos
				if (validarCamposSuperAstro()) {
					//Contruye el objeto y valida que no sea nulo
					if (contruirObjSuperAstro() != null) {
						GestionSuperAstro objGestionSuperAstro = new GestionSuperAstro();
						//Crea el registro
						if (objGestionSuperAstro.crearSuperAstro(contruirObjSuperAstro())) {
							JOptionPane.showMessageDialog(null, "Super Astro creado con exito", "Exitoso", 2);
							cerrarFormSuperAstro();
							//Actualiza la lista
							objGestionSuperAstro.listarJuego();
							formCrearSuperAstro.getTxtNumero().setText("");
							formCrearSuperAstro.getTxtValor().setText("");
						} else {
							JOptionPane.showMessageDialog(null, "Error al crear un Super Astro", "Error", 2);

						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Todos los campos deben ser diligenciados", "Error", 2);
				}
			}
			// Crear Marcadores
			else if (formCrearMarcador.getBtnCreaMarcador() == e.getSource()) {
				//Valida los campos requeridos
				if (validarCamposMarcador()) {
					//Construye el objeto
					if (contruirObjMarcador() != null) {
						GestionMarcador objGestionMarcador = new GestionMarcador();
						//Crea el registro
						if (objGestionMarcador.crearMarcador(contruirObjMarcador())) {
							JOptionPane.showMessageDialog(null, "Marcadores creados con exito", "Exitoso", 2);
							cerrarFormSuperAstro();
							//Actualiza la lista
							objGestionMarcador.listarMarcadores();
							formCrearMarcador.getTxtValor().setText("");
						} else {
							JOptionPane.showMessageDialog(null, "Error al crear marcadores", "Error", 2);

						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Todos los campos deben ser diligenciados", "Error", 2);
				}
			}
			// Crear Sede
			else if (formCrearSede.getBtnCreatSede() == e.getSource()) {
				//Valida los campos requeridos
				if (validarCamposSedes()) {
					//Crea los objetos
					SedeCasaApuesta objSede = new SedeCasaApuesta();
					objSede.setUbicacion(formCrearSede.getTxtUbicacion().getText());
					objSede.setNumeroEmpleados(Integer.parseInt(formCrearSede.getTxtNumEmpleados().getText()));
					GestionSede objGestionSede = new GestionSede();
					//Crea el registro
					if (objGestionSede.crearSede(objSede)) {
						JOptionPane.showMessageDialog(null, "Sede creada con exito", "Exitoso", 2);
						cerrarFormSedes();
						formCrearSede.getTxtUbicacion().setText("");
						formCrearSede.getTxtNumEmpleados().setText("");
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
					//Valida que no este nulo el registro
					if (campoDiligenciado(formCrearJuego.getTxtNombreJuego().getText())) {
						objJuego.setNombreJuego(formCrearJuego.getTxtNombreJuego().getText());
					} else {
						juegoValido = false;
					}
					//Valida que no este nulo el registro
					if (campoDiligenciado(formCrearJuego.getTxtPresupuestoJuego().getText())) {
						objJuego.setPresupuestoJuego(
								Double.parseDouble(formCrearJuego.getTxtPresupuestoJuego().getText()));
					} else {
						juegoValido = false;
					}
					objJuego.setTipoJuego(String.valueOf(formCrearJuego.getTxtTipoJuego().getSelectedItem()));
					//Valida que los campos requeridos no esten vacios
					if (juegoValido) {
						//Crea el registro
						if (objGestJuegos.crearJuegos(objJuego)) {
							formCrearJuego.setVisible(false);
							juegos.setVisible(true);
							JOptionPane.showMessageDialog(null, "Juego creado con exito", "Exitoso", 2);
							//Refresca la lista
							juegos.cargarJuegos();
							formCrearJuego.getTxtNombreJuego().setText("");
							formCrearJuego.getTxtPresupuestoJuego().setText("");
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
					//Valida que no este nulo el registro
					if (campoDiligenciado(formCrearApostador.getTxtCedula().getText())) {
						objApostador.setCedula(Long.parseLong(formCrearApostador.getTxtCedula().getText()));
					} else {
						apostadorValido = false;
					}
					//Valida que no este nulo el registro
					if (campoDiligenciado(formCrearApostador.getTxtNombre().getText())) {
						objApostador.setNombre(formCrearApostador.getTxtNombre().getText());
					} else {
						apostadorValido = false;
					}
					//Valida que no este nulo el registro
					if (campoDiligenciado(formCrearApostador.getTxtCelular().getText())) {
						objApostador.setCelular(Long.parseLong(formCrearApostador.getTxtCelular().getText()));
					} else {
						apostadorValido = false;
					}
					//Valida que no este nulo el registro
					if (campoDiligenciado(formCrearApostador.getTxtDireccion().getText())) {
						objApostador.setDireccion(formCrearApostador.getTxtDireccion().getText());
					} else {
						apostadorValido = false;
					}
					objApostador.setSede(String.valueOf(formCrearApostador.getTxtSede().getSelectedItem()));
					//Valida que los campos requeridos no esten vacios
					if (apostadorValido) {
						//Crea el registro
						if (objGestionApostador.crearApostador(objApostador)) {
							formCrearApostador.setVisible(false);
							apostadores.setVisible(true);
							JOptionPane.showMessageDialog(null, "Apostador creado con exito", "Exitoso", 2);
							//Actualiza la lista
							apostadores.cargarApostadores();
							formCrearApostador.getTxtNombre().setText("");
							formCrearApostador.getTxtCedula().setText("");
							formCrearApostador.getTxtDireccion().setText("");
							formCrearApostador.getTxtCelular().setText("");
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

			// Crear Premio Baloto
			else if (premioBaloto.getBtnRegistrarNumero() == e.getSource()) {
				//Valifa que el campo este diligenciado
				if (campoDiligenciado(premioBaloto.getTxtNumero().getText())) {
					//Valida que no existan registros para la fecha actual
					if (validarRegistroPremioBaloto()) {
						GestionPremiacionBaloto objPremiacionBaloto = new GestionPremiacionBaloto();
						PremioBalotoModel objPremio = new PremioBalotoModel();
						//Contruye objeto
						objPremio.setFecha(new Date());
						objPremio.setNumero(Long.parseLong(premioBaloto.getTxtNumero().getText()));
						//Valida la cantidad de ganadores
						List<String> listaGanadores = validarGanadoresBaloto(premioBaloto.getTxtNumero().getText());
						objPremio.setListaGanadores(listaGanadores);
						//Crea el registro
						objPremiacionBaloto.crearPremioBaloto(objPremio);
						JOptionPane.showMessageDialog(null,
								"Resultado registrado. \n Hay " + listaGanadores.size() + " ganadores.", "OK", 2);
						premioBaloto.getTxtNumero().setText("");
					} else {
						JOptionPane.showMessageDialog(null, "Ya existe un registro para el dia de hoy.", "OK", 2);
						premioBaloto.setVisible(false);
						premios.setVisible(true);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Todos los campos deben ser diligenciados", "Error", 2);
				}
			}

			// Crear Premio Super Astro
			else if (premiosuperAstro.getBtnRegistrarNumero() == e.getSource()) {
				//Valida que el campo este diligenciado
				if (campoDiligenciado(premiosuperAstro.getTxtNumero().getText())) {
					//Valida que no existan registros para la fecha actual
					if (validarRegistroSuperAstro()) {
						GestionPremiacionSuperAstro objPremiacionSuperAstro = new GestionPremiacionSuperAstro();
						PremioSuperAstroModel objPremio = new PremioSuperAstroModel();
						//construye el objeto
						objPremio.setFecha(new Date());
						objPremio.setNumero(Long.parseLong(premiosuperAstro.getTxtNumero().getText()));
						//Valida el listado de ganadores
						List<String> listaGanadores = validarGanadoresSuperAstro(
								premiosuperAstro.getTxtNumero().getText(),
								premiosuperAstro.getTxtSigno().getSelectedItem().toString());
						objPremio.setListaGanadores(listaGanadores);
						//Crea el registro
						objPremiacionSuperAstro.crearPremioSuperAstro(objPremio);
						JOptionPane.showMessageDialog(null,
								"Resultado registrado. \n Hay " + listaGanadores.size() + " ganadores.", "OK", 2);
						premiosuperAstro.getTxtNumero().setText("");
					} else {
						JOptionPane.showMessageDialog(null, "Ya existe un registro para el dia de hoy.", "OK", 2);
						premiosuperAstro.setVisible(false);
						premios.setVisible(true);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Todos los campos deben ser diligenciados", "Error", 2);
				}
			}

			// Crear Premio Marcadores
			else if (premioMarcador.getBtnRegistrarPremio() == e.getSource()) {
				if (validarRegistroMarcadores()) {
					GestionPremiacionMarcador objPremiacionMarcadores = new GestionPremiacionMarcador();
					PremioMarcadorModel objPremio = new PremioMarcadorModel();
					//Construye el objeto
					objPremio.setFecha(new Date());
					objPremio.setPartido1(premioMarcador.getTxtPartido1().getSelectedItem().toString());
					objPremio.setPartido2(premioMarcador.getTxtPartido2().getSelectedItem().toString());
					objPremio.setPartido3(premioMarcador.getTxtPartido3().getSelectedItem().toString());
					objPremio.setPartido4(premioMarcador.getTxtPartido4().getSelectedItem().toString());
					objPremio.setPartido5(premioMarcador.getTxtPartido5().getSelectedItem().toString());
					objPremio.setPartido6(premioMarcador.getTxtPartido6().getSelectedItem().toString());
					objPremio.setPartido7(premioMarcador.getTxtPartido7().getSelectedItem().toString());
					objPremio.setPartido8(premioMarcador.getTxtPartido8().getSelectedItem().toString());
					objPremio.setPartido9(premioMarcador.getTxtPartido9().getSelectedItem().toString());
					objPremio.setPartido10(premioMarcador.getTxtPartido10().getSelectedItem().toString());
					objPremio.setPartido11(premioMarcador.getTxtPartido11().getSelectedItem().toString());
					objPremio.setPartido12(premioMarcador.getTxtPartido12().getSelectedItem().toString());
					objPremio.setPartido13(premioMarcador.getTxtPartido13().getSelectedItem().toString());
					objPremio.setPartido14(premioMarcador.getTxtPartido14().getSelectedItem().toString());
					//Valida el listado de ganadores
					List<String> listaGanadores = validarGanadoresMarcadores(objPremio);
					objPremio.setListaGanadores(listaGanadores);
					//Crea el registro
					objPremiacionMarcadores.crearPremioMarcador(objPremio);
					JOptionPane.showMessageDialog(null,
							"Resultado registrado. \n Hay " + listaGanadores.size() + " ganadores.", "OK", 2);
				} else {
					JOptionPane.showMessageDialog(null, "Ya existe un registro para el dia de hoy.", "OK", 2);
					premiosuperAstro.setVisible(false);
					premios.setVisible(true);
				}
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Error en la aplicación", "Error", 2);
		}
	}

	/**
	 * Valida que el campo no sea vacio 
	 */
	public boolean campoDiligenciado(String a) {
		if (a.equals("")) {
			return false;
		} else {
			return true;
		}
	}

	// HOME
	/**
	 * Abre la ventana de Juegos
	 */
	public void abrirHomeJuegos() {
		inicio.setVisible(false);
		juegos.setVisible(true);
	}

	/**
	 * Abre la ventana de Sedes
	 */
	public void abrirHomeSedes() {
		inicio.setVisible(false);
		sedes.setVisible(true);
	}

	/**
	 * Abre la ventana de Apostadores
	 */
	public void abrirHomeApostadores() {
		inicio.setVisible(false);
		apostadores.setVisible(true);
	}

	/**
	 * Abre la ventana de Apuestas
	 */
	public void abrirHomeApuestas() {
		inicio.setVisible(false);
		apuestas.setVisible(true);
	}

	/**
	 * Abre la ventana de Reportes
	 */
	public void abrirHomeReportes() {
		inicio.setVisible(false);
		reportes.setVisible(true);
	}

	/**
	 * Abre la ventana de Premios 
	 */
	public void abrirHomePremios() {
		inicio.setVisible(false);
		premios.setVisible(true);
	}

	// TOPS

	/**
	 * Abre la ventana de Historico de ventas 
	 */
	public void abrirHistoricoVentas() {
		reportes.setVisible(false);
		historicoVentas.setVisible(true);
	}
	

	/**
	 * Abre la ventana de top de sedes 
	 */
	public void abrirTopSedes() {
		reportes.setVisible(false);
		topSedes.setVisible(true);
	}

	// FORMULARIOS

	/**
	 * Abre el formulario de juegos 
	 */
	public void abrirFormJuegos() {
		formCrearJuego.setVisible(true);
		juegos.setVisible(false);
	}

	/**
	 * Abre el formulario de Sedes 
	 */
	public void abrirFormSedes() {
		formCrearSede.setVisible(true);
		sedes.setVisible(false);
	}

	/**
	 * Cierra el formulario de sedes 
	 */
	public void cerrarFormSedes() {
		formCrearSede.setVisible(false);
		sedes.setVisible(true);
		sedes.cargarSedes();
	}


	/**
	 * Abre el formulario de apostadores 
	 */
	public void abrirFormApostadores() {
		formCrearApostador.setVisible(true);
		apostadores.setVisible(false);
	}

	/**
	 * Abre el formulario de super astros 
	 */
	public void abrirFormSuperAstro() {
		formCrearSuperAstro.setVisible(true);
		apuestas.setVisible(false);
	}

	/**
	 * cierra el formulario de super astro
	 */
	public void cerrarFormSuperAstro() {
		formCrearSuperAstro.setVisible(false);
		apuestas.setVisible(true);
	}

	/**
	 * Abre el formulario de baloto 
	 */
	public void abrirFormBaloto() {
		formCrearBaloto.setVisible(true);
		apuestas.setVisible(false);
	}


	/**
	 * Cierra el formulario de baloto 
	 */
	public void cerrarFormBaloto() {
		formCrearBaloto.setVisible(false);
		apuestas.setVisible(true);
	}


	/**
	 * Abre el formulario de Marcadores 
	 */
	public void abrirFormMarcador() {
		formCrearMarcador.setVisible(true);
		apuestas.setVisible(false);
	}


	/**
	 * Cierra el formulario de Marcadores 
	 */
	public void cerrarFormMarcador() {
		formCrearMarcador.setVisible(false);
		apuestas.setVisible(true);
	}

	/**
	 * Valida los campos requeridos de las Sedes 
	 */
	public boolean validarCamposSedes() {
		boolean camposValidos = true;
		if (!campoDiligenciado(formCrearSede.getTxtUbicacion().getText()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearSede.getTxtNumEmpleados().getText()))
			camposValidos = false;
		return camposValidos;
	}

	/**
	 * Valida los campos requeridos del baloto 
	 */
	public boolean validarCamposBaloto() {
		boolean camposValidos = true;
		if (!campoDiligenciado(formCrearBaloto.getTxtNumero().getText()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearBaloto.getTxtValor().getText()))
			camposValidos = false;

		return camposValidos;
	}


	/**
	 * Valida los campos requeridos del Super Astro 
	 */
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

	/**
	 * Valida los campos requeridos de los Marcadores 
	 */
	public boolean validarCamposMarcador() {
		boolean camposValidos = true;
		if (!campoDiligenciado(formCrearMarcador.getTxtCedula().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtValor().getText()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido1().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido2().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido3().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido4().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido5().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido6().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido7().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido8().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido9().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido10().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido11().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido12().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido13().getSelectedItem().toString()))
			camposValidos = false;
		if (!campoDiligenciado(formCrearMarcador.getTxtPartido14().getSelectedItem().toString()))
			camposValidos = false;

		return camposValidos;
	}

	/**
	 * Construye el objeto Baloto 
	 */
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

	/**
	 * Construye el objeto Super Astro 
	 */
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
				JOptionPane.showMessageDialog(null, "El numero es invalido debe ser de 4 digitos", "Error", 2);
				return null;
			}
			return objSuperAstro;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El valor o numero son invalidos", "Error", 2);
			return null;
		}
	}

	/**
	 * Construye el objeto Marcador 
	 */
	public Marcadores contruirObjMarcador() {
		try {
			Marcadores objMarcador = new Marcadores();
			objMarcador.setCedula(Long.parseLong(formCrearMarcador.getTxtCedula().getSelectedItem().toString()));
			objMarcador.setSede(formCrearMarcador.getTxtSede().getSelectedItem().toString());
			objMarcador.setFecha(new Date());
			objMarcador.setPartido1(formCrearMarcador.getTxtPartido1().getSelectedItem().toString());
			objMarcador.setPartido2(formCrearMarcador.getTxtPartido2().getSelectedItem().toString());
			objMarcador.setPartido3(formCrearMarcador.getTxtPartido3().getSelectedItem().toString());
			objMarcador.setPartido4(formCrearMarcador.getTxtPartido4().getSelectedItem().toString());
			objMarcador.setPartido5(formCrearMarcador.getTxtPartido5().getSelectedItem().toString());
			objMarcador.setPartido6(formCrearMarcador.getTxtPartido6().getSelectedItem().toString());
			objMarcador.setPartido7(formCrearMarcador.getTxtPartido7().getSelectedItem().toString());
			objMarcador.setPartido8(formCrearMarcador.getTxtPartido8().getSelectedItem().toString());
			objMarcador.setPartido9(formCrearMarcador.getTxtPartido9().getSelectedItem().toString());
			objMarcador.setPartido10(formCrearMarcador.getTxtPartido10().getSelectedItem().toString());
			objMarcador.setPartido11(formCrearMarcador.getTxtPartido11().getSelectedItem().toString());
			objMarcador.setPartido12(formCrearMarcador.getTxtPartido12().getSelectedItem().toString());
			objMarcador.setPartido13(formCrearMarcador.getTxtPartido13().getSelectedItem().toString());
			objMarcador.setPartido14(formCrearMarcador.getTxtPartido14().getSelectedItem().toString());
			return objMarcador;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El valor o numero son invalidos", "Error", 2);
			return null;
		}
	}

	/**
	 * Valida la lista de ganadores de Baloto  
	 */
	public List<String> validarGanadoresBaloto(String numeroGanador) {
		List<String> listaGanadores = new ArrayList<>();
		GestionBaloto objGestionBaloto = new GestionBaloto();
		List<Baloto> listaBaloto = objGestionBaloto.listarJuego();
		for (Baloto baloto : listaBaloto) {
			if (tomarFecha(baloto.getFecha()).equals(tomarFecha(new Date()))
					&& baloto.getNumero().toString().equals(numeroGanador)) {
				listaGanadores.add(baloto.getCedula().toString());
			}
		}
		return listaGanadores;
	}

	/**
	 * Valida la lista de ganadores de SuperAstro  
	 */
	public List<String> validarGanadoresSuperAstro(String numeroGanador, String signoGanador) {
		List<String> listaGanadores = new ArrayList<>();
		GestionSuperAstro objGestionSuperAstro = new GestionSuperAstro();
		List<SuperAstro> listaSuperAstro = objGestionSuperAstro.listarJuego();
		for (SuperAstro superAstro : listaSuperAstro) {
			if (tomarFecha(superAstro.getFecha()).equals(tomarFecha(new Date()))
					&& String.valueOf(superAstro.getNumero()).equals(numeroGanador)
					&& String.valueOf(superAstro.getSigno()).equals(signoGanador)) {
				listaGanadores.add(superAstro.getCedula().toString());
			}
		}
		return listaGanadores;
	}
	
	/**
	 * Valida la lista de ganadores de Marcadores  
	 */
	public List<String> validarGanadoresMarcadores(PremioMarcadorModel objPremioMarcadorModel) {
		List<String> listaGanadores = new ArrayList<>();
		GestionMarcador objGestionMarcador = new GestionMarcador();
		List<Marcadores> listaMarcadores = objGestionMarcador.listarMarcadores();
		for (Marcadores marcador: listaMarcadores) {
			if (tomarFecha(marcador.getFecha()).equals(tomarFecha(new Date()))
					&& String.valueOf(marcador.getPartido1()).equals(objPremioMarcadorModel.getPartido1().toString())
					&& String.valueOf(marcador.getPartido2()).equals(objPremioMarcadorModel.getPartido2().toString())
					&& String.valueOf(marcador.getPartido3()).equals(objPremioMarcadorModel.getPartido3().toString())
					&& String.valueOf(marcador.getPartido4()).equals(objPremioMarcadorModel.getPartido4().toString())
					&& String.valueOf(marcador.getPartido5()).equals(objPremioMarcadorModel.getPartido5().toString())
					&& String.valueOf(marcador.getPartido6()).equals(objPremioMarcadorModel.getPartido6().toString())
					&& String.valueOf(marcador.getPartido7()).equals(objPremioMarcadorModel.getPartido7().toString())
					&& String.valueOf(marcador.getPartido8()).equals(objPremioMarcadorModel.getPartido8().toString())
					&& String.valueOf(marcador.getPartido9()).equals(objPremioMarcadorModel.getPartido9().toString())
					&& String.valueOf(marcador.getPartido10()).equals(objPremioMarcadorModel.getPartido10().toString())
					&& String.valueOf(marcador.getPartido11()).equals(objPremioMarcadorModel.getPartido11().toString())
					&& String.valueOf(marcador.getPartido12()).equals(objPremioMarcadorModel.getPartido12().toString())
					&& String.valueOf(marcador.getPartido13()).equals(objPremioMarcadorModel.getPartido13().toString())
					&& String.valueOf(marcador.getPartido14()).equals(objPremioMarcadorModel.getPartido14().toString())) {
				listaGanadores.add(marcador.getCedula().toString());
			}
		}
		return listaGanadores;
	}

	/**
	 * Da formato a las fechas 
	 */
	public String tomarFecha(Date fecha) {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		return formatoFecha.format(fecha);

	}

	/**
	 * Valida que no exista un registro de premio para la fecha actual 
	 */
	public boolean validarRegistroPremioBaloto() {
		GestionPremiacionBaloto objGPB = new GestionPremiacionBaloto();
		// lista el listado de premios
		List<PremioBalotoModel> listaPB = objGPB.listarPremioBaloto();
		Boolean existeRegistro = true;
		//Recorre el listado de premios
		for (PremioBalotoModel premioBalotoModel : listaPB) {
			//Valida que no exista un registro con la fecha de actual
			if (tomarFecha(premioBalotoModel.getFecha()).equals(tomarFecha(new Date()))) {
				existeRegistro = false;
				break;
			}
		}
		return existeRegistro;

	}

	/**
	 * Valida que no exista un registro de premio para la fecha actual 
	 */
	public boolean validarRegistroSuperAstro() {
		GestionPremiacionSuperAstro objGPB = new GestionPremiacionSuperAstro();
		// lista el listado de premios
		List<PremioSuperAstroModel> listaPB = objGPB.listarPremioSuperAstro();
		Boolean existeRegistro = true;
		//Recorre el listado de premios
		for (PremioSuperAstroModel premioBalotoModel : listaPB) {
			//Valida que no exista un registro con la fecha de actual
			if (tomarFecha(premioBalotoModel.getFecha()).equals(tomarFecha(new Date()))) {
				existeRegistro = false;
				break;
			}
		}
		return existeRegistro;

	}

	/**
	 * Valida que no exista un registro de premio para la fecha actual 
	 */	
	public boolean validarRegistroMarcadores() {
		GestionPremiacionMarcador objGPM = new GestionPremiacionMarcador();
		// lista el listado de premios
		List<PremioMarcadorModel> listaPM = objGPM.listarPremioMarcador();
		Boolean existeRegistro = true;
		//Recorre el listado de premios
		for (PremioMarcadorModel premioMarcadorModel : listaPM) {
			//Valida que no exista un registro con la fecha de actual
			if (tomarFecha(premioMarcadorModel.getFecha()).equals(tomarFecha(new Date()))) {
				existeRegistro = false;
				break;
			}
		}
		return existeRegistro;

	}
}
