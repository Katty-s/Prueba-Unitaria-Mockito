package cl.dojo.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import modelos.Persona;
import repositorio.RepositorioPersona;

public class RepositorioPersonaTest {
     
	private RepositorioPersona repositorioPersona = mock(RepositorioPersona.class);
	
	@Test
	public void testCrearPersona() {
		Persona nuevapersona = new Persona("15.456.987-2", "Johanna");
		when(repositorioPersona.crearPersona(nuevapersona)).thenReturn("OK");
		
		String crearPersonaRes = repositorioPersona.crearPersona(nuevapersona);
		assertEquals("OK", crearPersonaRes);
		verify(repositorioPersona).crearPersona(nuevapersona);
	}
	
	@Test
	public void testActualizarPersona() {
		Persona actualizarpersona = new Persona("15.456.987-2", "Alicia");
		when(repositorioPersona.actualizarPersona(actualizarpersona)).thenReturn("OK");
		
		String actualizarPersonaRes = repositorioPersona.actualizarPersona(actualizarpersona);
		assertEquals("OK", actualizarPersonaRes);
		verify(repositorioPersona).actualizarPersona(actualizarpersona);
	}
}
