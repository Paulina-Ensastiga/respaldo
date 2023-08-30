package sooper;

import java.util.Set;

import enums.TipoContenedor;

public interface iContenedor {
	String getReferencia();
	
	int getVolumen();
	int getSuperficie();
	
	int volumneDisponible();
	int getResistencia();
	
	Set<iProducto> getProductos();
	
	TipoContenedor getTipo();
	
	boolean meter (iProducto producto);

	boolean resiste (iProducto producto);

	void add(iContenedor contenedor);
	

	

}
