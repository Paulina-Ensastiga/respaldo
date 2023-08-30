package sooper;

import java.util.HashSet;
import java.util.Set;

public class Pedido implements iPedido {

	private String referencia;
	private Set<iContenedor> contenedor;
	

	public Pedido(String referencia) {
		super();
		this.referencia = referencia;
		this.contenedor = new HashSet <iContenedor>();
	}

	@Override
	public String getReferencia() {
		return referencia;
	}

	@Override
	public Set<iProducto> getProducto() {
		Set<iProducto> productos = null;
		for (iContenedor c: contenedor) {
			if (productos == null) {
				productos = c.getProductos();
			}else {
				productos.addAll(c.getProductos());
			}
		}
		return productos;
	}

	@Override
	public Set<iContenedor> getContenedores() {
		return contenedor;
	}

	@Override
	public void addContenedor(iContenedor contenedor) {
		contenedor.add(contenedor);
	}

	@Override
	public iContenedor addProducto(iProducto producto) {
		for (iContenedor contenedor : contenedor) {
			if(contenedor.meter(producto)) {
				return contenedor;
			}
		}
		return null;
	}

	@Override
	public iContenedor addContenedor(iProducto producto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pedido: " + referencia +"\n");
		for (iContenedor contenedor : contenedor) {
			sb.append("\t" + contenedor + "\n");
		}
		
		return sb.toString();
	}
}
