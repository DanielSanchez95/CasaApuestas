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

import co.edu.unbosque.model.Marcadores;

public class PremioMarcador extends JFrame {

	ActionListener listener;
//	JLabel lblNumero = new JLabel();
	JLabel lblPartido1 = new JLabel();
	JLabel lblPartido2 = new JLabel();
	JLabel lblPartido3 = new JLabel();
	JLabel lblPartido4 = new JLabel();
	JLabel lblPartido5 = new JLabel();
	JLabel lblPartido6 = new JLabel();
	JLabel lblPartido7 = new JLabel();
	JLabel lblPartido8 = new JLabel();
	JLabel lblPartido9 = new JLabel();
	JLabel lblPartido10 = new JLabel();
	JLabel lblPartido11 = new JLabel();
	JLabel lblPartido12 = new JLabel();
	JLabel lblPartido13 = new JLabel();
	JLabel lblPartido14 = new JLabel();

//	JTextArea txtNumero = new JTextArea();
	JComboBox<String> txtPartido1 = new JComboBox<String>();
	JComboBox<String> txtPartido2 = new JComboBox<String>();
	JComboBox<String> txtPartido3 = new JComboBox<String>();
	JComboBox<String> txtPartido4 = new JComboBox<String>();
	JComboBox<String> txtPartido5 = new JComboBox<String>();
	JComboBox<String> txtPartido6 = new JComboBox<String>();
	JComboBox<String> txtPartido7 = new JComboBox<String>();
	JComboBox<String> txtPartido8 = new JComboBox<String>();
	JComboBox<String> txtPartido9 = new JComboBox<String>();
	JComboBox<String> txtPartido10 = new JComboBox<String>();
	JComboBox<String> txtPartido11 = new JComboBox<String>();
	JComboBox<String> txtPartido12 = new JComboBox<String>();
	JComboBox<String> txtPartido13 = new JComboBox<String>();
	JComboBox<String> txtPartido14 = new JComboBox<String>();

	JButton btnRegistrarPremio = new JButton();

