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

import co.edu.unbosque.controller.GestionApostador;
import co.edu.unbosque.controller.GestionSede;
import co.edu.unbosque.model.Apostador;
import co.edu.unbosque.model.SedeCasaApuesta;

public class FormCrearBaloto extends JFrame {

	ActionListener listener;

	JLabel lblSede = new JLabel();
	JLabel lblCedula = new JLabel();
	JLabel lblValor = new JLabel();
	JLabel lblNumero = new JLabel();

	JComboBox<String> txtSede = new JComboBox<String>();
	JComboBox<String> txtCedula = new JComboBox<String>();
	JTextArea txtValor = new JTextArea();
	JTextArea txtNumero = new JTextArea();

	JButton btnCreatBaloto = new JButton();


	public JComboBox<String> agregarApostador(JComboBox<String> combo){

		GestionApostador objGestionApostador = new GestionApostador();
		for (Apostador element : objGestionApostador.listarApostadores()) {
			combo.addItem(String.valueOf(element.getCedula()));
		}
		return combo;
	}
	
	public JComboBox<String> agregarSede(JComboBox<String> combo){

		GestionSede objGestionSede = new GestionSede();
		for (SedeCasaApuesta element : objGestionSede.listarSedes()) {
			combo.addItem(String.valueOf(element.getUbicacion()));
		}
		return combo;
	}
	
	public FormCrearBaloto(ActionListener controller) {
		super();
		listener = controller;
		this.setSize(600, 600);
		JPanel panel = new JPanel();
		this.setTitle(" Crear Baloto");
		this.getContentPane().add(panel);

		panel.add(lblSede);
		panel.add(lblCedula);
		panel.add(lblValor);
		panel.add(lblNumero);

		panel.add(txtSede);
		panel.add(txtCedula);
		panel.add(txtValor);
		panel.add(txtNumero);

		panel.add(btnCreatBaloto);

		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Juegos.jpg"));
		etiqueta.setBounds(0, 0, 600, 600);

		/* Labels */
		lblSede.setText("Sede:");
		lblSede.setBounds(150, 150, 150, 20);
		lblSede.setForeground(Color.WHITE);
		lblSede.setBackground(Color.BLACK);
		lblSede.setOpaque(true);
		lblSede.setVisible(true);

		lblCedula.setText("Cedula:");
		lblCedula.setBounds(150, 200, 150, 20);
		lblCedula.setForeground(Color.WHITE);
		lblCedula.setBackground(Color.BLACK);
		lblCedula.setOpaque(true);
		lblCedula.setVisible(true);

		lblValor.setText("Valor:");
		lblValor.setBounds(150, 250, 150, 20);
		lblValor.setForeground(Color.WHITE);
		lblValor.setBackground(Color.BLACK);
		lblValor.setOpaque(true);
		lblValor.setVisible(true);

		lblNumero.setText("Numero:");
		lblNumero.setBounds(150, 300, 150, 20);
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setBackground(Color.BLACK);
		lblNumero.setOpaque(true);
		lblNumero.setVisible(true);

		/* Inputs */
		txtSede.setBounds(350, 150, 160, 20);
		txtSede.setBackground(Color.WHITE);
		txtSede.setVisible(true);
		txtSede = agregarSede(txtSede);
		
		txtCedula.setBounds(350, 200, 160, 20);
		txtCedula.setBackground(Color.WHITE);
		txtCedula.setVisible(true);
		txtCedula = agregarApostador(txtCedula);

		txtValor.setBounds(350, 250, 160, 20);
		txtValor.setBackground(Color.WHITE);
		txtValor.setVisible(true);

		txtNumero.setBounds(350, 300, 160, 20);
		txtNumero.setBackground(Color.WHITE);
		txtNumero.setVisible(true);

		btnCreatBaloto.setBounds(260, 400, 160, 20);
		btnCreatBaloto.setBackground(Color.WHITE);
		btnCreatBaloto.setVisible(true);
		btnCreatBaloto.setText("Crear");
		btnCreatBaloto.addActionListener(listener);

		panel.setLayout(null);
		panel.add(etiqueta);

		setLocationRelativeTo(null);
		this.setVisible(true);

	}

	public JComboBox<String> getTxtSede() {
		return txtSede;
	}

	public void setTxtSede(JComboBox<String> txtSede) {
		this.txtSede = txtSede;
	}

	public JComboBox<String> getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JComboBox<String> txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JTextArea getTxtValor() {
		return txtValor;
	}

	public void setTxtValor(JTextArea txtValor) {
		this.txtValor = txtValor;
	}

	public JTextArea getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextArea txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getBtnCreatBaloto() {
		return btnCreatBaloto;
	}

	public void setBtnCreatBaloto(JButton btnCreatBaloto) {
		this.btnCreatBaloto = btnCreatBaloto;
	}

}
