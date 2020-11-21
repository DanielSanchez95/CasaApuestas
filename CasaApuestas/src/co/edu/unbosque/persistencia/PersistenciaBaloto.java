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

import co.edu.unbosque.model.Baloto;

public class PersistenciaBaloto {

	private InputStream entrada;
	private ObjectInputStream entradaBinario;
	private ObjectOutputStream salidaBinario;
	private File archivo = new File("data/apuestas-baloto.dat");

	public PersistenciaBaloto() {
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

	public boolean guardarEnArchivo(List<Baloto> lista) {
		try {
			salidaBinario = new ObjectOutputStream(new FileOutputStream(archivo));
			salidaBinario.writeObject(lista);
			salidaBinario.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Baloto> leerArchivo() {
		List<Baloto> lista = new ArrayList<Baloto>();
		if (archivo.length() != 0) {
			try {
				entradaBinario = new ObjectInputStream(new FileInputStream(archivo));
				lista = (List<Baloto>) entradaBinario.readObject();
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
