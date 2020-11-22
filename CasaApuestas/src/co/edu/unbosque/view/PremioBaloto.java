package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PremioBaloto extends JFrame {

	ActionListener listener;
	JLabel lblNumero = new JLabel();

	JTextArea txtNumero = new JTextArea();

	JButton btnRegistrarNumero = new JButton();

	public PremioBaloto(ActionListener controller) {
		super();
		listener = controller;
		this.setSize(600, 600);
		JPanel panel = new JPanel();
		this.setTitle(" Registrar Baloto Ganador");
		this.getContentPane().add(panel);
		panel.add(lblNumero);
		
		panel.add(txtNumero);
		
		panel.add(btnRegistrarNumero);

		JLabel etiqueta = new JLabel();
		etiqueta.setIcon(new ImageIcon("Imagenes/Apostador.jpg"));
		etiqueta.setBounds(0, 0, 600, 600);

		panel.setLayout(null);
		panel.add(etiqueta);

		lblNumero.setText("Numero Ganador:");
		lblNumero.setBounds(150, 150, 150, 20);
		lblNumero.setForeground(Color.BLACK);
		lblNumero.setBackground(Color.WHITE);
		lblNumero.setOpaque(true);
		lblNumero.setVisible(true);


		txtNumero.setBounds(350, 150, 160, 20);
		txtNumero.setBackground(Color.WHITE);
		txtNumero.setVisible(true);

		btnRegistrarNumero.setBounds(260, 190, 160, 20);
		btnRegistrarNumero.setBackground(Color.WHITE);
		btnRegistrarNumero.setVisible(true);
		btnRegistrarNumero.setText("Registrar");
		btnRegistrarNumero.addActionListener(listener);

		setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public JLabel getLblNumero() {
		return lblNumero;
	}

	public void setLblNumero(JLabel lblNumero) {
		this.lblNumero = lblNumero;
	}

	public JTextArea getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextArea txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getBtnRegistrarNumero() {
		return btnRegistrarNumero;
	}

	public void setBtnRegistrarNumero(JButton btnRegistrarNumero) {
		this.btnRegistrarNumero = btnRegistrarNumero;
	}


	
}
