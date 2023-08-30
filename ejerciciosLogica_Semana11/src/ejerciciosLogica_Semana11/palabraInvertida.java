package ejerciciosLogica_Semana11;

import java.util.Scanner;

public class palabraInvertida {
/*
 * Ejercicio 6
Instrucciones

- Crear un programa en `Java` que realice lo siguiente:

- Input
  - Solicitar por consola una palabra o frase

- Output
  - Mostrar por consola el texto ingresado de forma invertida.

--- 

Input:
```
Hola Generation
```
Output:
``` 
noitareneG aloH
```

## Consideraciones

- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`.
- Puedes desarrollar el algoritmo y su pseudocódigo
 */
	public static void main (String [] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Escribe una palabra");
	String palabra = sc.nextLine();
	String invertida  = "";	
	for (int indice = palabra.length() - 1; indice >= 0; indice--) {
		// Y vamos concatenando cada carácter a la nueva cadena
		invertida += palabra.charAt(indice);
	}
	System.out.println("Cadena original: " + palabra);
	System.out.println("Cadena invertida: " + invertida);
	
	sc.close();
	}
	
}
