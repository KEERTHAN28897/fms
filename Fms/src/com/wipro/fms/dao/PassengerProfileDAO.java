package com.wipro.fms.dao;
import java.sql.*;
import com.wipro.fms.bean.Passenger_ProfileBean;
import com.wipro.fms.util.*;
public class PassengerProfileDAO 
{


	public static int InsertPassenger(Passenger_ProfileBean p)
	{
		int id=1;
		int v=0;
		try
		{
		Connection c=DBUtil.getConnection();
		PreparedStatement s=c.prepareStatement("Insert into passenger_details values(?,?,?,?,?,?)");
		s.setInt(6,id);
		s.setString(1,p.getPassword() );
		s.setString(2,p.getFirst_name() );
		s.setString(3,p.getLast_name());
		s.setInt(4, p.getTel_no());
		s.setString(5, p.getEmail_id());
		v=s.executeUpdate();
		id++;
		}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		return v;
		
	}
	
	public static int DeletePassenger(int id)
	{	
		int v=0;
		try
		{
		Connection c=DBUtil.getConnection();
		PreparedStatement s=c.prepareStatement("Delete from passenger_details where id=?");
		s.setInt(1, id);
		v=s.executeUpdate();
		}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		return v;
		
	}
	
	public static Passenger_ProfileBean getDetails(int id)
	{
		Passenger_ProfileBean p=new Passenger_ProfileBean();
		try
		{
		Connection c=DBUtil.getConnection();
		PreparedStatement s=c.prepareStatement("Select * from PASSENGER_DETAILS where PASS_ID=0");
		//s.setInt(1, id);
		ResultSet r=s.executeQuery();
		while(r.next())
		{
			p.setPassword(r.getString(1));
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return p;
	}
	
	public static void main(String [] args)
	{
		Passenger_ProfileBean p=new Passenger_ProfileBean();
		p.setPassword("abc");
		p.setEmail_id("dxn");
		p.setFirst_name("qwe");
		p.setLast_name("asdfc");
		p.setTel_no(1234);
		PassengerProfileDAO.InsertPassenger(p);
	}

}
