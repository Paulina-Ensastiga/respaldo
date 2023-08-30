package org.repas.poo;

public class CuentaBancaria {
	String titular;
	String tipodeCuenta;
	double saldo;
	
	
	void sacarDinero(double cantidad) {
		if (cantidad <0) {
			return;
		}
		saldo -= cantidad;
	}
	void ingresarDinero (double cantidad) {
		saldo += cantidad;
	}
	void cambiarTipoDeCuenta (String nuevoTipo) {
		tipodeCuenta =nuevoTipo;
	}
	
	double obtenerSaldo () {
		return saldo;
		
	}
}

