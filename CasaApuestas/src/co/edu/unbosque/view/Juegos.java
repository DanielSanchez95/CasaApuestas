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

public class Juegos extends JFrame {
	
	ActionListener listener;
	JButton btnOpenCrearJuego = new JButton();
	JTable tablaJuegos = new JTable();
	JPanel panel = new JPanel();
	
	public Juegos(ActionListener controller)  {
		super();
		listener = controller;
		
		JLabel etiqueta = new JLabel();
		panel.add(tablaJuegos);
		cargarJuegos();
		
		etiqueta.setIcon(new ImageIcon("Imagenes/Juegos.jpg"));
		etiqueta.setBounds(0,0, 600, 600);
		panel.setLayout(null);
		this.setTitle(" Top de ventas");
		this.getContentPane().add(panel);
		this.setSize(600,600);
		setLocationRelativeTo(null);
		
		panel.add(etiqueta);
		panel.add(btnOpenCrearJuego);
		
		btnOpenCrearJuego.setBounds(90, 150, 150, 50);
		btnOpenCrearJuego.setText("Crear Juego");
		btnOpenCrearJuego.setBackground(Color.WHITE);
		btnOpenCrearJuego.addActionListener(listener);
		
	}

	public void cargarJuegos() {
		GestionJuegos objGestionJuegos = new GestionJuegos(); 
		List<Juego> listaJuegos = objGestionJuegos.listarJuego();
		DefaultTableModel tableModel = new DefaultTableModel();
		String[] columnNames = { "Nombre", "Tipo" };
		tableModel.setColumnIdentifiers(columnNames);
		Object[] fila = new Object[tableModel.getColumnCount()];
		for (int i = 0; i < listaJuegos.size(); i++) {
			fila[0] = listaJuegos.get(i).getNombreJuego();
			fila[1] = listaJuegos.get(i).getTipoJuego();
			tableModel.addRow(fila);
		}
		
		tablaJuegos.setModel(tableModel);
		tablaJuegos.setPreferredScrollableViewportSize(new Dimension(300, 200));
		tablaJuegos.setBounds(100, 250, 300, 200);
		TableColumn col0 = tablaJuegos.getColumnModel().getColumn(0);
		TableColumn col1 = tablaJuegos.getColumnModel().getColumn(1);
		col0.setPreferredWidth(150);
		col1.setPreferredWidth(150);
		tablaJuegos.repaint();
		panel.repaint();
	}
	
	public JButton getBtnOpenCrearJuego() {
		return btnOpenCrearJuego;
	}

	public void setBtnOpenCrearJuego(JButton btnOpenCrearJuego) {
		this.btnOpenCrearJuego = btnOpenCrearJuego;
	}

}
