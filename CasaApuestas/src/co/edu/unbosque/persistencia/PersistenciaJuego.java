package co.edu.unbosque.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Juego;

public class PersistenciaJuego {

	private InputStream entrada;
	private ObjectInputStream entradaBinario;
	private ObjectOutputStream salidaBinario;
	private File archivo = new File("data/juegos.dat");

	public PersistenciaJuego() {
		cargarArchivoBinario();
	}

	private void cargarArchivoBinario() {
		if (archivo.exists()) {
		} else {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void guardarEnArchivo(List<Juego> lista) {
		try {
			salidaBinario = new ObjectOutputStream(new FileOutputStream(archivo));
			salidaBinario.writeObject(lista);
			salidaBinario.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Juego> leerArchivo() {
		List<Juego> lista = new ArrayList<Juego>();
		if (archivo.length() != 0) {
			try {
				entradaBinario = new ObjectInputStream(new FileInputStream(archivo));
				lista = (List<Juego>) entradaBinario.readObject();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}

	public InputStream getEntrada() {
		return entrada;
	}

	public void setEntrada(InputStream entrada) {
		this.entrada = entrada;
	}

	public ObjectInputStream getEntradaBinario() {
		return entradaBinario;
	}

	public void setEntradaBinario(ObjectInputStream entradaBinario) {
		this.entradaBinario = entradaBinario;
	}

	public ObjectOutputStream getSalidaBinario() {
		return salidaBinario;
	}

	public void setSalidaBinario(ObjectOutputStream salidaBinario) {
		this.salidaBinario = salidaBinario;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

}
