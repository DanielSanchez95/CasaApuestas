package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import co.edu.unbosque.controller.GestionBaloto;
import co.edu.unbosque.controller.GestionMarcador;
import co.edu.unbosque.controller.GestionSuperAstro;
import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.model.Marcadores;
import co.edu.unbosque.model.SuperAstro;

public class HistoricoVentas extends JFrame {

	ActionListener listener;

	JTable tablaVentasSuperAstro = new JTable();
	JTable tablaVentasBaloto = new JTable();
	JTable tablaVentasMarcadores = new JTable();
	JPanel panel = new JPanel();

	public HistoricoVentas(ActionListener controller) {
		super();
		listener = controller;

		JLabel etiqueta = new JLabel();
		panel.add(tablaVentasSuperAstro);
		cargarTopSuperAstro();
		panel.add(tablaVentasBaloto);
		cargarTopBaloto();
		panel.add(tablaVentasMarcadores);
		cargarTopMarcadores();
		
		etiqueta.setIcon(new ImageIcon("Imagenes/Juegos.jpg"));
		etiqueta.setBounds(0, 0, 1300, 1000);
		panel.setLayout(null);
		this.setTitle(" Reportes");
		this.getContentPane().add(panel);
		this.setSize(1300, 1000);
		setLocationRelativeTo(null);

		panel.add(etiqueta);
		this.setVisible(true);

	}

	public void cargarTopSuperAstro() {
		List<SuperAstro> listaSedes = getTopSuperAstro();
		DefaultTableModel tableModel = new DefaultTableModel();
		String[] columnNames = { "Cedula", "Fecha", "Valor" };
		tableModel.setColumnIdentifiers(columnNames);
		Object[] fila = new Object[tableModel.getColumnCount()];
		for (int i = 0; i < listaSedes.size(); i++) {
			fila[0] = listaSedes.get(i).getCedula();
			fila[1] = listaSedes.get(i).getFecha();
			fila[2] = listaSedes.get(i).getValor();
			tableModel.addRow(fila);
		}

		tablaVentasSuperAstro.setModel(tableModel);
		tablaVentasSuperAstro.setPreferredScrollableViewportSize(new Dimension(300, 200));
		tablaVentasSuperAstro.setBounds(100, 250, 300, 200);
		TableColumn col0 = tablaVentasSuperAstro.getColumnModel().getColumn(0);
		TableColumn col1 = tablaVentasSuperAstro.getColumnModel().getColumn(1);
		TableColumn col2 = tablaVentasSuperAstro.getColumnModel().getColumn(2);
		col0.setPreferredWidth(150);
		col1.setPreferredWidth(150);
		col2.setPreferredWidth(150);
		tablaVentasSuperAstro.repaint();
		panel.repaint();
	}

	public void cargarTopBaloto() {
		List<Baloto> listaBaloto = getTopBaloto();
		DefaultTableModel tableModel = new DefaultTableModel();
		String[] columnNames = { "Cedula", "Fecha", "Valor" };
		tableModel.setColumnIdentifiers(columnNames);
		Object[] fila = new Object[tableModel.getColumnCount()];
		for (int i = 0; i < listaBaloto.size(); i++) {
			fila[0] = listaBaloto.get(i).getCedula();
			fila[1] = listaBaloto.get(i).getFecha();
			fila[2] = listaBaloto.get(i).getValor();
			tableModel.addRow(fila);
		}

		tablaVentasBaloto.setModel(tableModel);
		tablaVentasBaloto.setPreferredScrollableViewportSize(new Dimension(300, 200));
		tablaVentasBaloto.setBounds(500, 250, 300, 200);
		TableColumn col0 = tablaVentasBaloto.getColumnModel().getColumn(0);
		TableColumn col1 = tablaVentasBaloto.getColumnModel().getColumn(1);
		TableColumn col2 = tablaVentasBaloto.getColumnModel().getColumn(2);
		col0.setPreferredWidth(150);
		col1.setPreferredWidth(150);
		col2.setPreferredWidth(150);
		tablaVentasBaloto.repaint();
		panel.repaint();
	}
	
