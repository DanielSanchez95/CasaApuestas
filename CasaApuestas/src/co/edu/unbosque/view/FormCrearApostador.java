package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import co.edu.unbosque.controller.GestionSede;
import co.edu.unbosque.model.SedeCasaApuesta;

public class FormCrearApostador extends JFrame {

	ActionListener listener;
	JLabel lblNombre = new JLabel();
	JLabel lblCedula = new JLabel();
	JLabel lblSede = new JLabel();
	JLabel lblDireccion = new JLabel();
	JLabel lblCelular = new JLabel();

	JTextArea txtNombre = new JTextArea();
	JTextArea txtCedula = new JTextArea();
	JComboBox<String> txtSede = new JComboBox<String>();
	JTextArea txtDireccion = new JTextArea();
	JTextArea txtCelular = new JTextArea();

//	JTextArea txtNombreJuego = new JTextArea();
//	JComboBox<String> txtTipoJuego = new JComboBox<String>();
//	JTextArea txtPresupuestoJuego = new JTextArea();
	JButton btnCreatApostador = new JButton();
	JPanel panel = new JPanel();

	public FormCrearApostador(ActionListener controller) {
		super();
		listener = controller;
		this.setSize(600, 600);
		this.setTitle(" Crear Juego");
		this.getContentPane().add(panel);
		panel.add(lblNombre);
		panel.add(lblCedula);
		panel.add(lblSede);
		panel.add(lblDireccion);
		panel.add(lblCelular);
		panel.add(txtNombre);
		panel.add(txtCedula);
		panel.add(txtSede);
		panel.add(txtDireccion);
		panel.add(txtCelular);
		panel.add(btnCreatApostador);

		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Apostador.jpg"));
		etiqueta.setBounds(0, 0, 600, 600);

		panel.setLayout(null);
		panel.add(etiqueta);

		lblNombre.setText("Nombre Apostador:");
		lblNombre.setBounds(150, 150, 150, 20);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setOpaque(true);
		lblNombre.setVisible(true);

		lblCedula.setText("Documento:");
		lblCedula.setBounds(150, 190, 150, 20);
		lblCedula.setForeground(Color.BLACK);
		lblCedula.setBackground(Color.WHITE);
		lblCedula.setOpaque(true);
		lblCedula.setVisible(true);

		lblSede.setText("Sede:");
		lblSede.setBounds(150, 230, 150, 20);
		lblSede.setForeground(Color.BLACK);
		lblSede.setBackground(Color.WHITE);
		lblSede.setOpaque(true);
		lblSede.setVisible(true);

		lblDireccion.setText("Dirección:");
		lblDireccion.setBounds(150, 270, 150, 20);
		lblDireccion.setForeground(Color.BLACK);
		lblDireccion.setBackground(Color.WHITE);
		lblDireccion.setOpaque(true);
		lblDireccion.setVisible(true);

		lblCelular.setText("Celular:");
		lblCelular.setBounds(150, 310, 150, 20);
		lblCelular.setForeground(Color.BLACK);
		lblCelular.setBackground(Color.WHITE);
		lblCelular.setOpaque(true);
		lblCelular.setVisible(true);

		txtNombre.setBounds(350, 150, 160, 20);
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setVisible(true);

		txtCedula.setBounds(350, 190, 160, 20);
		txtCedula.setBackground(Color.WHITE);
		txtCedula.setVisible(true);

		txtSede.setBounds(350, 230, 160, 20);
		txtSede.setBackground(Color.WHITE);
		txtSede.setVisible(true);
		GestionSede objSede = new GestionSede();
		for (SedeCasaApuesta element : objSede.listarSedes()) {
			txtSede.addItem(element.getUbicacion());
		}

		txtDireccion.setBounds(350, 270, 160, 20);
		txtDireccion.setBackground(Color.WHITE);
		txtDireccion.setVisible(true);

		txtCelular.setBounds(350, 310, 160, 20);
		txtCelular.setBackground(Color.WHITE);
		txtCelular.setVisible(true);

		btnCreatApostador.setBounds(260, 350, 160, 20);
		btnCreatApostador.setBackground(Color.WHITE);
		btnCreatApostador.setVisible(true);
		btnCreatApostador.setText("Crear");
		btnCreatApostador.addActionListener(listener);

		setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void cargarApostadores() {
		txtSede.removeAllItems();
		GestionSede objSede = new GestionSede();
		for (SedeCasaApuesta element : objSede.listarSedes()) {
			txtSede.addItem(element.getUbicacion());
		}
	}

	public JButton getBtnCreatApostador() {
		return btnCreatApostador;
	}

	public void setBtnCreatApostador(JButton btnCreatApostador) {
		this.btnCreatApostador = btnCreatApostador;
	}

	public JTextArea getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextArea txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextArea getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextArea txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JComboBox<String> getTxtSede() {
		return txtSede;
	}

	public void setTxtSede(JComboBox<String> txtSede) {
		this.txtSede = txtSede;
	}

	public JTextArea getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextArea txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public JTextArea getTxtCelular() {
		return txtCelular;
	}

	public void setTxtCelular(JTextArea txtCelular) {
		this.txtCelular = txtCelular;
	}

}
