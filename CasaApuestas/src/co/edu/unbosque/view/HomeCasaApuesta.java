package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeCasaApuesta extends JFrame {

	JButton btnSedes = new JButton();
	JButton btnApostadores = new JButton();
	JButton btnJuegos = new JButton();
	JButton btnApuestas = new JButton();
	JButton btnReportes = new JButton();
	JButton btnPremiacion = new JButton();
	
	ActionListener listener;
	
	public HomeCasaApuesta(ActionListener controller)  {
		super();
		listener = controller;
		
		JPanel panel = new JPanel();
		JLabel etiqueta = new JLabel();

		etiqueta.setIcon(new ImageIcon("Imagenes/CasaApuestas.png"));
		etiqueta.setBounds(0,0, 600, 600);
		panel.setLayout(null);
		this.setTitle(" Casa de apuestas");
		this.getContentPane().add(panel);
		this.setSize(600,600);
		setLocationRelativeTo(null);
		
		panel.add(etiqueta);
		panel.add(btnSedes);
		panel.add(btnApostadores);
		panel.add(btnJuegos);
		panel.add(btnApuestas);
		panel.add(btnReportes);
		panel.add(btnPremiacion);

		
		btnSedes.setBounds(130, 200, 150, 50);
		btnSedes.setText("Sedes");
		btnSedes.setBackground(Color.WHITE);
		btnSedes.addActionListener(listener);
		
		btnApostadores.setBounds(330, 200, 150, 50);
		btnApostadores.setText("Apostadores");
		btnApostadores.setBackground(Color.WHITE);
		btnApostadores.addActionListener(listener);

		btnJuegos.setBounds(130, 300, 150, 50);
		btnJuegos.setText("Juegos");
		btnJuegos.setBackground(Color.WHITE);
		btnJuegos.addActionListener(listener);
		
		btnApuestas.setBounds(330, 300, 150, 50);
		btnApuestas.setText("Apuestas");
		btnApuestas.setBackground(Color.WHITE);
		btnApuestas.addActionListener(listener);
		
		btnReportes.setBounds(130, 400, 150, 50);
		btnReportes.setText("Reportes");
		btnReportes.setBackground(Color.WHITE);
		btnReportes.addActionListener(listener);
		
		btnPremiacion.setBounds(330, 400, 150, 50);
		btnPremiacion.setText("Premiacion");
		btnPremiacion.setBackground(Color.WHITE);
		btnPremiacion.addActionListener(listener);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public JButton getBtnSedes() {
		return btnSedes;
	}

	public void setBtnSedes(JButton btnSedes) {
		this.btnSedes = btnSedes;
	}

	public JButton getBtnApostadores() {
		return btnApostadores;
	}

	public void setBtnApostadores(JButton btnApostadores) {
		this.btnApostadores = btnApostadores;
	}

	public JButton getBtnJuegos() {
		return btnJuegos;
	}

	public void setBtnJuegos(JButton btnJuegos) {
		this.btnJuegos = btnJuegos;
	}

	public JButton getBtnApuestas() {
		return btnApuestas;
	}

	public void setBtnApuestas(JButton btnApuestas) {
		this.btnApuestas = btnApuestas;
	}

	public JButton getBtnReportes() {
		return btnReportes;
	}

	public void setBtnReportes(JButton btnReportes) {
		this.btnReportes = btnReportes;
	}

	public JButton getBtnPremiacion() {
		return btnPremiacion;
	}

	public void setBtnPremiacion(JButton btnPremiacion) {
		this.btnPremiacion = btnPremiacion;
	}
	
	

}
