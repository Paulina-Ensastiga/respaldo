package producto;

import contenedor.Contenedor;
import enums.Categoria;
import sooper.iProducto;

public class Higiene extends Producto {

	public Higiene(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.HIGIENE;
	}

	@Override
	public boolean esCompatible(iProducto p) {
		return !Categoria.ALIMENTACION.equals(p.getCategoria());
	}

	@Override
	public void add(iProducto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meter(Contenedor contenedor) {
		// TODO Auto-generated method stub
		
	}

}
