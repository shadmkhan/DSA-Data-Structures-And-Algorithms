import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
public class JDBCC {

	public static void main(String[] args) {

		Connection cn;
		try {
			cn= DriverManager.getConnection("jdbc:mysql://localhost:8080/java","admin","admin");
			Statement st = cn.createStatement();
			
			st.addBatch("delete from customer where id=4");
			st.addBatch("delete from customer where id=5");
			st.addBatch("insert into customer values(4,'is')");
			st.addBatch("insert into customer values(5,'great')");
			
			System.out.println(Arrays.toString(st.executeBatch()));
			
			//st.executeUpdate("delete from customer where id=4");
			//st.executeUpdate("delete from customer where id=5");
			//st.executeUpdate("insert into customer values(4,'is')");
			//st.executeUpdate("insert into customer values(5,'great')");
			
			ResultSet r= st.executeQuery("select * from customer");
			while(r.next())
			{
				System.out.println(r.getString(2));
			}
			
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e.getMessage());
		}
		
		
		
	}
}

