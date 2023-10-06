package ar.edu.unlu.estacion;

public class Combustible {
private String nombre;
private Double precioVenta;
public Combustible(String nombre, Double precioVenta) {
	super();
	this.nombre = nombre;
	this.precioVenta = precioVenta;
}
private String getNombre() {
	return nombre;
}
private void setNombre(String nombre) {
	this.nombre = nombre;
}
public Double getPrecioVenta() {
	return precioVenta;
}
private void setPrecioVenta(Double precioVenta) {
	this.precioVenta = precioVenta;
}
@Override
public String toString() {
	return "Combustible [nombre=" + nombre + ", precioVenta=" + precioVenta + "]";
}


}
