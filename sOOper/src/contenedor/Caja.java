package contenedor;

import enums.TipoContenedor;
import sooper.iContenedor;
import sooper.iProducto;

public class Caja extends Contenedor {
				//ATRIBUTO
	private int largo;
	private int ancho;
							//Argumentos				
	public Caja(String referencia, int alto, int ancho, int largo) {
		super (referencia, alto, 0);
		this.ancho= ancho;
		this.largo = largo;
	}
	
	@Override
	public int getSuperficie() {
		return ancho * largo;
	}

	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.CAJA;
	}

	@Override
	public boolean meter(iProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resiste(iProducto producto) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void add(iContenedor contenedor) {
		// TODO Auto-generated method stub
		
	}

}
