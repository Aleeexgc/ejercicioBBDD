import java.time.LocalDate;

public class Persona {

	private int id;
	
	private String nombre;
	
	private String apellido;
	
	private LocalDate fechaNacimiento;
	
	public Persona(int id, String nombre, String apellido, LocalDate fechaNacimiento) {
		
		this.id = id;
		
		this.nombre = nombre;
		
		this.setApellido(apellido);
				
		this.fechaNacimiento = fechaNacimiento;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
