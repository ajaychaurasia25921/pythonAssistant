package com;

import java.sql.SQLException;

public class DbConnect {
  private static java.sql.Connection con;
  
  public static java.sql.Connection MySqlConnect(String Database_Name, String pass) {
    try { Class.forName("com.mysql.jdbc.Driver");
      
      con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Database_Name, "root", pass);
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (SQLException e)
    {
      System.out.println("Please check the port!! and try again");
    }
    
    return con;
  }
  
  public static java.sql.Connection OracaleConnect(String pass)
  {
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");      
      con = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", pass);

    }
    catch (ClassNotFoundException e)
    {

      e.printStackTrace();
    }
    catch (SQLException e)
    {
      System.out.println("Please check the port!! and try again");
    }
    
    return con;
  }
  
  public static java.sql.Connection MySqlConnect(String port, String Database_Name, String pass) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      
      con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:" + port + "/" + Database_Name, "root", pass);
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (SQLException e)
    {
      System.out.println("Please check the port!! and try again");
    }
    
    return con;
  }
  
  public static java.sql.Connection OracaleConnect(String port, String pass)
  {
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
      con = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:" + port + ":XE", "system", pass);

    }
    catch (ClassNotFoundException e)
    {

      e.printStackTrace();
    }
    catch (SQLException e)
    {
      System.out.println("Please check the port!! and try again");
    }
    
    return con;
  }
   public static java.sql.Connection OracaleConnect(String port,String username,String pass)
  {
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
      con = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:" + port + ":XE", username , pass);

    }
    catch (ClassNotFoundException e)
    {

      e.printStackTrace();
    }
    catch (SQLException e)
    {
      System.out.println("Please check the port!! and try again");
    }
    
    return con;
  }
}
