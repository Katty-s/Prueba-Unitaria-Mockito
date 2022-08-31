package repositorio;

import java.util.HashMap;
import java.util.Map;

import modelos.Persona;

public class RepositorioPersona {

	private Map<String, String> db = new HashMap<>();
	
	public String crearPersona (Persona persona) {
		db.put(persona.getRut(), persona.getNombre());
		return "OK";
	}
	
	public String actualizarPersona(Persona persona) {
		db.put(persona.getRut(), persona.getNombre());
		return "OK";
	}
	
	public Map<String,String> listarPersona() {
		return db;
	}
	
	public String eliminarPersona(Persona persona) {
		db.put(persona.getRut(), persona.getNombre());
		return "OK";
	}
	
	
}
