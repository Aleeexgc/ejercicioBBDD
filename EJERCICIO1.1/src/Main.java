import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);

		PersonaDao p = new PersonaDao();

		int opcion;
	
		System.out.println("MENU:  ");

		System.out.println();

		System.out.println("Opcion 1: Insertar persona");

		System.out.println();

		System.out.println("Opcion 2: Eliminar persona");

		System.out.println();

		System.out.println("Opcion 3: Modificar persona");

		System.out.println();

		System.out.println("Opcion 4: Listar todas las personas");

		System.out.println();

		System.out.println("Opcion 5: Salir");

		System.out.println();

		opcion = sc.nextInt();

		System.out.println();

		while (opcion != 5) {


			switch (opcion) {
			case 1: 

				int id;

				String nombre;

				String apellido;

				String fecha;

				System.out.println("Introduzca el id");

				id = Integer.parseInt(sc.next());

				System.out.println("Introduzca el nombre");

				nombre= sc.next();

				System.out.println("Introduzca el apellido");

				apellido = sc.next();

				System.out.println("Introduzca la fecha de nacimiento");

				fecha = sc.next();

				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

				LocalDate fechaFinal = LocalDate.parse(fecha, formatter);

				//System.out.println(fechaFinal);

				p.añadirPersona(Utils.crearPersona(id, nombre, apellido, fechaFinal));

				break;



			case 2:

				System.out.println("Introduzca el id de la persona que quiera elminar");

				int id2 = sc.nextInt();

				p.eliminarPersona(id2);

				break;

			case 3:


				System.out.println("Introduzca el id de la persona que quiera modificar");

				int id3 = sc.nextInt();			

				p.modificarPersona(id3);

				break;

			case 4:

				System.out.println();

				System.out.println();

				p.listarPersonas();

				break;

			case 5:

				System.out.println("Usted ha salido");

				break;

			}

			System.out.println("MENU:  ");

			System.out.println();

			System.out.println("Opcion 1: Insertar persona");

			System.out.println();

			System.out.println("Opcion 2: Eliminar persona");

			System.out.println();

			System.out.println("Opcion 3: Modificar persona");

			System.out.println();

			System.out.println("Opcion 4: Listar todas las personas");

			System.out.println();

			System.out.println("Opcion 5: Salir");

			System.out.println();

			opcion = sc.nextInt();

			System.out.println();

			System.out.println();

			System.out.println();

		}

		System.err.println("Usted ha salido");

	}

}
