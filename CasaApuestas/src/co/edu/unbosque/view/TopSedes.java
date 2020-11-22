package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
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
import co.edu.unbosque.controller.GestionSede;
import co.edu.unbosque.controller.GestionSuperAstro;
import co.edu.unbosque.model.Baloto;
import co.edu.unbosque.model.Marcadores;
import co.edu.unbosque.model.SedeCasaApuesta;
import co.edu.unbosque.model.SuperAstro;

public class TopSedes extends JFrame {

	ActionListener listener;

	JTable tablaTopSedes = new JTable();
	JPanel panel = new JPanel();

	Map<String, Integer> mapSedes;

	public TopSedes(ActionListener controller) {
		super();
		listener = controller;

		JLabel etiqueta = new JLabel();
		mapSedes = new HashMap<>();
		panel.add(tablaTopSedes);
		cargarTopSedes();

		etiqueta.setIcon(new ImageIcon("Imagenes/Juegos.jpg"));
		etiqueta.setBounds(0, 0, 600, 600);
		panel.setLayout(null);
		this.setTitle(" Top Sedes");
		this.getContentPane().add(panel);
		this.setSize(600, 600);
		setLocationRelativeTo(null);

		panel.add(etiqueta);
		this.setVisible(true);

	}

	public void getTopSedesBaloto(List<SedeCasaApuesta> listaSedes) {
		GestionBaloto objGB = new GestionBaloto();
		List<Baloto> listaBaloto = objGB.listarJuego();
		for (Baloto baloto : listaBaloto) {
			Integer valor = mapSedes.get(baloto.getSede());
			if (valor == null)
				valor = 0;
			mapSedes.put(baloto.getSede(), ++valor);
		}
	}

	public void getTopSedesSuperAstro(List<SedeCasaApuesta> listaSedes) {
		GestionSuperAstro objGSA = new GestionSuperAstro();
		List<SuperAstro> listaSuperAstro = objGSA.listarJuego();
		for (SuperAstro superAstro : listaSuperAstro) {
			Integer valor = mapSedes.get(superAstro.getSede());
			if (valor == null)
				valor = 0;
			mapSedes.put(superAstro.getSede(), ++valor);
		}
	}

	public void getTopSedesMarcadores(List<SedeCasaApuesta> listaSedes) {
		GestionMarcador objGM = new GestionMarcador();
		List<Marcadores> listaMarcadores = objGM.listarJuego();
		for (Marcadores marcadores : listaMarcadores) {
			Integer valor = mapSedes.get(marcadores.getSede());
			if (valor == null)
				valor = 0;
			mapSedes.put(marcadores.getSede(), ++valor);
		}
	}

	public Map<String, Integer> getTopSedes() {

		GestionSede objGS = new GestionSede();
		getTopSedesBaloto(objGS.listarSedes());
		getTopSedesSuperAstro(objGS.listarSedes());
		getTopSedesMarcadores(objGS.listarSedes());

		Map<String, Integer> newMap = new HashMap<>();

		Iterator<Map.Entry<String, Integer>> iteration = mapSedes.entrySet().iterator();

		while (iteration.hasNext()) {
			Map.Entry<String, Integer> entry = iteration.next();
			newMap.put(entry.getKey(), entry.getValue());
			if (newMap.size() == 5)
				break;
		}
		return newMap;

	}

	public void cargarTopSedes() {
		Map<String, Integer> listaSedes = getTopSedes();
		DefaultTableModel tableModel = new DefaultTableModel();
		String[] columnNames = { "Sede", "Cantidad" };
		tableModel.setColumnIdentifiers(columnNames);
		Object[] fila = new Object[tableModel.getColumnCount()];
		
		Iterator<Map.Entry<String, Integer>> iteration = listaSedes.entrySet().iterator();

		while (iteration.hasNext()) {
			Map.Entry<String, Integer> entry = iteration.next();
			fila[0] = entry.getKey();
			fila[1] = entry.getValue();
			tableModel.addRow(fila);
		}
		
		tablaTopSedes.setModel(tableModel);
		tablaTopSedes.setPreferredScrollableViewportSize(new Dimension(300, 200));
		tablaTopSedes.setBounds(100, 250, 300, 200);
		TableColumn col0 = tablaTopSedes.getColumnModel().getColumn(0);
		TableColumn col1 = tablaTopSedes.getColumnModel().getColumn(1);
		col0.setPreferredWidth(150);
		col1.setPreferredWidth(150);
		tablaTopSedes.repaint();
		panel.repaint();
	}

}
