package com.comcast.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;


public class DataBaseUtility
{
	Connection con;
public void getDbconnection(String url,String username,String password)throws SQLException 
{
	try {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
  con = DriverManager.getConnection(url, username, password);
        }
	catch(Exception e) 
	{
   
	}
}
public void getDbconnection()throws SQLException 
{
	try {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
  con = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
        }
	catch(Exception e) 
	{
   
	}
}

public void closeDbConnection() throws SQLException 
{
	con.close();
}

public ResultSet executeSelectQuery(String query) throws Throwable
{
	ResultSet result=null;

	try {
      Statement stat=con.createStatement();
       result = stat.executeQuery(query);
	    }
	catch (Exception e)
       {
		
	    }
     return result;
}
public int executeNonselectQueru(String query)
{
	int result=0;
	try {
		Statement stat=con.createStatement();
		result = stat.executeUpdate(query);
         }
catch (Exception e)
   {
	
    }
	 return result;
}
}

	
	

