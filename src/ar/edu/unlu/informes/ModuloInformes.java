package ar.edu.unlu.informes;

import java.util.ArrayList;

import ar.edu.unlu.estacion.Cliente;
import ar.edu.unlu.estacion.Empleado;
import ar.edu.unlu.estacion.Surtidor;
import ar.edu.unlu.estacion.Venta;

public class ModuloInformes {

	private ArrayList<Empleado> auxEmpleados;
	private ArrayList<Cliente> auxClientes;
	private ArrayList<Surtidor> auxSurtidores;
	private ArrayList<Venta> auxVentas;
	private ArrayList<Double> arrayVentasPorEmpleado = new ArrayList<Double>();
	private ArrayList<Double> arrayComprasPorCliente = new ArrayList<Double>();
	private ArrayList<Double> arrayVentasPorSurtidor = new ArrayList<Double>();
	private ArrayList<Integer> arrayLitrosPorSurtidor = new ArrayList<Integer>();
	private ArrayList<Double> arrayVentasPorCombustible = new ArrayList<Double>();

	public ModuloInformes(ArrayList<Empleado> auxEmpleados, ArrayList<Cliente> auxClientes,
			ArrayList<Surtidor> auxSurtidores, ArrayList<Venta> auxVentas) {
		super();
		this.auxEmpleados = auxEmpleados;
		this.auxClientes = auxClientes;
		this.auxSurtidores = auxSurtidores;
		this.auxVentas = auxVentas;
	}

	public void ventasPorEmpleado() {
		for (int i = 0; i < auxEmpleados.size(); i++) {
			Double suma = 0.0;
			for (int j = 0; j < auxVentas.size(); j++) {
				if (auxEmpleados.get(i).equals(auxVentas.get(j).getEmpleado())) {
					suma += auxVentas.get(j).getImporte();
				}
			}
			arrayVentasPorEmpleado.add(null);
			arrayVentasPorEmpleado.set(i, suma);
		}
	}

	public void mostrarVentasPorEmpleado() {
		System.out.println("-------> ventas por empleado");
		for (int i = 0; i < arrayVentasPorEmpleado.size(); i++) {
			System.out.println(i + 1 + "   " + arrayVentasPorEmpleado.get(i));
		}
	}

	public void comprasPorCliente() {
		for (int i = 0; i < auxClientes.size(); i++) {
			Double suma = 0.0;
			for (int j = 0; j < auxVentas.size(); j++) {
				if (auxClientes.get(i).equals(auxVentas.get(j).getCliente())) {
					suma += auxVentas.get(j).getImporte();
				}
			}
			arrayComprasPorCliente.add(null);
			arrayComprasPorCliente.set(i, suma);
		}
	}

	public void mostrarComprasPorCliente() {
		System.out.println("-------> compras por cliente");
		for (int i = 0; i < arrayComprasPorCliente.size(); i++) {
			System.out.println(i + 1 + "   " + arrayComprasPorCliente.get(i));
		}
	}
	
	
	public void ventasPorSurtidor() {
		for (int i = 0; i < auxSurtidores.size(); i++) {
			Double suma = 0.0;
			for (int j = 0; j < auxVentas.size(); j++) {
				if (auxSurtidores.get(i).equals(auxVentas.get(j).getSurtidor())) {
					suma += auxVentas.get(j).getImporte();
				}
			}
			arrayVentasPorSurtidor.add(null);
			arrayVentasPorSurtidor.set(i, suma);
		}
	}

	public void mostrarVentasPorSurtidor() {
		System.out.println("-------> ventas por surtidor");
		for (int i = 0; i < arrayVentasPorSurtidor.size(); i++) {
			System.out.println(i + 1 + "   " + arrayVentasPorSurtidor.get(i));
		}
	}
	
	///////////////////////////
	public void litrosPorSurtidor() {
		for (int i = 0; i < auxSurtidores.size(); i++) {
			Integer suma = 0;
			for (int j = 0; j < auxVentas.size(); j++) {
				if (auxSurtidores.get(i).equals(auxVentas.get(j).getSurtidor())) {
					suma += auxVentas.get(j).getLitros();
				}
			}
			arrayLitrosPorSurtidor.add(null);
			arrayLitrosPorSurtidor.set(i, suma);
		}
	}

	public void mostrarLitrosPorSurtidor() {
		System.out.println("-------> litros por surtidor");
		for (int i = 0; i < arrayLitrosPorSurtidor.size(); i++) {
			System.out.println(i + 1 + "   " + arrayLitrosPorSurtidor.get(i));
		}
	}
	
	
	////////////////////////
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auxClientes == null) ? 0 : auxClientes.hashCode());
		result = prime * result + ((auxEmpleados == null) ? 0 : auxEmpleados.hashCode());
		result = prime * result + ((auxSurtidores == null) ? 0 : auxSurtidores.hashCode());
		result = prime * result + ((auxVentas == null) ? 0 : auxVentas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModuloInformes other = (ModuloInformes) obj;
		if (auxClientes == null) {
			if (other.auxClientes != null)
				return false;
		} else if (!auxClientes.equals(other.auxClientes))
			return false;
		if (auxEmpleados == null) {
			if (other.auxEmpleados != null)
				return false;
		} else if (!auxEmpleados.equals(other.auxEmpleados))
			return false;
		if (auxSurtidores == null) {
			if (other.auxSurtidores != null)
				return false;
		} else if (!auxSurtidores.equals(other.auxSurtidores))
			return false;
		if (auxVentas == null) {
			if (other.auxVentas != null)
				return false;
		} else if (!auxVentas.equals(other.auxVentas))
			return false;
		return true;
	}

}
