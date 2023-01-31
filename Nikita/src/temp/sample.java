package temp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sample{
	

	public static void main(String[] args) throws SQLException,ClassNotFoundException   {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nikitadb","root","root");
		String query="select *from student";
		
		PreparedStatement st=con.prepareStatement(query);
		ResultSet set=st.executeQuery();
		while(set.next()){
			String roll=set.getString("rollno");
			String nam=set.getString("name");
			System.out.println(roll + nam);
			
		}
	
	}

}