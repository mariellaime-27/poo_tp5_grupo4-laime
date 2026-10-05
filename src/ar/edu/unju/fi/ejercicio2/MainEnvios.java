package ar.edu.unju.fi.ejercicio2;

public class MainEnvios {
	public static void main(String[] args) {
        ManagerEnvios manager = new ManagerEnvios();

        // 1. Crear vehículos
        Vehiculo v1 = new Vehiculo("AA123CD", 150.0, 500.0);
        manager.agregarVehiculo(v1);

        // 2. Crear Envíos
        Envio e1 = new Envio("E001", "Juan Pérez", "Carlos López", "Av. San Martín 450");
        Envio e2 = new Envio("E002", "Distribuidora Jujuy", "Ana Torres", "Belgrano 120");
        Envio e3 = new Envio("E003", "Empresa X", "Marcos Díaz", "Gorriti 890");

        manager.agregarEnvio(e1);
        manager.agregarEnvio(e2);
        manager.agregarEnvio(e3);

        // 3. Cargar paquetes
        e1.agregarPaquete(new Paquete("P1", "Caja con Libros", 30.0, 10.0));
        e1.agregarPaquete(new Paquete("P2", "Herramientas", 50.0, 15.0));

        e2.agregarPaquete(new Paquete("P3", "Electrodoméstico", 80.0, 40.0));

        // 4. Probar asignaciones a la ruta
        RutaDiaria rutaHoy = new RutaDiaria("18/09/2026", v1);

        System.out.println("--- PRUEBAS DE ASIGNACIÓN A RUTA ---");
        rutaHoy.asignarRuta(e1); // OK
        rutaHoy.asignarRuta(e3); // Falla (sin paquetes)
        rutaHoy.asignarRuta(e2); // Falla (exceso de peso)

        System.out.println("\n--- DESPACHO DE RUTA ---");
        rutaHoy.despacharRuta();

        System.out.println("\n--- INFORMACIÓN DETALLADA DE ENVÍO ---");
        e1.mostrarInfo();
    }

}