	public void cargarTopMarcadores() {
		List<Marcadores> listaBaloto = getTopMarcadores();
		DefaultTableModel tableModel = new DefaultTableModel();
		String[] columnNames = { "Cedula", "Fecha", "Valor" };
		tableModel.setColumnIdentifiers(columnNames);
		Object[] fila = new Object[tableModel.getColumnCount()];
		for (int i = 0; i < listaBaloto.size(); i++) {
			fila[0] = listaBaloto.get(i).getCedula();
			fila[1] = listaBaloto.get(i).getFecha();
			fila[2] = listaBaloto.get(i).getValor();
			tableModel.addRow(fila);
		}

		tablaVentasMarcadores.setModel(tableModel);
		tablaVentasMarcadores.setPreferredScrollableViewportSize(new Dimension(300, 200));
		tablaVentasMarcadores.setBounds(900, 250, 300, 200);
		TableColumn col0 = tablaVentasMarcadores.getColumnModel().getColumn(0);
		TableColumn col1 = tablaVentasMarcadores.getColumnModel().getColumn(1);
		TableColumn col2 = tablaVentasBaloto.getColumnModel().getColumn(2);
		col0.setPreferredWidth(150);
		col1.setPreferredWidth(150);
		col2.setPreferredWidth(150);
		tablaVentasMarcadores.repaint();
		panel.repaint();
	}

	public List<SuperAstro> getTopSuperAstro() {
		Map<String, Integer> topMap = new HashMap<>();

		List<SuperAstro> newListSuperAstro = new ArrayList<>();

		GestionSuperAstro objGestionSuperAstro = new GestionSuperAstro();
		List<SuperAstro> listSuperAstro = objGestionSuperAstro.listarJuego();
		for (SuperAstro superAstro : listSuperAstro) {
			if (tomarDiasDiferencia(superAstro.getFecha(), new Date()) <= 5) {
				newListSuperAstro.add(superAstro);
			}
//			Integer val = topMap.get(superAstro.getSede());
//			if(val==null)
//				val=0;
//			topMap.put(superAstro.getSede(), ++val);
		}

//		GestionBaloto objGestionBaloto = new GestionBaloto();
//		List<Baloto> listBaloto = objGestionBaloto.listarJuego();
//		for (Baloto baloto : listBaloto) {
//			Integer val = topMap.get(baloto.getSede());
//			if(val==null)
//				val=0;
//			topMap.put(baloto.getSede(), ++val);
//		}
//		
//
//		GestionMarcador objGestionMarcador = new GestionMarcador();
//		List<Marcadores> listMarcador = objGestionMarcador.listarJuego();
//		for (Marcadores marcador : listMarcador) {
//			Integer val = topMap.get(marcador.getSede());
//			if(val==null)
//				val=0;
//			topMap.put(marcador.getSede(), ++val);
//		}
//		
//		GestionSede objGestionSedes = new GestionSede(); 
//		List<SedeCasaApuesta> listaSedes = objGestionSedes.listarSedes();
		return newListSuperAstro;
	}

	public List<Baloto> getTopBaloto() {
		Map<String, Integer> topMap = new HashMap<>();

		List<Baloto> newListBaloto = new ArrayList<>();

		GestionBaloto objGestionBaloto = new GestionBaloto();
		List<Baloto> listBaloto = objGestionBaloto.listarJuego();
		for (Baloto baloto : listBaloto) {
			if (tomarDiasDiferencia(baloto.getFecha(), new Date()) <= 5) {
				newListBaloto.add(baloto);
			}
		}
		return newListBaloto;
	}
	
	public List<Marcadores> getTopMarcadores() {
		Map<String, Integer> topMap = new HashMap<>();
		
		List<Marcadores> newListMarcadore = new ArrayList<>();
		
		GestionMarcador objGestionMarcador = new GestionMarcador();
		List<Marcadores> listMarcadores = objGestionMarcador.listarJuego();
		for (Marcadores marcador : listMarcadores) {
			if (tomarDiasDiferencia(marcador.getFecha(), new Date()) <= 5) {
				newListMarcadore.add(marcador);
			}
		}
		return newListMarcadore;
	}

	public int tomarDiasDiferencia(Date fechaInicio, Date fechaFin) {
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();

//	     SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

//	     Date date = sdf.parse();
		cal1.setTime(fechaInicio);
//	     date = sdf.parse("your second date");
		cal2.setTime(fechaFin);

		return daysBetween(cal1.getTime(), cal2.getTime());
	}

	public int daysBetween(Date d1, Date d2) {
		return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}

}
