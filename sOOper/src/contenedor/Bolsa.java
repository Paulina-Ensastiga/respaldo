package contenedor;

import enums.TipoContenedor;
import sooper.iContenedor;
import sooper.iProducto;

public class Bolsa extends Contenedor{
					//ATRIBUTO
	private int ancho;
	
	public Bolsa(String referencia, int alto, int ancho, int resistencia) { 
		super(referencia, alto, resistencia);
		this.ancho=ancho;
	}

	@Override
	public int getSuperficie() {
		int radio = getDiametro()/2;
		return (int)(Math.PI * radio *radio);
	}

	private int getDiametro() {
		return (int) ((2 * ancho)/Math.PI);
	}

	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.BOLSA;
	}

	@Override
	public boolean resiste(iProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(iContenedor contenedor) {
		// TODO Auto-generated method stub
		
	}

}
