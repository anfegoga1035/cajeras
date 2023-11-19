package supermercado.cajera;

import supermercado.cliente.ClienteProducto;

public class CajeraThread extends Thread {

  //Atributos
  private CajeraProducto cajera;
  private ClienteProducto cliente;
  private long timeStamp;

  //constructor
  public CajeraThread(CajeraProducto cajera, ClienteProducto cliente, long timeStamp) {
    this.cajera = cajera;
    this.cliente = cliente;
    this.timeStamp = timeStamp;
  }

  @Override
  public void run() {
    this.cajera.procesarCompra(this.cliente, this.timeStamp);
  }

}