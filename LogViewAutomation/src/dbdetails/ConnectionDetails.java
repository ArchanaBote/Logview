package dbdetails;
import java.sql.*;  
public class ConnectionDetails {
	
	public  Connection getConnection(){
		Connection con = null;
	  try{  
	       String url="jdbc:odbc:mydsn";  
	       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
	        con =DriverManager.getConnection(url);  
	       // st=c.createStatement();  
	       //ResultSet rs=st.executeQuery("select * from login");  
	        
	       
	      
	    }catch(Exception ee){System.out.println(ee);}
	  return con;  
	}

}
