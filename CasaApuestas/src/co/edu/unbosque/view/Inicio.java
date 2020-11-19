package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Inicio extends JFrame{

	private static final long serialVersionUID = 1L;

	JLabel lblPresupuesto = new JLabel();
	JTextArea txtPresupuesto = new JTextArea();
	// botones de Acciones
	JButton btnRegistrar = new JButton();
	
	//el controlador asociado
	ActionListener listener;

	/**
	 * Constructor de la clase Inicio
	 * 
	 * @throws HeadlessException
	 */
	public Inicio(ActionListener controller) throws HeadlessException {
		super();
		listener = controller;
		this.setSize(600, 600);
		JPanel panel = new JPanel();
		this.setTitle(" Casa de apuestas");
		this.getContentPane().add(panel);
		panel.add(lblPresupuesto);
		panel.add(txtPresupuesto);
		panel.add(btnRegistrar);
		
		JLabel etiqueta = new JLabel();
		etiqueta.setIcon((new ImageIcon("Imagenes/Home.jpg")));
		etiqueta.setBounds(0,0, 600, 600);
		
		
		panel.setLayout(null);
		panel.add(etiqueta);
		

		// Agrego los botones de acciones
		btnRegistrar.setBounds(230, 300, 150, 50);
		btnRegistrar.setText("Guardar");
		btnRegistrar.setBackground(Color.WHITE);
		btnRegistrar.addActionListener(listener);

		lblPresupuesto.setText("Presupuesto General:");
		lblPresupuesto.setBounds(150, 250, 150, 20);
		lblPresupuesto.setForeground(Color.WHITE);
		
		txtPresupuesto.setBounds(280, 250, 160, 20);
		txtPresupuesto.setBackground(Color.WHITE);
	

		// llama al metodo para setear la ventana
		this.setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}

	public JTextArea getTxtPresupuesto() {
		return txtPresupuesto;
	}

	public void setTxtPresupuesto(JTextArea txtPresupuesto) {
		this.txtPresupuesto = txtPresupuesto;
	}

	
	
}
