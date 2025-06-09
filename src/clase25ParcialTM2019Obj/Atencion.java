package clase25ParcialTM2019Obj;

public class Atencion {
	public Veterinario[] veterinarios;
	public Mascota[] mascotas;
	public Medicamento[] medicamentos;

	public double costo() {
		double costo = 500;
		for (Medicamento me : this.medicamentos) {
			costo += me.precio;
		}
		return costo;
	}

	public boolean alMenosUno(int antiguedadMinima) {
		for (Veterinario vet : this.veterinarios) {
			if (vet.antiguedad > antiguedadMinima) {
				return true;
			}
		}
		return false;
	}
}
