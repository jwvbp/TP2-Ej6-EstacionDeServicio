package ar.edu.unlu.estacion;

public class Cliente {
private int codigo;	
private String nombre;
private String patente;

public Cliente(int codigo, String nombre, String patente) {
	this.codigo = codigo;
	this.nombre = nombre;
	this.patente = patente;
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

private String getPatente() {
	return patente;
}

private void setPatente(String patente) {
	this.patente = patente;
}

@Override
public String toString() {
	return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", patente=" + patente + "]";
}

}
