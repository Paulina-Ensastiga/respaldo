package producto;

import enums.Categoria;
import sooper.iProducto;

public class Drogueria extends Producto {

	public Drogueria(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.DROGUERIA;
	}

	@Override
	public boolean esCompatible(iProducto p) {
		return !Categoria.ALIMENTACION.equals(p.getCategoria())&& !Categoria.MASCOTAS.equals(p.getCategoria());
	}

	@Override
	public void add(iProducto producto) {
		// TODO Auto-generated method stub
		
	}




}
