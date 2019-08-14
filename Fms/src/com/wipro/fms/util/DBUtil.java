package com.wipro.fms.util;

import java.sql.*;  
public class DBUtil
{  
	public static Connection getConnection()
		{  
		Connection con = null;
			try{  
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@10.209.61.132:1521:orcl","scott","tiger");  
  
  
}
			catch(Exception e){ System.out.println(e);}  
  return con;
}  
	
}  