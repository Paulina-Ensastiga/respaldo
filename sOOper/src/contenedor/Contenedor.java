package contenedor;


import java.util.HashSet;
import java.util.Set;

import sooper.iContenedor;
import sooper.iProducto;

public abstract class Contenedor implements iContenedor {

	private static final iProducto[] Producto = null;
	private String referencia;
	private int alto;
	private Set<iProducto> producto;
	private int resistencia;
	
	
	public Contenedor(String referencia, int alto, int resistencia) {
		this.referencia = referencia;
		this.alto = alto;
		this.resistencia = resistencia;
		producto = new HashSet<iProducto>();
	}


	@Override //sobreescribe la declaración del padre
	public String getReferencia() {
		return referencia;
	}

	
	@Override
	public int getVolumen() {
		return alto * getSuperficie();
	}

	@Override
	public int volumneDisponible() {
		return  getVolumen() - VolumenOcupado();
	}

	private int VolumenOcupado() {
		int res = 0;
		for(iProducto p: producto) {
			res += p.getVolumen();
		}
		return res;
	}


	@Override
	public int getResistencia() {
		return resistencia;
	}

	@Override
	public Set<iProducto> getProductos() {
		return producto;
	}

	@Override
	public boolean meter(iProducto producto) {
		boolean resistenciaOk = resiste(producto);
		boolean volumenOk = producto.tengoEspacio(this);
		boolean compatibilidadOk = true;
		
		for (iProducto p: Producto) {
			boolean  CompatibleOk = producto.esCompatible(p);
			compatibilidadOk &= CompatibleOk;
					
		}
		
		boolean acepta = resistenciaOk && volumenOk && compatibilidadOk;
		if (acepta) {
			producto.add(producto);
			producto.meter(this);
		}
		return acepta;
	}
	
	@Override
	public boolean resiste(iProducto producto) {
		return resistencia > producto.getPeso();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
