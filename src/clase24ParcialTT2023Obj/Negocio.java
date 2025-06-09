package clase24ParcialTT2023Obj;

import java.util.ArrayList;

public class Negocio {
	Sucursal[] sucursales;
	
	public int tinenStock() {
		int cantSucursales = 0;
		for (Sucursal s: this.sucursales) {
			if (s.todosTienenStock()) {
				cantSucursales++;
			}
		}
		return cantSucursales;
	}
	
	public ArrayList<Empleado> exclusivosPorMarca(String marca, int min) {
		ArrayList<Empleado> emp = new ArrayList<>();
		for ( Sucursal s : this.sucursales) {
			if (s.soloProductosMarca(marca)) {
				for (Empleado e : s.empleados) {
					if (e.ventas >= min && !emp.contains(e)) {
						emp.add(e);
					}
				}
			}
		}
		return emp;
	}
	
	
	
}