	public PremioMarcador(ActionListener controller) {
		super();
		listener = controller;
		this.setSize(600, 600);
		JPanel panel = new JPanel();
		this.setTitle(" Registrar Baloto Ganador");
		this.getContentPane().add(panel);
		panel.add(lblPartido1);
		panel.add(lblPartido2);
		panel.add(lblPartido3);
		panel.add(lblPartido4);
		panel.add(lblPartido5);
		panel.add(lblPartido6);
		panel.add(lblPartido7);
		panel.add(lblPartido8);
		panel.add(lblPartido9);
		panel.add(lblPartido10);		
		panel.add(lblPartido11);		
		panel.add(lblPartido12);		
		panel.add(lblPartido13);		
		panel.add(lblPartido14);		

		
		panel.add(txtPartido1);
		panel.add(txtPartido2);
		panel.add(txtPartido3);
		panel.add(txtPartido4);
		panel.add(txtPartido5);
		panel.add(txtPartido6);
		panel.add(txtPartido7);
		panel.add(txtPartido8);
		panel.add(txtPartido9);
		panel.add(txtPartido10);
		panel.add(txtPartido11);
		panel.add(txtPartido12);
		panel.add(txtPartido13);
		panel.add(txtPartido14);
		
		panel.add(btnRegistrarPremio);

		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Apostador.jpg"));
		etiqueta.setBounds(0, 0, 600, 600);

		panel.setLayout(null);
		panel.add(etiqueta);

		lblPartido1.setText("Partido 1:");
		lblPartido1.setBounds(150, 60, 150, 20);
		lblPartido1.setForeground(Color.WHITE);
		lblPartido1.setBackground(Color.BLACK);
		lblPartido1.setOpaque(true);
		lblPartido1.setVisible(true);
		
		lblPartido2.setText("Partido 2:");
		lblPartido2.setBounds(150, 90, 150, 20);
		lblPartido2.setForeground(Color.WHITE);
		lblPartido2.setBackground(Color.BLACK);
		lblPartido2.setOpaque(true);
		lblPartido2.setVisible(true);
		
		lblPartido3.setText("Partido 3:");
		lblPartido3.setBounds(150, 120, 150, 20);
		lblPartido3.setForeground(Color.WHITE);
		lblPartido3.setBackground(Color.BLACK);
		lblPartido3.setOpaque(true);
		lblPartido3.setVisible(true);
		
		lblPartido4.setText("Partido 4:");
		lblPartido4.setBounds(150, 150, 150, 20);
		lblPartido4.setForeground(Color.WHITE);
		lblPartido4.setBackground(Color.BLACK);
		lblPartido4.setOpaque(true);
		lblPartido4.setVisible(true);
		
		lblPartido5.setText("Partido 5:");
		lblPartido5.setBounds(150, 180, 150, 20);
		lblPartido5.setForeground(Color.WHITE);
		lblPartido5.setBackground(Color.BLACK);
		lblPartido5.setOpaque(true);
		lblPartido5.setVisible(true);
		
		lblPartido6.setText("Partido 6:");
		lblPartido6.setBounds(150, 210, 150, 20);
		lblPartido6.setForeground(Color.WHITE);
		lblPartido6.setBackground(Color.BLACK);
		lblPartido6.setOpaque(true);
		lblPartido6.setVisible(true);
		
		lblPartido7.setText("Partido 7:");
		lblPartido7.setBounds(150, 240, 150, 20);
		lblPartido7.setForeground(Color.WHITE);
		lblPartido7.setBackground(Color.BLACK);
		lblPartido7.setOpaque(true);
		lblPartido7.setVisible(true);
		
		lblPartido8.setText("Partido 8:");
		lblPartido8.setBounds(150, 270, 150, 20);
		lblPartido8.setForeground(Color.WHITE);
		lblPartido8.setBackground(Color.BLACK);
		lblPartido8.setOpaque(true);
		lblPartido8.setVisible(true);
		
		lblPartido9.setText("Partido 9:");
		lblPartido9.setBounds(150, 300, 150, 20);
		lblPartido9.setForeground(Color.WHITE);
		lblPartido9.setBackground(Color.BLACK);
		lblPartido9.setOpaque(true);
		lblPartido9.setVisible(true);
		
		lblPartido10.setText("Partido 10:");
		lblPartido10.setBounds(150, 330, 150, 20);
		lblPartido10.setForeground(Color.WHITE);
		lblPartido10.setBackground(Color.BLACK);
		lblPartido10.setOpaque(true);
		lblPartido10.setVisible(true);
		
		lblPartido11.setText("Partido 11:");
		lblPartido11.setBounds(150, 360, 150, 20);
		lblPartido11.setForeground(Color.WHITE);
		lblPartido11.setBackground(Color.BLACK);
		lblPartido11.setOpaque(true);
		lblPartido11.setVisible(true);
		
		lblPartido12.setText("Partido 12:");
		lblPartido12.setBounds(150, 390, 150, 20);
		lblPartido12.setForeground(Color.WHITE);
		lblPartido12.setBackground(Color.BLACK);
		lblPartido12.setOpaque(true);
		lblPartido12.setVisible(true);
		
		lblPartido13.setText("Partido 13:");
		lblPartido13.setBounds(150, 420, 150, 20);
		lblPartido13.setForeground(Color.WHITE);
		lblPartido13.setBackground(Color.BLACK);
		lblPartido13.setOpaque(true);
		lblPartido13.setVisible(true);
		
		lblPartido14.setText("Partido 14:");
		lblPartido14.setBounds(150, 450, 150, 20);
		lblPartido14.setForeground(Color.WHITE);
		lblPartido14.setBackground(Color.BLACK);
		lblPartido14.setOpaque(true);
		lblPartido14.setVisible(true);


		txtPartido1.setBounds(350, 60, 160, 20);
		txtPartido1.setBackground(Color.WHITE);
		txtPartido1.setVisible(true);
		txtPartido1.addItem(Marcadores.LOCAL);
		txtPartido1.addItem(Marcadores.VISITANTE);
		txtPartido1.addItem(Marcadores.EMPATE);
		
		txtPartido2.setBounds(350, 90, 160, 20);
		txtPartido2.setBackground(Color.WHITE);
		txtPartido2.setVisible(true);
		txtPartido2.addItem(Marcadores.LOCAL);
		txtPartido2.addItem(Marcadores.VISITANTE);
		txtPartido2.addItem(Marcadores.EMPATE);
		
		txtPartido3.setBounds(350, 120, 160, 20);
		txtPartido3.setBackground(Color.WHITE);
		txtPartido3.setVisible(true);
		txtPartido3.addItem(Marcadores.LOCAL);
		txtPartido3.addItem(Marcadores.VISITANTE);
		txtPartido3.addItem(Marcadores.EMPATE);
		
		txtPartido4.setBounds(350, 150, 160, 20);
		txtPartido4.setBackground(Color.WHITE);
		txtPartido4.setVisible(true);
		txtPartido4.addItem(Marcadores.LOCAL);
		txtPartido4.addItem(Marcadores.VISITANTE);
		txtPartido4.addItem(Marcadores.EMPATE);
		
		txtPartido5.setBounds(350, 180, 160, 20);
		txtPartido5.setBackground(Color.WHITE);
		txtPartido5.setVisible(true);
		txtPartido5.addItem(Marcadores.LOCAL);
		txtPartido5.addItem(Marcadores.VISITANTE);
		txtPartido5.addItem(Marcadores.EMPATE);
		
		txtPartido6.setBounds(350, 210, 160, 20);
		txtPartido6.setBackground(Color.WHITE);
		txtPartido6.setVisible(true);
		txtPartido6.addItem(Marcadores.LOCAL);
		txtPartido6.addItem(Marcadores.VISITANTE);
		txtPartido6.addItem(Marcadores.EMPATE);
		
		txtPartido7.setBounds(350, 240, 160, 20);
		txtPartido7.setBackground(Color.WHITE);
		txtPartido7.setVisible(true);
		txtPartido7.addItem(Marcadores.LOCAL);
		txtPartido7.addItem(Marcadores.VISITANTE);
		txtPartido7.addItem(Marcadores.EMPATE);
		
		txtPartido8.setBounds(350, 270, 160, 20);
		txtPartido8.setBackground(Color.WHITE);
		txtPartido8.setVisible(true);
		txtPartido8.addItem(Marcadores.LOCAL);
		txtPartido8.addItem(Marcadores.VISITANTE);
		txtPartido8.addItem(Marcadores.EMPATE);
		
		txtPartido9.setBounds(350, 300, 160, 20);
		txtPartido9.setBackground(Color.WHITE);
		txtPartido9.setVisible(true);
		txtPartido9.addItem(Marcadores.LOCAL);
		txtPartido9.addItem(Marcadores.VISITANTE);
		txtPartido9.addItem(Marcadores.EMPATE);

		txtPartido10.setBounds(350, 330, 160, 20);
		txtPartido10.setBackground(Color.WHITE);
		txtPartido10.setVisible(true);
		txtPartido10.addItem(Marcadores.LOCAL);
		txtPartido10.addItem(Marcadores.VISITANTE);
		txtPartido10.addItem(Marcadores.EMPATE);
		
		txtPartido11.setBounds(350, 360, 160, 20);
		txtPartido11.setBackground(Color.WHITE);
		txtPartido11.setVisible(true);
		txtPartido11.addItem(Marcadores.LOCAL);
		txtPartido11.addItem(Marcadores.VISITANTE);
		txtPartido11.addItem(Marcadores.EMPATE);
		
		txtPartido12.setBounds(350, 390, 160, 20);
		txtPartido12.setBackground(Color.WHITE);
		txtPartido12.setVisible(true);
		txtPartido12.addItem(Marcadores.LOCAL);
		txtPartido12.addItem(Marcadores.VISITANTE);
		txtPartido12.addItem(Marcadores.EMPATE);
		
		txtPartido13.setBounds(350, 420, 160, 20);
		txtPartido13.setBackground(Color.WHITE);
		txtPartido13.setVisible(true);
		txtPartido13.addItem(Marcadores.LOCAL);
		txtPartido13.addItem(Marcadores.VISITANTE);
		txtPartido13.addItem(Marcadores.EMPATE);
		
		txtPartido14.setBounds(350, 450, 160, 20);
		txtPartido14.setBackground(Color.WHITE);
		txtPartido14.setVisible(true);
		txtPartido14.addItem(Marcadores.LOCAL);
		txtPartido14.addItem(Marcadores.VISITANTE);
		txtPartido14.addItem(Marcadores.EMPATE);

		btnRegistrarPremio.setBounds(260, 480, 160, 20);
		btnRegistrarPremio.setBackground(Color.WHITE);
		btnRegistrarPremio.setVisible(true);
		btnRegistrarPremio.setText("Registrar");
		btnRegistrarPremio.addActionListener(listener);

		setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public JComboBox<String> getTxtPartido1() {
		return txtPartido1;
	}

	public void setTxtPartido1(JComboBox<String> txtPartido1) {
		this.txtPartido1 = txtPartido1;
	}

	public JComboBox<String> getTxtPartido2() {
		return txtPartido2;
	}

	public void setTxtPartido2(JComboBox<String> txtPartido2) {
		this.txtPartido2 = txtPartido2;
	}

	public JComboBox<String> getTxtPartido3() {
		return txtPartido3;
	}

	public void setTxtPartido3(JComboBox<String> txtPartido3) {
		this.txtPartido3 = txtPartido3;
	}

	public JComboBox<String> getTxtPartido4() {
		return txtPartido4;
	}

	public void setTxtPartido4(JComboBox<String> txtPartido4) {
		this.txtPartido4 = txtPartido4;
	}

	public JComboBox<String> getTxtPartido5() {
		return txtPartido5;
	}

	public void setTxtPartido5(JComboBox<String> txtPartido5) {
		this.txtPartido5 = txtPartido5;
	}

	public JComboBox<String> getTxtPartido6() {
		return txtPartido6;
	}

	public void setTxtPartido6(JComboBox<String> txtPartido6) {
		this.txtPartido6 = txtPartido6;
	}

	public JComboBox<String> getTxtPartido7() {
		return txtPartido7;
	}

	public void setTxtPartido7(JComboBox<String> txtPartido7) {
		this.txtPartido7 = txtPartido7;
	}

	public JComboBox<String> getTxtPartido8() {
		return txtPartido8;
	}

	public void setTxtPartido8(JComboBox<String> txtPartido8) {
		this.txtPartido8 = txtPartido8;
	}

	public JComboBox<String> getTxtPartido9() {
		return txtPartido9;
	}

	public void setTxtPartido9(JComboBox<String> txtPartido9) {
		this.txtPartido9 = txtPartido9;
	}

	public JComboBox<String> getTxtPartido10() {
		return txtPartido10;
	}

	public void setTxtPartido10(JComboBox<String> txtPartido10) {
		this.txtPartido10 = txtPartido10;
	}

	public JComboBox<String> getTxtPartido11() {
		return txtPartido11;
	}

	public void setTxtPartido11(JComboBox<String> txtPartido11) {
		this.txtPartido11 = txtPartido11;
	}

	public JComboBox<String> getTxtPartido12() {
		return txtPartido12;
	}

	public void setTxtPartido12(JComboBox<String> txtPartido12) {
		this.txtPartido12 = txtPartido12;
	}

	public JComboBox<String> getTxtPartido13() {
		return txtPartido13;
	}

	public void setTxtPartido13(JComboBox<String> txtPartido13) {
		this.txtPartido13 = txtPartido13;
	}

	public JComboBox<String> getTxtPartido14() {
		return txtPartido14;
	}

	public void setTxtPartido14(JComboBox<String> txtPartido14) {
		this.txtPartido14 = txtPartido14;
	}

	public JButton getBtnRegistrarPremio() {
		return btnRegistrarPremio;
	}

	public void setBtnRegistrarPremio(JButton btnRegistrarPremio) {
		this.btnRegistrarPremio = btnRegistrarPremio;
	}


	
}
