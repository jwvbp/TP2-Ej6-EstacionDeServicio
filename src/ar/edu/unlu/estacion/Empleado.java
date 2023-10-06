package ar.edu.unlu.estacion;

public class Empleado {
	private int codigo;
private String nombre;
private String apellido;
private int dni;
private int telefono;
private String direccion;
public Empleado(int codigo, String nombre, String apellido, int dni, int telefono, String direccion) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.telefono = telefono;
	this.direccion = direccion;
}
public int getCodigo() {
	return codigo;
}
private void setCodigo(int codigo) {
	this.codigo = codigo;
}
private String getNombre() {
	return nombre;
}
private void setNombre(String nombre) {
	this.nombre = nombre;
}
private String getApellido() {
	return apellido;
}
private void setApellido(String apellido) {
	this.apellido = apellido;
}
private int getDni() {
	return dni;
}
private void setDni(int dni) {
	this.dni = dni;
}
private int getTelefono() {
	return telefono;
}
private void setTelefono(int telefono) {
	this.telefono = telefono;
}
private String getDireccion() {
	return direccion;
}
private void setDireccion(String direccion) {
	this.direccion = direccion;
}
@Override
public String toString() {
	return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
			+ ", telefono=" + telefono + ", direccion=" + direccion + "]";
}




}
