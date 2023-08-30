package sooper;

import java.util.Set;

public interface iPedido {
	
	String getReferencia();
	Set <iProducto> getProducto();
	Set <iContenedor> getContenedores();
	
	void addContenedor (iContenedor contenedor);

	iContenedor addContenedor (iProducto producto);
	iContenedor addProducto(iProducto producto);
}
