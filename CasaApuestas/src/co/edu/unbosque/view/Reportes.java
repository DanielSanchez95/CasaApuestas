package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reportes extends JFrame {
	
	ActionListener listener;
	JButton btnAbrirTopSedes = new JButton();
	JButton btnAbrirTopClientes = new JButton();
	JButton btnAbrirTopTipoApuesta = new JButton();
	JButton btnAbrirHistorico = new JButton();
	
	public Reportes(ActionListener controller)  {
		super();
		listener = controller;
		this.setSize(600,600);
		JPanel panel = new JPanel();
		this.setTitle(" Reportes");
		this.getContentPane().add(panel);
		panel.add(btnAbrirTopSedes);
		panel.add(btnAbrirTopClientes);
		panel.add(btnAbrirTopTipoApuesta);
		panel.add(btnAbrirHistorico);
		
		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Juegos.jpg"));
		etiqueta.setBounds(0,0, 600, 600);

		panel.setLayout(null);
		panel.add(etiqueta);
		
		
		btnAbrirTopSedes.setBounds(100, 100, 150, 50);
		btnAbrirTopSedes.setText("Top sedes");
		btnAbrirTopSedes.setBackground(Color.WHITE);
		btnAbrirTopSedes.addActionListener(listener);
		
		btnAbrirTopClientes.setBounds(300, 100, 150, 50);
		btnAbrirTopClientes.setText("Top Clientes");
		btnAbrirTopClientes.setBackground(Color.WHITE);
		btnAbrirTopClientes.addActionListener(listener);
		
		btnAbrirTopTipoApuesta.setBounds(100, 200, 150, 50);
		btnAbrirTopTipoApuesta.setText("Top Tipo Apuesta");
		btnAbrirTopTipoApuesta.setBackground(Color.WHITE);
		btnAbrirTopTipoApuesta.addActionListener(listener);
		
		btnAbrirHistorico.setBounds(300, 200, 150, 50);
		btnAbrirHistorico.setText("Historico");
		btnAbrirHistorico.setBackground(Color.WHITE);
		btnAbrirHistorico.addActionListener(listener);
		
		setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public JButton getBtnAbrirTopSedes() {
		return btnAbrirTopSedes;
	}

	public void setBtnAbrirTopSedes(JButton btnAbrirTopSedes) {
		this.btnAbrirTopSedes = btnAbrirTopSedes;
	}

	public JButton getBtnAbrirTopClientes() {
		return btnAbrirTopClientes;
	}

	public void setBtnAbrirTopClientes(JButton btnAbrirTopClientes) {
		this.btnAbrirTopClientes = btnAbrirTopClientes;
	}

	public JButton getBtnAbrirTopTipoApuesta() {
		return btnAbrirTopTipoApuesta;
	}

	public void setBtnAbrirTopTipoApuesta(JButton btnAbrirTopTipoApuesta) {
		this.btnAbrirTopTipoApuesta = btnAbrirTopTipoApuesta;
	}

	public JButton getBtnAbrirHistorico() {
		return btnAbrirHistorico;
	}

	public void setBtnAbrirHistorico(JButton btnAbrirHistorico) {
		this.btnAbrirHistorico = btnAbrirHistorico;
	}

	

}
