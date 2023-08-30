package org.ge.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
		//  Array

		String[]films={"Barbie","Moana","Sirenita","Mulan","Smile","Toy Story","Spider-man"};
		
		//Modificar elementos
		//films[4]="IT";
		
		//System.out.println(films[4]);
		
		//Reservar la memoria para después utilizarla
		//50 elementos
		String[] films2=new String[10];
		
		//Imprimir todo el Array
		//Arrays es una utilidad externa que tiene un método toString.
		//toString parseael arrya de parametros a un string legible para la consola o el resto del programa. 
		//System.out.println(Arrays.toString(films));
		
		/////////////////////////////////////////////////////////////
		//ARRAYLIST
		/*Derivado de una colección, es un tipo de dato
		 * Tiene todos los métodos por default 
		 * Nos permite cambiar el tamaño
		 * */
		
		ArrayList <String> series = new ArrayList<String>();
		
		//Agregar datos
		series.add("Malcom");
		series.add("Black Mirror");
		series.add("Incognito");
		series.add("Game of Thrones");
		series.add("Avatar");
		series.add("Kimetsu");
		
		//Obtener por indice
		//System.out.println(series.get(5));
		
		//Modificar elementos
		series.set(3,"Fleabag");
		
		//Eliminar datos
		series.remove(2);
		
		//Limpia todo el ArrayList
		//series.clear();
		
		//Longitud /tamaño
		int arrayListSize = series.size();
		
		
		//System.out.println(series);
		//System.out.println(arrayListSize);
		
		//Uso del for para hacerlo dinámico
		for(int i=0; i < series.size(); i++) {
			//System.out.println(series.get(i));
		}
		
		//For each podríamos no llamar el string serie sinno darle cualquier otra variable
		for(String serie :series) {
			//System.out.println(serie);
		}
		
		
		//Colecciones > sort
		//Ordena 
		Collections.sort(series);
		//System.out.println(series);
		
		ArrayList<Integer>cali=new ArrayList<Integer>();
		
		cali.add(80);
		cali.add(100);
		cali.add(90);
		cali.add(55);
		//System.out.println(cali);
		Collections.sort(cali);
		//System.out.println(cali);
		
		/////////////////////////////////////
		//SET HASHSet
		//Tiene más que ver con un diagrama de Bell.No permite agregar más que un dato a diferencia de array
		//Sucede que agrega datos dublicados pero lo envía a la parte de atrás por tanto al final del set/
		
		Set<String> pelis= new HashSet<String>();
		
		pelis.add("Shrek");
		pelis.add("Antz");
		pelis.add("Interstellar");
		pelis.add("Rango");
		pelis.add("John Wick");
		pelis.add("Planeta del tesoro");
		pelis.add("Barbie cascanueces");
		pelis.add("John Wick");
	
		//System.out.println(pelis.contains("John Wick"));
		
		
		//Iterador a partir de nuestro hashset o cualquier coleccion
		//Tiene métodos heredados
		
		Iterator<String> itr= pelis.iterator();
		
		//Iterar siempre que haya algún elemento disponible
		//Se detiene cuando no se cumple
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//System.out.println(pelis);
		
		//////////////////////////////////////////////////HashMap
		//Vine desde hash pero ahora le nviaremos la llava de forma explicita, ahí ya si hay valor en la de HashSet. 
		
		HashMap<String,Integer> products = new HashMap<String,Integer>();
		
		products.put("Maruchan", 24);
		products.put("Gansito", 30);
		products.put("Chocotorro", 17);
		products.put("Picafresa", 2);
		products.put("Cheetos torciditos", 14);
		products.put("Kawasaki", 40);
		products.put("Coca-Cola zero", 26);
		products.put("Semillas", 15);
		
		//get para obtner la inf
		System.out.println(products.get("Chocotorro"));
		
		// ArrayList
	    //1. Write a program that shuffles an arrayList of your choice
		
		ArrayList<String> songs=new ArrayList <String>();
		
		songs.add("Quien sabe");
		songs.add("Carreteras mojadas");
		songs.add("He vuelto a casa");
		songs.add("Quédate");
		
		System.out.println(songs.get(2));
	
	    //2. Write a program to extract elements [1-3] of an arrayList as a portion
		HashMap<String, Integer> album=new HashMap<String, Integer>();
		album.put("Me estoy enamorando", 1);
		album.put("", null);
		
	    //3. Write a program to check if an array is empty or not (return true / false)
	    
	    // HashSet
	    //1. Write a program to change an HashSet into an Array
	    //2. Write a program to compare two sets
	    //3. Write a program to compare two sets and return the elements that they share
	    
	    // HashMap
	    //1. Write a program that adds a bunch of entries without multiple collection.add() methods
	    //2. Write a program that finds out if a key-value entry is empty in its value or not
	    //3. Write a program that prints all keys (not values) of a map
	    //4. Write a program that prints all key-values of a map
		
	}
}	
		

