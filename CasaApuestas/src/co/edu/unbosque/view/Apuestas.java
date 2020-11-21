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
	JButton btnAbrirCrearSuperAstro = new JButton();
	JButton btnAbrirCrearBaloto = new JButton();
	JButton btnAbrirCrearMarcador = new JButton();
	JTable tablaApuestas = new JTable();
	JPanel panel = new JPanel();

	public Apuestas(ActionListener controller) {
		super();
		listener = controller;
		this.setSize(600, 600);
		this.setTitle(" Sedes");
		this.getContentPane().add(panel);
		panel.add(btnAbrirCrearSuperAstro);
		panel.add(btnAbrirCrearBaloto);
		panel.add(btnAbrirCrearMarcador);
		panel.add(tablaApuestas);
		cargarApuestas();

		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Sede.jpg"));
		etiqueta.setBounds(0, 0, 600, 600);

		panel.setLayout(null);
		panel.add(etiqueta);

		btnAbrirCrearSuperAstro.setBounds(50, 150, 150, 50);
		btnAbrirCrearSuperAstro.setText("Crear SuperAstro");
		btnAbrirCrearSuperAstro.setBackground(Color.WHITE);
		btnAbrirCrearSuperAstro.addActionListener(listener);

		btnAbrirCrearBaloto.setBounds(230, 150, 150, 50);
		btnAbrirCrearBaloto.setText("Crear Baloto");
		btnAbrirCrearBaloto.setBackground(Color.WHITE);
		btnAbrirCrearBaloto.addActionListener(listener);

		btnAbrirCrearMarcador.setBounds(410, 150, 150, 50);
		btnAbrirCrearMarcador.setText("Crear Marcador");
		btnAbrirCrearMarcador.setBackground(Color.WHITE);
		btnAbrirCrearMarcador.addActionListener(listener);

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

	public JButton getBtnAbrirCrearSuperAstro() {
		return btnAbrirCrearSuperAstro;
	}

	public void setBtnAbrirCrearSuperAstro(JButton btnAbrirCrearSuperAstro) {
		this.btnAbrirCrearSuperAstro = btnAbrirCrearSuperAstro;
	}

	public JButton getBtnAbrirCrearBaloto() {
		return btnAbrirCrearBaloto;
	}

	public void setBtnAbrirCrearBaloto(JButton btnAbrirCrearBaloto) {
		this.btnAbrirCrearBaloto = btnAbrirCrearBaloto;
	}

	public JButton getBtnAbrirCrearMarcador() {
		return btnAbrirCrearMarcador;
	}

	public void setBtnAbrirCrearMarcador(JButton btnAbrirCrearMarcador) {
		this.btnAbrirCrearMarcador = btnAbrirCrearMarcador;
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

}
