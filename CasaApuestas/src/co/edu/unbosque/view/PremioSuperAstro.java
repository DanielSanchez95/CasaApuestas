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

import co.edu.unbosque.model.SuperAstro;

public class PremioSuperAstro extends JFrame {

	ActionListener listener;
	JLabel lblNumero = new JLabel();
	JLabel lblSigno = new JLabel();

	JTextArea txtNumero = new JTextArea();
	JComboBox<String> txtSigno = new JComboBox<String>();

	JButton btnRegistrarNumero = new JButton();

	public PremioSuperAstro(ActionListener controller) {
		super();
		listener = controller;
		this.setSize(600, 600);
		JPanel panel = new JPanel();
		this.setTitle(" Registrar Baloto Ganador");
		this.getContentPane().add(panel);
		panel.add(lblNumero);
		panel.add(lblSigno);

		panel.add(txtNumero);
		panel.add(txtSigno);

		panel.add(btnRegistrarNumero);

		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Apostador.jpg"));
		etiqueta.setBounds(0, 0, 600, 600);

		panel.setLayout(null);
		panel.add(etiqueta);

		lblNumero.setText("Numero Ganador:");
		lblNumero.setBounds(150, 150, 150, 20);
		lblNumero.setForeground(Color.BLACK);
		lblNumero.setBackground(Color.WHITE);
		lblNumero.setOpaque(true);
		lblNumero.setVisible(true);

		lblSigno.setText("Signo Ganador:");
		lblSigno.setBounds(150, 200, 150, 20);
		lblSigno.setForeground(Color.BLACK);
		lblSigno.setBackground(Color.WHITE);
		lblSigno.setOpaque(true);
		lblSigno.setVisible(true);

		txtNumero.setBounds(350, 150, 160, 20);
		txtNumero.setBackground(Color.WHITE);
		txtNumero.setVisible(true);

		txtSigno.setBounds(350, 200, 160, 20);
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

		btnRegistrarNumero.setBounds(260, 250, 160, 20);
		btnRegistrarNumero.setBackground(Color.WHITE);
		btnRegistrarNumero.setVisible(true);
		btnRegistrarNumero.setText("Registrar");
		btnRegistrarNumero.addActionListener(listener);

		setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public JLabel getLblNumero() {
		return lblNumero;
	}

	public void setLblNumero(JLabel lblNumero) {
		this.lblNumero = lblNumero;
	}

	public JTextArea getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextArea txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getBtnRegistrarNumero() {
		return btnRegistrarNumero;
	}

	public void setBtnRegistrarNumero(JButton btnRegistrarNumero) {
		this.btnRegistrarNumero = btnRegistrarNumero;
	}

	public JComboBox<String> getTxtSigno() {
		return txtSigno;
	}

	public void setTxtSigno(JComboBox<String> txtSigno) {
		this.txtSigno = txtSigno;
	}

}
