package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import co.edu.unbosque.controller.GestionJuegos;
import co.edu.unbosque.model.Juego;

public class Premios extends JFrame {
	

	ActionListener listener;
	JButton btnRegistrarBaloto = new JButton();
	JButton btnRegistrarSuperAstro = new JButton();
	JButton btnRegistrarMarcadores = new JButton();
	
	public Premios(ActionListener controller)  {
		super();
		listener = controller;
		this.setSize(600,600);
		JPanel panel = new JPanel();
		this.setTitle(" Reportes");
		this.getContentPane().add(panel);
		panel.add(btnRegistrarBaloto);
		panel.add(btnRegistrarSuperAstro);
		panel.add(btnRegistrarMarcadores);
		
		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Juegos.jpg"));
		etiqueta.setBounds(0,0, 600, 600);

		panel.setLayout(null);
		panel.add(etiqueta);
		
		
		btnRegistrarBaloto.setBounds(100, 100, 150, 50);
		btnRegistrarBaloto.setText("Baloto");
		btnRegistrarBaloto.setBackground(Color.WHITE);
		btnRegistrarBaloto.addActionListener(listener);
		
		btnRegistrarSuperAstro.setBounds(300, 100, 150, 50);
		btnRegistrarSuperAstro.setText("Super Astro");
		btnRegistrarSuperAstro.setBackground(Color.WHITE);
		btnRegistrarSuperAstro.addActionListener(listener);
		
		btnRegistrarMarcadores.setBounds(100, 200, 150, 50);
		btnRegistrarMarcadores.setText("Marcadores");
		btnRegistrarMarcadores.setBackground(Color.WHITE);
		btnRegistrarMarcadores.addActionListener(listener);
		
		setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public JButton getBtnRegistrarBaloto() {
		return btnRegistrarBaloto;
	}

	public void setBtnRegistrarBaloto(JButton btnRegistrarBaloto) {
		this.btnRegistrarBaloto = btnRegistrarBaloto;
	}

	public JButton getBtnRegistrarSuperAstro() {
		return btnRegistrarSuperAstro;
	}

	public void setBtnRegistrarSuperAstro(JButton btnRegistrarSuperAstro) {
		this.btnRegistrarSuperAstro = btnRegistrarSuperAstro;
	}

	public JButton getBtnRegistrarMarcadores() {
		return btnRegistrarMarcadores;
	}

	public void setBtnRegistrarMarcadores(JButton btnRegistrarMarcadores) {
		this.btnRegistrarMarcadores = btnRegistrarMarcadores;
	}

}
