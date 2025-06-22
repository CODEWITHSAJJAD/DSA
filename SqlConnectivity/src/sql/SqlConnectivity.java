package sql;

 
import java.sql.*;
import java.util.*;
public class SqlConnectivity{
	Connection connectionUrl=null;
	Statement st;
	PreparedStatement pst;
	ResultSet rs ;
	
	public void connectionsql(String id,String N,String p) {

	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	


	try {
		connectionUrl=DriverManager.getConnection("jdbc:sqlserver://SUQOON\\\\SUQOON;databaseName=OS;user=sa;password=123456;encrypt=false;");
		System.out.println("Connection Established");
		String q1="Insert into Position values(?,?,?)";
		pst=connectionUrl.prepareStatement(q1);
		pst.setString(1, id);
		pst.setString(2, N);
		pst.setString(3,p);
		
		pst.executeUpdate();
	} catch (SQLException e) {
        System.out.println("An error occurred while connecting to the database: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    } finally {
        try {
            if (connectionUrl!= null)
                connectionUrl.close();
        } catch (SQLException e) {
            System.out.println("An error occurred while closing the database connection: " + e.getMessage());
        }

}

}



}

