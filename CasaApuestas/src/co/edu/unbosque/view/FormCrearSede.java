package co.edu.unbosque.view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class FormCrearSede extends JFrame {
	
	ActionListener listener;
	
	
	public FormCrearSede(ActionListener controller)  {
		super();
		listener = controller;

	}


}
