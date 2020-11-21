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
import co.edu.unbosque.model.SuperAstro;

public class FormCrearSuperAstro extends JFrame {

	ActionListener listener;

	JLabel lblSede = new JLabel();
	JLabel lblCedula = new JLabel();
	JLabel lblValor = new JLabel();
	JLabel lblNumero = new JLabel();
	JLabel lblSigno = new JLabel();

	JComboBox<String> txtSede = new JComboBox<String>();
	JComboBox<String> txtCedula = new JComboBox<String>();
	JTextArea txtValor = new JTextArea();
	JTextArea txtNumero = new JTextArea();
	JComboBox<String> txtSigno = new JComboBox<String>();

	JButton btnCreaSuperAstro = new JButton();


	
	
	public FormCrearSuperAstro(ActionListener controller) {
		super();
		listener = controller;

		this.setSize(600, 600);
		JPanel panel = new JPanel();
		this.setTitle(" Crear SuperAstro");
		this.getContentPane().add(panel);

		panel.add(lblSede);
		panel.add(lblCedula);
		panel.add(lblValor);
		panel.add(lblNumero);
		panel.add(lblSigno);

		panel.add(txtSede);
		panel.add(txtCedula);
		panel.add(txtValor);
		panel.add(txtNumero);
		panel.add(txtSigno);

		panel.add(btnCreaSuperAstro);

		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Juegos.jpg"));
		etiqueta.setBounds(0, 0, 600, 600);

		/* Labels */
		lblSede.setText("Sede:");
		lblSede.setBounds(150, 200, 150, 20);
		lblSede.setForeground(Color.WHITE);
		lblSede.setBackground(Color.BLACK);
		lblSede.setOpaque(true);
		lblSede.setVisible(true);

		lblCedula.setText("Cedula:");
		lblCedula.setBounds(150, 250, 150, 20);
		lblCedula.setForeground(Color.WHITE);
		lblCedula.setBackground(Color.BLACK);
		lblCedula.setOpaque(true);
		lblCedula.setVisible(true);

		lblValor.setText("Valor:");
		lblValor.setBounds(150, 300, 150, 20);
		lblValor.setForeground(Color.WHITE);
		lblValor.setBackground(Color.BLACK);
		lblValor.setOpaque(true);
		lblValor.setVisible(true);

		lblNumero.setText("Numero:");
		lblNumero.setBounds(150, 350, 150, 20);
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setBackground(Color.BLACK);
		lblNumero.setOpaque(true);
		lblNumero.setVisible(true);

		lblSigno.setText("Signo:");
		lblSigno.setBounds(150, 400, 150, 20);
		lblSigno.setForeground(Color.WHITE);
		lblSigno.setBackground(Color.BLACK);
		lblSigno.setOpaque(true);
		lblSigno.setVisible(true);

		/* Inputs */
		txtSede.setBounds(350, 200, 160, 20);
		txtSede.setBackground(Color.WHITE);
		txtSede.setVisible(true);
		txtSede = agregarSede(txtSede);
		
		txtCedula.setBounds(350, 250, 160, 20);
		txtCedula.setBackground(Color.WHITE);
		txtCedula.setVisible(true);
		txtCedula = agregarApostador(txtCedula);
		
		txtValor.setBounds(350, 300, 160, 20);
		txtValor.setBackground(Color.WHITE);
		txtValor.setVisible(true);

		txtNumero.setBounds(350, 350, 160, 20);
		txtNumero.setBackground(Color.WHITE);
		txtNumero.setVisible(true);

		txtSigno.setBounds(350, 400, 160, 20);
		txtSigno.setBackground(Color.WHITE);
		txtSigno.setVisible(true);
		txtSigno.addItem(SuperAstro.ACUARIO);
		txtSigno.addItem(SuperAstro.PISCIS);
		txtSigno.addItem(SuperAstro.ARIES);
		txtSigno.addItem(SuperAstro.TAURO);
		txtSigno.addItem(SuperAstro.GEMINIS);
		txtSigno.addItem(SuperAstro.CANCER);
		txtSigno.addItem(SuperAstro.LEO);
		txtSigno.addItem(SuperAstro.VIRGO);
		txtSigno.addItem(SuperAstro.LIBRA);
		txtSigno.addItem(SuperAstro.ESCORPIO);
		txtSigno.addItem(SuperAstro.SAGITARIO);
		txtSigno.addItem(SuperAstro.CAPRICORNIO);

		btnCreaSuperAstro.setBounds(260, 450, 160, 20);
		btnCreaSuperAstro.setBackground(Color.WHITE);
		btnCreaSuperAstro.setVisible(true);
		btnCreaSuperAstro.setText("Crear");
		btnCreaSuperAstro.addActionListener(listener);

		panel.setLayout(null);
		panel.add(etiqueta);

		setLocationRelativeTo(null);
		this.setVisible(true);
	}

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
	
	public JLabel getLblSede() {
		return lblSede;
	}

	public void setLblSede(JLabel lblSede) {
		this.lblSede = lblSede;
	}

	public JLabel getLblCedula() {
		return lblCedula;
	}

	public void setLblCedula(JLabel lblCedula) {
		this.lblCedula = lblCedula;
	}

	public JLabel getLblValor() {
		return lblValor;
	}

	public void setLblValor(JLabel lblValor) {
		this.lblValor = lblValor;
	}

	public JLabel getLblNumero() {
		return lblNumero;
	}

	public void setLblNumero(JLabel lblNumero) {
		this.lblNumero = lblNumero;
	}

	public JLabel getLblSigno() {
		return lblSigno;
	}

	public void setLblSigno(JLabel lblSigno) {
		this.lblSigno = lblSigno;
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

	public JComboBox<String> getTxtSigno() {
		return txtSigno;
	}

	public void setTxtSigno(JComboBox<String> txtSigno) {
		this.txtSigno = txtSigno;
	}

	public JButton getBtnCreaSuperAstro() {
		return btnCreaSuperAstro;
	}

	public void setBtnCreaSuperAstro(JButton btnCreaSuperAstro) {
		this.btnCreaSuperAstro = btnCreaSuperAstro;
	}

}
