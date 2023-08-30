package org.generation.test_unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.generation.test_unit.peson.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Person_Test {
	//Instanciar objetos Person
		Person person1 = new Person("Isaac", "Campos", "isaac.campos@gmail.com", "123hola", 24);
		Person person2 = new Person("Julio", "Recillas", "julio.recillas@hotmail.com", "jajaja", 24);
		Person person3 = new Person("Fernanda", "Garcia", "lapatrona@gmail.com", "keniaos", 23);
	
		@Test
		@DisplayName("Testeando los atributos de la primera persona")
		public void testPerson1() {
			assertEquals("Isaac", person1.getFirstName());
			assertEquals("Campos", person1.getLastName());
			assertEquals("isaac.campos@gmail.com", person1.getEmail());
			assertEquals("123hola", person1.getPassword());
			assertEquals(23, person1.getAge());
	


		}
			
		@Test
		@DisplayName("Testeando los atributos de la primera persona")
		public void testPerson2() {
			assertEquals("Fernanda", person2.getFirstName());
			assertEquals("García", person2.getLastName());
			assertEquals("lapatrona@outlol.com", person2.getEmail());
			assertEquals("147Ñ", person2.getPassword());
			assertEquals(23, person2.getAge());
			}
			
		//Testear si un email corresponde a un dominio específico: @gmail.com
		@Test
		@DisplayName("Test para validar el formato de correo electrónico de Person1 con dominio @gmail.com")
		public void testEmailFormat1() {
			assertTrue(person1.getEmail().matches("^[A-Za-z0-9._+-]+@gmail\\.com$"));
		}
		
		@Test
		@DisplayName("Test para validar el formato de correo electrónico de Person2 con dominio @gmail.com")
		public void testEmailFormat2() {
			assertTrue(person2.getEmail().matches("^[A-Za-z0-9._+-]+@gmail\\.com$"));
		}
		
		@Test
		@DisplayName("Test para validar el formato de correo electrónico de Person3 con dominio @gmail.com")
		public void testEmailFormat3() {
			assertTrue(person3.getEmail().matches("^[A-Za-z0-9._+-]+@gmail\\.com$"));
		}
}

