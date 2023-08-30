package producto;

import contenedor.Contenedor;
import sooper.iContenedor;
import sooper.iProducto;

public abstract class Producto implements iProducto {
	
	private String referencia;
	private int peso;
	private int volumen;
	private iContenedor contenedor;
	
	
	//Constructor
	public Producto(String referencia, int peso, int volumen) {
		super();
		this.referencia = referencia;
		this.peso = peso;
		this.volumen = volumen;
	}

	@Override
	public String getReferencia() {
		return referencia;
	}

	@Override
	public int getPeso() {
		return peso;
	}

	@Override
	public int getVolumen() {
		return volumen;
	}

	@Override
	public boolean tengoEspacio(iContenedor contenedor) {
		return contenedor.volumneDisponible() > volumen;
	}
	 @Override
	public void meter(Contenedor contenedor) {
		 this.contenedor = contenedor;
	}
}
