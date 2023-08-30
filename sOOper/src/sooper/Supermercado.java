package sooper;

import java.time.LocalDate;

import contenedor.Bolsa;
import contenedor.Caja;
import producto.Congelado;
import producto.Fresco;
import producto.Higiene;

public class Supermercado {

	public static void main(String[] args) {
		iPedido miPedido = new Pedido("pedido001");
		
		iContenedor bolsa1 = new Bolsa("B111", 40, 250, 900);
		iContenedor caja1 = new Caja("C22", 30, 50, 75);
		System.out.println("bolsa" + bolsa1);
		
		miPedido.addContenedor(bolsa1);
		miPedido.addContenedor(caja1);
		System.out.println("Mi pedido con contenedores " + miPedido);
		
		iProducto manzanas = new Fresco ("MNZ", 1000, 1500, LocalDate.now().plusDays(0));
		iProducto helado = new Congelado ("HLD", 800, 1000);
		iProducto papelWC = new Higiene("PWC", 500, 2500);
		
		iContenedor contManzanas = miPedido.addContenedor(manzanas);
		iContenedor contHelado = miPedido.addContenedor(helado);
		iContenedor contPapel = miPedido.addContenedor(papelWC);
		System.out.println("Mi pedido con productos " + miPedido);

		
	
	}

}
