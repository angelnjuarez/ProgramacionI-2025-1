package clase25ParcialTM2019Obj;

import java.util.LinkedList;

public class ClinicaVeterinaria {
	public Atencion[] atenciones;

	public LinkedList<Atencion> atencionesMasCostosas(double costoMin) {
		LinkedList<Atencion> atMasCostosas = new LinkedList<>();
		for (Atencion at : this.atenciones) {
			if (at.costo() > costoMin) {
				atMasCostosas.add(at);
			}
		}
		return atMasCostosas;
	}
	
	public int atencionesCriticas(int antiguedadMinima) {
		int cantVete = 0;
		for (Atencion at : this.atenciones) {
			if (at.alMenosUno(antiguedadMinima)) {
				cantVete++;
			}
		}
		return cantVete;
	}
	
	
	
	
	
	
	
	
}
