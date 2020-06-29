package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	static Connection con;
    static String url;
          
    public static Connection getConnection()
    {
      
       try
       {
          String url = "jdbc:mysql://localhost/red362?&serverTimezone=UTC"; 
          // assuming "DataSource" is your DataSource name

          Class.forName("com.mysql.cj.jdbc.Driver");
          
          try
          {            	
             con = DriverManager.getConnection(url,"root","password."); 
              								
          // assuming your SQL Server's	username is "username"               
          // and password is "password"
               
          }
          
          catch (SQLException ex)
          {
             ex.printStackTrace();
          }
       }

       catch(ClassNotFoundException e)
       {
          System.out.println(e);
       }

    return con;
}

}
