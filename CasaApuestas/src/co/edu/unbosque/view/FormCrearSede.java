package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FormCrearSede extends JFrame {
	
	ActionListener listener;
	
	JLabel lblUbicacion = new JLabel();
	JLabel lblNumEmpleados = new JLabel();
	
	JTextArea txtUbicacion = new JTextArea();
	JTextArea txtNumEmpleados = new JTextArea();
	
	JButton btnCreatSede = new JButton();
	
	public FormCrearSede(ActionListener controller)  {
		super();
		listener = controller;
		this.setSize(600, 600);
		JPanel panel = new JPanel();
		this.setTitle(" Crear Sede");
		this.getContentPane().add(panel);
		panel.add(lblUbicacion);
		panel.add(lblNumEmpleados);
		panel.add(txtUbicacion);
		panel.add(txtNumEmpleados);
		panel.add(btnCreatSede);
		
		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Sede.jpg"));
		etiqueta.setBounds(0, 0, 600, 600);

		panel.setLayout(null);
		panel.add(etiqueta);
		
		lblUbicacion.setText("Ubicación:");
		lblUbicacion.setBounds(150, 150, 150, 20);
		lblUbicacion.setForeground(Color.WHITE);
		lblUbicacion.setBackground(Color.BLACK);
		lblUbicacion.setOpaque(true);
		lblUbicacion.setVisible(true);

		lblNumEmpleados.setText("Numero de empleados:");
		lblNumEmpleados.setBounds(150, 250, 150, 20);
		lblNumEmpleados.setForeground(Color.WHITE);
		lblNumEmpleados.setBackground(Color.BLACK);
		lblNumEmpleados.setOpaque(true);
		lblNumEmpleados.setVisible(true);
		
		txtUbicacion.setBounds(350, 150, 160, 20);
		txtUbicacion.setBackground(Color.WHITE);
		txtUbicacion.setVisible(true);

		txtNumEmpleados.setBounds(350, 250, 160, 20);
		txtNumEmpleados.setBackground(Color.WHITE);
		txtNumEmpleados.setVisible(true);

		btnCreatSede.setBounds(260, 350, 160, 20);
		btnCreatSede.setBackground(Color.WHITE);
		btnCreatSede.setVisible(true);
		btnCreatSede.setText("Crear");
		btnCreatSede.addActionListener(listener);
		
		setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public JLabel getLblUbicacion() {
		return lblUbicacion;
	}

	public void setLblUbicacion(JLabel lblUbicacion) {
		this.lblUbicacion = lblUbicacion;
	}

	public JLabel getLblNumEmpleados() {
		return lblNumEmpleados;
	}

	public void setLblNumEmpleados(JLabel lblNumEmpleados) {
		this.lblNumEmpleados = lblNumEmpleados;
	}

	public JTextArea getTxtUbicacion() {
		return txtUbicacion;
	}

	public void setTxtUbicacion(JTextArea txtUbicacion) {
		this.txtUbicacion = txtUbicacion;
	}

	public JTextArea getTxtNumEmpleados() {
		return txtNumEmpleados;
	}

	public void setTxtNumEmpleados(JTextArea txtNumEmpleados) {
		this.txtNumEmpleados = txtNumEmpleados;
	}

	public JButton getBtnCreatSede() {
		return btnCreatSede;
	}

	public void setBtnCreatSede(JButton btnCreatSede) {
		this.btnCreatSede = btnCreatSede;
	}

}
