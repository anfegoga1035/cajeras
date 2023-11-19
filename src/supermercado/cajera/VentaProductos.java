package supermercado.cajera;

import java.util.ArrayList;
import java.util.List;

import supermercado.cliente.ClienteProducto;
import supermercado.cliente.Producto;

public class VentaProductos {

  public static void main(String[] args) {

    List<Producto> productos = new ArrayList<>();
    setProductos(productos);

    ClienteProducto cliente1 = new ClienteProducto("Anna", productos);
    ClienteProducto cliente2 = new ClienteProducto("Pedro", productos);

    long initialTime = System.currentTimeMillis();

    CajeraProducto cajera1 = new CajeraProducto("CAJERA 1");
    CajeraProducto cajera2 = new CajeraProducto("CAJERA 2");

    CajeraThread hiloCajera1 = new CajeraThread(cajera1, cliente1, initialTime);
    CajeraThread hiloCajera2 = new CajeraThread(cajera2, cliente2, initialTime);

    hiloCajera1.start();
    hiloCajera2.start();

  }

  

    private static void setProductos(List<Producto> productos) {

        Producto producto1 = new Producto("Arroz", 2000, 20);
        Producto producto2 = new Producto("Panela", 2500, 3);
        Producto producto3 = new Producto("Cafe", 10000, 6);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);


    }
    
}
