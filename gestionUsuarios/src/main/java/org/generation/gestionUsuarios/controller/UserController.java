package org.generation.gestionUsuarios.controller;

import java.util.List;

import org.generation.gestionUsuarios.model.User;
import org.generation.gestionUsuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Para que esta clase llamada userController tome el papel de Controlador, necesito 
 * inyectar dependencias. para ello, utilizamos la anotación @RestController para decirle que este controlador 
 * va a manejar la entidad de base de métodos HTTP (get, post, put, delete)
 * con métodos que puedan soportar estas solicitudes, y ademas, podremos ytrabajar con 
 * el fetch de nuestro frontend
 */

@RestController // Api RESTFul
@RequestMapping (path = "/api/user") //localhost:8080 //Construir la ruta de nuestra api, definiendo endpoints
public class UserController {	
	/*Definir una instancia, le dire a Spring que voy a conectar UserController
	 *con mi UserController, para que el controlador sepa lo mismo que sabe el service
	 *y no tengamos que estar preguntando a cada.
	 //Para no instanciar objetos, utilizamos la anotación @Autowired
	 */
	 private final UserService userService;
	 
	//Crear un constructor que va a tomar el userService como argumento y luego ese objeto se va a almacenar en un campo this
		@Autowired
		public UserController(UserService userService) {
			this.userService = userService;
		}
		
		//Para consultar la información de mi BD, establezco un método de consulta con la anotación
		// @GetMapping, que depende de una anotación @RequestMapping 
		// (Qué es colocar antes del inico de clase)
		
		@GetMapping
		public List <User> getMappingUser(){
			return userService.getBooks();
			}
		
}
