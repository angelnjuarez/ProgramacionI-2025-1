package clase24ParcialTT2023Obj;

public class Sucursal {
	String nombreID;
	String direccion;
	Empleado[] empleados;
	Producto[] productos;
	int[] stock;
	Promocion[] promociones;
	
	public boolean todosTienenStock() {
		for (int i = 0; i<this.stock.length; i++) {
			if(this.stock[i]==0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean soloProductosMarca(String marca) {
		for (Producto p : this.productos) {
			if(!p.marca.equals(marca)) {
				return false;
			}
		}
		return true;
	}
}
