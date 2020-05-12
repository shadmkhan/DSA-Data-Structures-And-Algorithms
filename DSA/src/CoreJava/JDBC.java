package CoreJava;
import java.sql.*;
public class JDBC {
	public static void main(String[] args) {
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:8080/java", "admin", "admin");
			Statement s = cn.createStatement();
			ResultSet r = s.executeQuery("select * from customer ");
			while (r.next()) {
				
				System.out.println(r.getString("name"));
				
			}

		}
		
		catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		
	}

}
