package producto;

import contenedor.Contenedor;
import enums.Categoria;
import sooper.iProducto;

public class Mascotas extends Producto {

	public Mascotas(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.MASCOTAS;
	}

	@Override
	public boolean esCompatible(iProducto p) {
		return Categoria.DROGUERIA.equals(p.getCategoria());
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
