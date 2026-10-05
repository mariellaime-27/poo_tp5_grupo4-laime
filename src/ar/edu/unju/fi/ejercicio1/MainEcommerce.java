package ar.edu.unju.fi.ejercicio1;

public class MainEcommerce {
	public static void main(String[] args) {
        ManagerProducto manager = new ManagerProducto();

        // Instanciar usuario con su carrito
        Usuario usuario = new Usuario("U01", "María Gómez", "maria.gomez@mail.com");

        // Buscar productos y agregarlos al carrito
        Producto p1 = manager.buscarPorCodigo("P001");
        Producto p2 = manager.buscarPorCodigo("P002");
        Producto p3 = manager.buscarPorCodigo("P005");

        if (p1 != null) usuario.agregarAlCarrito(p1, 1);
        if (p2 != null) usuario.agregarAlCarrito(p2, 2);
        if (p3 != null) usuario.agregarAlCarrito(p3, 1);

        // Mostrar el importe total e info
        System.out.println("Importe total inicial: $" + usuario.verTotalCarrito());
        usuario.mostrarCarrito();

        // Remover un producto
        System.out.println("\nRemoviendo el Mouse Inalámbrico del carrito...");
        if (p2 != null) usuario.removerDelCarrito(p2);

        // Mostrar importe total tras la remoción
        System.out.println("Importe total tras la remoción: $" + usuario.verTotalCarrito());
        usuario.mostrarCarrito();

        // Vaciar el carrito
        System.out.println("\nVaciando el carrito...");
        usuario.getCarrito().vaciar();
        usuario.mostrarCarrito();
    }

}
