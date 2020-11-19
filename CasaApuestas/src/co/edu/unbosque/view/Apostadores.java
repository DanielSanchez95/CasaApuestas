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

import co.edu.unbosque.controller.GestionApostador;
import co.edu.unbosque.controller.GestionSede;
import co.edu.unbosque.model.Apostador;
import co.edu.unbosque.model.SedeCasaApuesta;

public class Apostadores extends JFrame {

	ActionListener listener;
	JButton btnAbrirCrearApostador = new JButton();
	JTable tablaApostadores = new JTable();
	JPanel panel = new JPanel();
	
	public Apostadores(ActionListener controller)  {
			super();
			listener = controller;
			this.setSize(600,600);
			this.setTitle(" Sedes");
			this.getContentPane().add(panel);
			panel.add(btnAbrirCrearApostador);
			panel.add(tablaApostadores);
			cargarApostadores();
			
			JLabel etiqueta = new JLabel();
			etiqueta.setIcon(new ImageIcon("Imagenes/Apostador.jpg"));
			etiqueta.setBounds(0,0, 600, 600);
			
			panel.setLayout(null);
			panel.add(etiqueta);
			

			btnAbrirCrearApostador.setBounds(90, 150, 150, 50);
			btnAbrirCrearApostador.setText("Crear Apostador");
			btnAbrirCrearApostador.setBackground(Color.WHITE);
			btnAbrirCrearApostador.addActionListener(listener);

			setLocationRelativeTo(null);
			this.setVisible(true);
			
		}

		
		public void cargarApostadores() {
			GestionApostador objGestionApostador = new GestionApostador(); 
			List<Apostador> listaApostadores = objGestionApostador.listarApostadores();
			DefaultTableModel tableModel = new DefaultTableModel();
			String[] columnNames = { "Documento", "Nombre", "Dirección" };
			tableModel.setColumnIdentifiers(columnNames);
			Object[] fila = new Object[tableModel.getColumnCount()];
			for (int i = 0; i < listaApostadores.size(); i++) {
				fila[0] = listaApostadores.get(i).getCedula();
				fila[1] = listaApostadores.get(i).getNombre();
				fila[2] = listaApostadores.get(i).getDireccion();
				tableModel.addRow(fila);
			}
			
			tablaApostadores.setModel(tableModel);
			tablaApostadores.setPreferredScrollableViewportSize(new Dimension(300, 200));
			tablaApostadores.setBounds(100, 250, 300, 200);
			TableColumn col0 = tablaApostadores.getColumnModel().getColumn(0);
			TableColumn col1 = tablaApostadores.getColumnModel().getColumn(1);
			TableColumn col2 = tablaApostadores.getColumnModel().getColumn(2);
			col0.setPreferredWidth(150);
			col1.setPreferredWidth(150);
			col2.setPreferredWidth(150);
			tablaApostadores.repaint();
			panel.repaint();
		}


		public JButton getBtnAbrirCrearApostador() {
			return btnAbrirCrearApostador;
		}


		public void setBtnAbrirCrearApostador(JButton btnAbrirCrearApostador) {
			this.btnAbrirCrearApostador = btnAbrirCrearApostador;
		}

		
}
