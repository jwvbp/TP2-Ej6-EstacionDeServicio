package ar.edu.unlu.estacion;

public class Surtidor {
private int codigo;
private Combustible combustible;

public Surtidor(int codigo, Combustible combustible) {
	super();
	this.codigo = codigo;
	this.combustible = combustible;
}

public int getCodigo() {
	return codigo;
}

private void setCodigo(int codigo) {
	this.codigo = codigo;
}

private Combustible getCombustible() {
	return combustible;
}

private void setCombustible(Combustible combustible) {
	this.combustible = combustible;
}
public double getPrecioVenta() {
	return combustible.getPrecioVenta();
}

@Override
public String toString() {
	return "Surtidor [codigo=" + codigo + ", combustible=" + combustible + "]";
}

}
