import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class PersonaDao implements Dao{

	Connection conn;

	PreparedStatement st;

	Resultset rs = null;

	@Override
	public int añadirPersona(Persona p) {

		int resultado = -1;

		String sql;

		conn = Singleton.getConnection();

		try {

			sql = "INSERT INTO persona(id, nombre, apellido, fecha) VALUES('" + p.getId() + "' ,'" + p.getNombre() + "' , '" + p.getApellido() + "' , '" 
			
					+ java.sql.Date.valueOf(p.getFechaNacimiento()) + "');";

			st = conn.prepareStatement(sql);

			resultado = st.executeUpdate();

			System.out.println(resultado);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resultado;
	}

	@Override
	public void eliminarPersona(int id) {
		
		String sql;

		conn = Singleton.getConnection();

		try {

			sql = "DELETE FROM persona WHERE id = '" + id +" ';";

			st = conn.prepareStatement(sql);

			st.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void modificarPersona(int id) {
		
		String sql;

		conn = Singleton.getConnection();

		Scanner sc = new Scanner(System.in);
		
		try {

			System.out.println("Introduzca el nombre nuevo");
			
			String nombre = sc.next();
			
			System.out.println("Introduzca el apellido nuevo");
			
			String apellido = sc.next();
			
			System.out.println("Introduzca la nueva fecha de nacimiento");

			String fecha = sc.next();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

			LocalDate fechaFinal = LocalDate.parse(fecha, formatter);
					
			sql = "UPDATE persona SET nombre = '" + nombre + "', apellido = '" + apellido + "', fecha = '" + java.sql.Date.valueOf(fechaFinal) + "' WHERE ID = '" + id + "';";

			st = conn.prepareStatement(sql);

			st.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	@Override
	public void listarPersonas() {
		String sql;

		conn = Singleton.getConnection();
		ResultSet rs;
		try {

			sql = "SELECT * FROM persona;";

			st = conn.prepareStatement(sql);

			rs = st.executeQuery(sql);
			
			while (rs.next())
			{
			    System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getString (3) + " " + rs.getDate(4));
			    
			    System.out.println();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}



}
