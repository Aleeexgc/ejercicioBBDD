
public interface Dao {

	int añadirPersona(Persona p);
	
	void eliminarPersona(int id);
	
	void modificarPersona(int id);
	
	void listarPersonas();
	
}
