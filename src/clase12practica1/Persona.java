package clase12practica1;

import java.util.Objects;

public class Persona {
    String nombre;
    int edad;
    
    public Persona(String n, int e) {
    	this.nombre = n;
    	this.edad = e;
    }
    
    boolean mismaPersona(Persona otro) {
    	return this.equals(otro);
    }

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
    
    
}
