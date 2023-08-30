package org.generation.gestionUsuarios.service;

import java.util.ArrayList;

import org.generation.gestionUsuarios.model.User;
import org.springframework.stereotype.Service;

/*En UserService vamos a emular una pequña base de datos mediante
 * un Arraylist, para poder hacer nuestras operaciones del CRUD  
 *estas entidades del ArrayList, tomaraán los datos que se definieron
 *en model, para ello debo inidcarlo a esta clase que es un servicio
 *con la notación @Service
 */


@Service

public class UserService {
	/*Crear un ArrayList que llamaremos lista y en ella crearé los usuarios 
	 * como si fuera una BD
	 */
	
	public final ArrayList <User> lista = new ArrayList <User>();
	
	//Instanciar usuarios, creando un método
		public UserService() {
			lista.add(new User(1, "Daniel", "Maldonado", "Tabasco", "daniel@gmail.com", 9933332112L));
			lista.add(new User(2, "Iván", "Macías", "EdoMex", "ivandev@gmail.com", 5552554466L));
			lista.add(new User(3, "Isaac", "Campos", "Ecatepec", "isaac@gmail.com", 5523664422L));
			lista.add(new User(4, "Ingrid", "Bergman", "CDMX", "bergmani@gmail.com", 9931191811L));
			lista.add(new User(5, "Martín", "Reyes", "CdMx", "martinr@gmail.com", 5536125455L));
		}
		
	//Crear método para llamar a los usuarios
		public ArrayList <User> getUsers(){
			return lista;
		}
	
}
