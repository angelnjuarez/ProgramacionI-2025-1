package clase12practica1;

public class Agenda {
	Persona[] contactos;
	String[] telefonos;

	/*
	 * contactos.length == telefonos.length
	 */

	public Agenda(int tamanio) {
		this.contactos = new Persona[tamanio];
		this.telefonos = new String[tamanio];
	}

	void guardar(Persona contacto, String telefono) {
		int pos = posicionLibre();
		if (pos == -1) {
			this.agregarLugares();
			pos = posicionLibre();
		}
		this.contactos[pos] = contacto;
		this.telefonos[pos] = telefono;
	}

	private int posicionLibre() {
		for (int i = 0; i < this.contactos.length; i++) {
			if (this.contactos[i] == null) {
				return i;
			}
		}
		return -1;
	}

	private void agregarLugares() {
		Persona[] nuevoContacto = new Persona[this.contactos.length + 10];
		String[] nuevoTelefonos = new String[this.telefonos.length + 10];
		for (int i = 0; i < this.contactos.length; i++) {
			nuevoContacto[i] = this.contactos[i];
			nuevoTelefonos[i] = this.telefonos[i];
		}
		this.contactos = nuevoContacto;
		this.telefonos = nuevoTelefonos;
	}

	void eliminar(Persona contacto) {
		for (int i = 0; i < this.contactos.length; i++) {
			if (this.contactos[i].mismaPersona(contacto)) {
				this.contactos[i] = null;
				this.telefonos[i] = null;
				return;
			}
		}
	}

	boolean pertenece(Persona contacto) {
		for (int i = 0; i < this.contactos.length; i++) {
			if (this.contactos[i].mismaPersona(contacto)) {
				return true;
			}
		}
		return false;
	}

	String dameTelefono(Persona contacto) {
		if (this.pertenece(contacto)) {
			for (int i = 0; i < this.contactos.length; i++) {
				if (this.contactos[i].mismaPersona(contacto)) {
					return this.telefonos[i];
				}
			}
		}
		throw new RuntimeException("El contacto no está");
	}
	
	int perteneceV2(Persona contacto) {
		for (int i = 0; i < this.contactos.length; i++) {
			if (this.contactos[i].mismaPersona(contacto)) {
				return i;
			}
		}
		return -1;
	}
	
	String dameTelefonoV2(Persona contacto) {
		int pos = perteneceV2(contacto);
		if (pos != -1) {
			return this.telefonos[pos];
		}
		throw new RuntimeException("El contacto no está");
	}

}
