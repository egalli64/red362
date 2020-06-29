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
          String url = "jdbc:odbc:" + "DataSource"; 
          // assuming "DataSource" is your DataSource name

          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          
          try
          {            	
             con = DriverManager.getConnection(url,"username","password"); 
              								
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
