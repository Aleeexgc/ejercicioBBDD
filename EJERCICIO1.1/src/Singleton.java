import java.sql.Connection;
import java.sql.DriverManager;

public class Singleton {

	private static Connection conn = null;
	
	private String driver;
	
	private String url;
	
	private String usuario;
	
	private String password;
	
	private Singleton() {
		
		String url = "jdbc:mysql://localhost:3306/test";
		
		String usuario = "root";
		
		String password = "";
		
		try {
			
			conn = DriverManager.getConnection(url,usuario,password);
			
		} catch (Exception e) {
			
			e.printStackTrace();	
			
		}
	}
	
	public static Connection getConnection() {
		
		if (conn == null) {
			
			new Singleton();
			
		}
		
		return conn;
	}
	
	
}
