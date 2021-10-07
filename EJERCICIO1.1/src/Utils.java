import java.time.LocalDate;

public class Utils {

	public static Persona crearPersona(int id, String nombre, String apellido, LocalDate fechaNacimiento) {
		
		Persona persona = new Persona(id, nombre, apellido, fechaNacimiento);
		
		return persona;
		
		
	}
}
