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

import co.edu.unbosque.controller.GestionSede;
import co.edu.unbosque.model.SedeCasaApuesta;

public class Apuestas extends JFrame {
	
	ActionListener listener;
	JButton btnAbrirCrearApuesta = new JButton();
	JTable tablaApuestas = new JTable();
	JPanel panel = new JPanel();

	public Apuestas(ActionListener controller)  {
		super();
		listener = controller;
		this.setSize(600,600);
		this.setTitle(" Sedes");
		this.getContentPane().add(panel);
		panel.add(btnAbrirCrearApuesta);
		panel.add(tablaApuestas);
		cargarApuestas();
		
		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Sede.jpg"));
		etiqueta.setBounds(0,0, 600, 600);
		
		panel.setLayout(null);
		panel.add(etiqueta);
		

		btnAbrirCrearApuesta.setBounds(90, 150, 150, 50);
		btnAbrirCrearApuesta.setText("Crear Apuesta");
		btnAbrirCrearApuesta.setBackground(Color.WHITE);
		btnAbrirCrearApuesta.addActionListener(listener);

		setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	

	public void cargarApuestas() {
		// TODO crear gestion Apuesta
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
		
		tablaApuestas.setModel(tableModel);
		tablaApuestas.setPreferredScrollableViewportSize(new Dimension(300, 200));
		tablaApuestas.setBounds(100, 250, 300, 200);
		TableColumn col0 = tablaApuestas.getColumnModel().getColumn(0);
		TableColumn col1 = tablaApuestas.getColumnModel().getColumn(1);
		col0.setPreferredWidth(150);
		col1.setPreferredWidth(150);
		tablaApuestas.repaint();
		panel.repaint();
	}

	
//		super();
//		listener = controller;
//
//		JPanel panel = new JPanel();
//		JLabel etiqueta = new JLabel();
//
//		etiqueta.setIcon(new ImageIcon("Imagenes/Apuestas.jpg"));
//		etiqueta.setBounds(0, 0, 600, 600);
//		panel.setLayout(null);
//		this.setTitle(" Apuestas");
//		this.getContentPane().add(panel);
//		this.setSize(600, 600);
//		setLocationRelativeTo(null);
//
//		panel.add(etiqueta);
//	}
	

	public JButton getBtnAbrirCrearApuesta() {
		return btnAbrirCrearApuesta;
	}

	public void setBtnAbrirCrearApuesta(JButton btnAbrirCrearApuesta) {
		this.btnAbrirCrearApuesta = btnAbrirCrearApuesta;
	}

	
}
