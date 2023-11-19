package supermercado.cajera;

import java.util.ArrayList;
import java.util.List;

import supermercado.cliente.ClienteProducto;
import supermercado.cliente.Producto;

public class VentaProductos {

  public static void main(String[] args) {
      
      
      //crea una lista de los productos
    List<Producto> productos = new ArrayList<>();
    setProductos(productos);
    
    //Creacion de los clientes
    ClienteProducto cliente1 = new ClienteProducto("Anna", productos);
    ClienteProducto cliente2 = new ClienteProducto("Pedro", productos);
    ClienteProducto cliente3 = new ClienteProducto("Juan", productos);
    

       //tiempo inicial
    long initialTime = System.currentTimeMillis();
    
    //Creacion de las  cajeras 
    CajeraProducto cajera1 = new CajeraProducto("CAJERA 1");
    CajeraProducto cajera2 = new CajeraProducto("CAJERA 2");
    CajeraProducto cajera3 = new CajeraProducto("CAJERA 3");
    
    //Crear hilos
    CajeraThread hiloCajera1 = new CajeraThread(cajera1, cliente1, initialTime);
    CajeraThread hiloCajera2 = new CajeraThread(cajera2, cliente2, initialTime);
    CajeraThread hiloCajera3 = new CajeraThread(cajera3, cliente3, initialTime);

     // Iniciar los hilos
    hiloCajera1.start();
    hiloCajera2.start();
    hiloCajera3.start();

  }

  
    // Método para llenar la lista de productos
    private static void setProductos(List<Producto> productos) {

        Producto producto1 = new Producto("Arroz", 2000, 20);
        Producto producto2 = new Producto("Panela", 2500, 3);
        Producto producto3 = new Producto("Cafe", 10000, 6);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);


    }
    
}
