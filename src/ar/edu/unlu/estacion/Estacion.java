package ar.edu.unlu.estacion;
import ar.edu.unlu.informes.ModuloInformes;
import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unlu.informes.ModuloInformes;

public class Estacion {
	private ArrayList<Empleado> misEmpleados = new ArrayList<Empleado>();
	private ArrayList<Cliente> misClientes = new ArrayList<Cliente>();
	private ArrayList<Surtidor> misSurtidores = new ArrayList<Surtidor>();
	private ArrayList<Venta> misVentas = new ArrayList<Venta>();

	public void agregarEmpleado(Empleado empleado) {
		misEmpleados.add(empleado);
	}

	public void agregarCliente(Cliente cliente) {
		misClientes.add(cliente);
	}

	public void agregarSurtidor(Surtidor surtidor) {
		misSurtidores.add(surtidor);
	}

	public void agregarVenta(Venta venta) {
		misVentas.add(venta);
	}

//param(cliente empleado surtidor litros fecha)
	public void vender(int codCliente, int codEmpleado, int codSurtidor, int litros, String fechaVenta) {
		Cliente auxCliente = buscarCliente(codCliente);
		Empleado auxEmpleado = buscarEmpleado(codEmpleado);
		Surtidor auxSurtidor = buscarSurtidor(codSurtidor);
		double auxPrecio = auxSurtidor.getPrecioVenta() * litros;
//	param Venta(String fecha, double importe, Empleado empleado, Cliente cliente, Surtidor surtidor, int litros) {
		Venta estaVenta = new Venta(fechaVenta, auxPrecio, auxEmpleado, auxCliente, auxSurtidor, litros);
		agregarVenta(estaVenta);
	}

	private Cliente buscarCliente(int codCliente) {
		Cliente elCliente = null;
		for (int i = 0; i < misClientes.size(); i++) {
			if (misClientes.get(i).getCodigo() == codCliente) {
				elCliente = misClientes.get(i);
			}
		}
		return elCliente;
	}

	private Empleado buscarEmpleado(int codEmpleado) {
		Empleado elEmpleado = null;
		for (int i = 0; i < misEmpleados.size(); i++) {
			if (misEmpleados.get(i).getCodigo() == codEmpleado) {
				elEmpleado = misEmpleados.get(i);
			}
		}
		return elEmpleado;
	}

	private Surtidor buscarSurtidor(int codSurtidor) {
		Surtidor elSurtidor = null;
		for (int i = 0; i < misSurtidores.size(); i++) {
			if (misSurtidores.get(i).getCodigo() == codSurtidor) {
				elSurtidor = misSurtidores.get(i);
			}
		}
		return elSurtidor;
	}

	public void listarClientes() {
		for (int i = 0; i < misClientes.size(); i++) {
			System.out.println(misClientes.get(i).toString());
			}
	}
	
	public void listarEmpleados() {
		for (int i = 0; i < misEmpleados.size(); i++) {
			System.out.println(misEmpleados.get(i).toString());
			}
	}
	public void listarSurtidores() {
		for (int i = 0; i < misSurtidores.size(); i++) {
			System.out.println(misSurtidores.get(i).toString());
			}
	}
	
public void listarVentas() {
	for (int i = 0; i < misVentas.size(); i ++) {
		System.out.println(misVentas.get(i).toString());
	}
}
public void analizarVentas() {
	ModuloInformes miModulo = new ModuloInformes(misEmpleados,misClientes, misSurtidores, misVentas);
	miModulo.ventasPorEmpleado();
	miModulo.comprasPorCliente();
	miModulo.ventasPorSurtidor();
	miModulo.litrosPorSurtidor();
	miModulo.mostrarVentasPorEmpleado();
	miModulo.mostrarComprasPorCliente();
	miModulo.mostrarVentasPorSurtidor();
	miModulo.mostrarLitrosPorSurtidor();
	}
}

