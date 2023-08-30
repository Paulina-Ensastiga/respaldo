package sooper;

import contenedor.Contenedor;
import enums.Categoria;

public interface iProducto {
	
	String getReferencia();
	
	int getPeso();
	int getVolumen();
	Categoria getCategoria();
	
	boolean esCompatible (iProducto producto);
	boolean tengoEspacio(iContenedor contenedor);

	void add(iProducto producto);

	void meter(Contenedor contenedor);

}
