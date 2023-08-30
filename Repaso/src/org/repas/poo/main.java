package org.repas.poo;

public class main {
	public static void main (String []args) {
		CuentaBancaria cuentaDeJuan = new CuentaBancaria();
		
		cuentaDeJuan.titular= "Juan Martinez";
		cuentaDeJuan.tipodeCuenta = "Nómina";
		cuentaDeJuan.saldo = 23_500;
		
		System.out.println("¿Cual es el saldo de la cuenta de Juan " + cuentaDeJuan.saldo);
		 cuentaDeJuan.sacarDinero(500);
		 System.out.println(cuentaDeJuan.saldo);
		 
		 cuentaDeJuan.ingresarDinero(1000);
		 System.out.println(cuentaDeJuan.saldo);
		 
		 cuentaDeJuan.cambiarTipoDeCuenta("ahorro");
		 System.out.println(cuentaDeJuan.tipodeCuenta);
		 
		 double saldo = cuentaDeJuan.obtenerSaldo();
		 System.out.println(saldo);
		 
		 cuentaDeJuan.sacarDinero(-1000);
		 System.out.println(cuentaDeJuan.obtenerSaldo());
		 
		
	}
  
}
