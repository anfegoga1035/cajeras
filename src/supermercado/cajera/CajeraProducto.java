package supermercado.cajera;

import supermercado.cliente.ClienteProducto;
import supermercado.cliente.Producto;

/**
 *
 * @author congo
 */
public class CajeraProducto {
    
    private String nombre;

    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }
    
    public void procesarCompra(ClienteProducto cliente, long timeStamp) {
        
        System.out.println("La cajera " + this.nombre + 
                " Comienza a procesar la compra del cliente " 
                + cliente.getNombre() + " en el tiempo " 
                + (System.currentTimeMillis() + timeStamp) / 1000 + " seg" );
        
        int contCliente = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXsegundos();
            System.out.println("Procesando el producto = " + contCliente++ 
                    + " nombre producto " + producto.getNombre() 
                    + " precio producto $" + producto.getPrecio() 
                    + " cantidad de producto " + producto.getCantidad() 
                    + " tiempo: "  + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
           
                    
                    
        }
        
        System.out.println("La cajera " + this.nombre + " ha terminado de procesar" 
                + cliente.getNombre() + " en el tiempo: " 
                + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
    }

    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
    }
}