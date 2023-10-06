package ar.edu.unlu.estacion;

import java.time.LocalDate;

public class Venta {
private LocalDate fecha;
private double importe;
private Empleado empleado;
private Cliente cliente;
private Surtidor surtidor;
private int litros;


private LocalDate getFecha() {
	return fecha;
}

private void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}

public double getImporte() {
	return importe;
}

private void setImporte(double importe) {
	this.importe = importe;
}

public Empleado getEmpleado() {
	return empleado;
}

private void setEmpleado(Empleado empleado) {
	this.empleado = empleado;
}

public Cliente getCliente() {
	return cliente;
}

private void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public Surtidor getSurtidor() {
	return surtidor;
}

private void setSurtidor(Surtidor surtidor) {
	this.surtidor = surtidor;
}

public int getLitros() {
	return litros;
}

private void setLitros(int litros) {
	this.litros = litros;
}

public Venta(String fechaVenta, double importe, Empleado empleado, Cliente cliente, Surtidor surtidor, int litros) {
	super();
	this.fecha = LocalDate.parse(fechaVenta);
	this.importe = importe;
	this.empleado = empleado;
	this.cliente = cliente;
	this.surtidor = surtidor;
	this.litros = litros;
}

@Override
public String toString() {
	return "Venta [fecha=" + fecha + ", importe=" + importe + ", empleado=" + empleado + ", cliente=" + cliente
			+ ", surtidor=" + surtidor + ", litros=" + litros + "]";
}


}
