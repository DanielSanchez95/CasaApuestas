package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
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
import co.edu.unbosque.controller.GestionSede;
import co.edu.unbosque.model.Juego;
import co.edu.unbosque.model.SedeCasaApuesta;

public class Sedes extends JFrame {
	ActionListener listener;
	JButton btnAbrirCrearSede = new JButton();
	JTable tablaSedes = new JTable();
	JPanel panel = new JPanel();
	
	public Sedes(ActionListener controller)  {
		super();
		listener = controller;
		this.setSize(600,600);
		this.setTitle(" Sedes");
		this.getContentPane().add(panel);
		panel.add(btnAbrirCrearSede);
		panel.add(tablaSedes);
		cargarSedes();
		
		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Sede.jpg"));
		etiqueta.setBounds(0,0, 600, 600);
		
		panel.setLayout(null);
		panel.add(etiqueta);
		

		btnAbrirCrearSede.setBounds(90, 150, 150, 50);
		btnAbrirCrearSede.setText("Crear Sede");
		btnAbrirCrearSede.setBackground(Color.WHITE);
		btnAbrirCrearSede.addActionListener(listener);

		setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	
	public void cargarSedes() {
		GestionSede objGestionSede = new GestionSede(); 
		List<SedeCasaApuesta> listaSedes = objGestionSede.listarSedes();
		DefaultTableModel tableModel = new DefaultTableModel();
		String[] columnNames = { "Nombre", "Tipo" };
		tableModel.setColumnIdentifiers(columnNames);
		Object[] fila = new Object[tableModel.getColumnCount()];
		for (int i = 0; i < listaSedes.size(); i++) {
			fila[0] = listaSedes.get(i).getUbicacion();
			fila[1] = listaSedes.get(i).getNumeroEmpleados();
			tableModel.addRow(fila);
		}
		
		tablaSedes.setModel(tableModel);
		tablaSedes.setPreferredScrollableViewportSize(new Dimension(300, 200));
		tablaSedes.setBounds(100, 250, 300, 200);
		TableColumn col0 = tablaSedes.getColumnModel().getColumn(0);
		TableColumn col1 = tablaSedes.getColumnModel().getColumn(1);
		col0.setPreferredWidth(150);
		col1.setPreferredWidth(150);
		tablaSedes.repaint();
		panel.repaint();
	}

	public JButton getBtnAbrirCrearSede() {
		return btnAbrirCrearSede;
	}


	public void setBtnAbrirCrearSede(JButton btnAbrirCrearSede) {
		this.btnAbrirCrearSede = btnAbrirCrearSede;
	}

	

}
