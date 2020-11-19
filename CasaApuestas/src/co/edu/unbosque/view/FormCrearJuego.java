package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import co.edu.unbosque.model.Juego;

public class FormCrearJuego extends JFrame {
	
	ActionListener listener;
	JLabel lblNombreJuego = new JLabel();
	JLabel lblTipoJuego  = new JLabel();
	JLabel lblPresupuestoJuego = new JLabel();
	JTextArea txtNombreJuego = new JTextArea();
	JComboBox<String> txtTipoJuego = new JComboBox<String>();
	JTextArea txtPresupuestoJuego = new JTextArea();
	JButton btnCreatJuego = new JButton();
	
	public FormCrearJuego(ActionListener controller)  {
		super();
		listener = controller;
		this.setSize(600,600);
		JPanel panel = new JPanel();
		this.setTitle(" Crear Juego");
		this.getContentPane().add(panel);
		panel.add(lblNombreJuego);
		panel.add(lblTipoJuego);
		panel.add(lblPresupuestoJuego);
		panel.add(txtNombreJuego);
		panel.add(txtTipoJuego);
		panel.add(txtPresupuestoJuego);
		panel.add(btnCreatJuego);

		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Juegos.jpg"));
		etiqueta.setBounds(0,0, 600, 600);

		panel.setLayout(null);
		panel.add(etiqueta);
		
		lblNombreJuego.setText("Nombre Juego:");
		lblNombreJuego.setBounds(150, 150, 150, 20);
		lblNombreJuego.setForeground(Color.WHITE);
		lblNombreJuego.setBackground(Color.BLACK);
		lblNombreJuego.setOpaque(true);
		lblNombreJuego.setVisible(true);
		
		lblTipoJuego.setText("Tipo Juego:");
		lblTipoJuego.setBounds(150, 250, 150, 20);
		lblTipoJuego.setForeground(Color.WHITE);
		lblTipoJuego.setBackground(Color.BLACK);
		lblTipoJuego.setOpaque(true);
		lblTipoJuego.setVisible(true);
		
		lblPresupuestoJuego.setText("Presupuesto Juego:");
		lblPresupuestoJuego.setBounds(150, 350, 150, 20);
		lblPresupuestoJuego.setForeground(Color.WHITE);
		lblPresupuestoJuego.setBackground(Color.BLACK);
		lblPresupuestoJuego.setOpaque(true);
		lblPresupuestoJuego.setVisible(true);
		
		txtNombreJuego.setBounds(350, 150, 160, 20);
		txtNombreJuego.setBackground(Color.WHITE);
		txtNombreJuego.setVisible(true);
		
		txtTipoJuego.setBounds(350, 250, 160, 20);
		txtTipoJuego.setBackground(Color.WHITE);
		txtTipoJuego.setVisible(true);
		txtTipoJuego.addItem(Juego.LOTERIA);
		txtTipoJuego.addItem(Juego.CHANCE);
		txtTipoJuego.addItem(Juego.DEPORTIVO);

		txtPresupuestoJuego.setBounds(350, 350, 160, 20);
		txtPresupuestoJuego.setBackground(Color.WHITE);
		txtPresupuestoJuego.setVisible(true);
		
		btnCreatJuego.setBounds(260, 450, 160, 20);
		btnCreatJuego.setBackground(Color.WHITE);
		btnCreatJuego.setVisible(true);
		btnCreatJuego.setText("Crear");
		btnCreatJuego.addActionListener(listener);

		setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public JLabel getLblNombreJuego() {
		return lblNombreJuego;
	}

	public void setLblNombreJuego(JLabel lblNombreJuego) {
		this.lblNombreJuego = lblNombreJuego;
	}

	public JLabel getLblTipoJuego() {
		return lblTipoJuego;
	}

	public void setLblTipoJuego(JLabel lblTipoJuego) {
		this.lblTipoJuego = lblTipoJuego;
	}

	public JLabel getLblPresupuestoJuego() {
		return lblPresupuestoJuego;
	}

	public void setLblPresupuestoJuego(JLabel lblPresupuestoJuego) {
		this.lblPresupuestoJuego = lblPresupuestoJuego;
	}

	public JTextArea getTxtNombreJuego() {
		return txtNombreJuego;
	}

	public void setTxtNombreJuego(JTextArea txtNombreJuego) {
		this.txtNombreJuego = txtNombreJuego;
	}

	public JComboBox<String> getTxtTipoJuego() {
		return txtTipoJuego;
	}

	public void setTxtTipoJuego(JComboBox<String> txtTipoJuego) {
		this.txtTipoJuego = txtTipoJuego;
	}

	public JTextArea getTxtPresupuestoJuego() {
		return txtPresupuestoJuego;
	}

	public void setTxtPresupuestoJuego(JTextArea txtPresupuestoJuego) {
		this.txtPresupuestoJuego = txtPresupuestoJuego;
	}

	public JButton getBtnCreatJuego() {
		return btnCreatJuego;
	}

	public void setBtnCreatJuego(JButton btnCreatJuego) {
		this.btnCreatJuego = btnCreatJuego;
	}


	
}
