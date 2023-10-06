package ar.edu.unlu.estacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estacion miEstacion = new Estacion();
		Combustible combustible1 = new Combustible("nafta", 100.00);
		Combustible combustible2 = new Combustible("gasoil", 80.00);
		Combustible combustible3 = new Combustible("kerosene", 50.00);

		Surtidor surtidor1 = new Surtidor(1, combustible1);
		Surtidor surtidor2 = new Surtidor(2, combustible1);
		Surtidor surtidor3 = new Surtidor(3, combustible2);
		Surtidor surtidor4 = new Surtidor(4, combustible3);

		miEstacion.agregarSurtidor(surtidor1);
		miEstacion.agregarSurtidor(surtidor2);
		miEstacion.agregarSurtidor(surtidor3);
		miEstacion.agregarSurtidor(surtidor4);

		Empleado empleado1 = new Empleado(1, "Juan", "Garcia", 27456787, 1156345,"por ahi");
		Empleado empleado2 = new Empleado(2, "Jose", "Torres", 24723457, 1132542,"por aqui");
		Empleado empleado3 = new Empleado(3, "Pedro", "Mendoza", 2657877, 1431565,"mas alla");
		
		miEstacion.agregarEmpleado(empleado1);
		miEstacion.agregarEmpleado(empleado2);
		miEstacion.agregarEmpleado(empleado3);
		
		Cliente cliente1 = new Cliente(1, "Rodolfo", "ABA-987");
		Cliente cliente2 = new Cliente(2, "Roberto", "BCD-487");
		Cliente cliente3 = new Cliente(3, "Anibal Uno", "CDE-879");
		Cliente cliente4 = new Cliente(4, "Anibal Dos", "DEF-876");
		Cliente cliente5 = new Cliente(5, "Enrique", "EFG-765");
		Cliente cliente6 = new Cliente(6, "Enrique VIII", "FGH-654");
		Cliente cliente7 = new Cliente(7, "Carlos V", "GHI-543");
		
		miEstacion.agregarCliente(cliente1);
		miEstacion.agregarCliente(cliente2);
		miEstacion.agregarCliente(cliente3);
		miEstacion.agregarCliente(cliente4);
		miEstacion.agregarCliente(cliente5);
		miEstacion.agregarCliente(cliente6);
		miEstacion.agregarCliente(cliente7);
		
		miEstacion.listarClientes();
		miEstacion.listarEmpleados();
		miEstacion.listarSurtidores();
		// si es un cliente nuevo primero le doy de alta
		//param(cliente empleado surtidor litros fecha)
		miEstacion.vender(1,1,1,25,"2023-09-05");
		miEstacion.vender(1,2,1,15,"2023-09-05");
		miEstacion.vender(2,3,2,55,"2023-09-05");
		miEstacion.vender(3,1,2,35,"2023-09-06");
		miEstacion.vender(4,2,2,25,"2023-09-06");
		miEstacion.vender(1,1,3,25,"2023-09-06");
		miEstacion.vender(1,2,1,25,"2023-09-07");
		miEstacion.vender(1,3,3,15,"2023-09-07");
		
		miEstacion.listarVentas();
		miEstacion.analizarVentas();
		
	}

}
