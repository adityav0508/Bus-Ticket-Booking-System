import java.sql.*;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;


public class Database {
	private static String url = "jdbc:mysql://127.0.0.1:3306/bus_system";
	private static String user = "root";
	private static String pass = "";
	private static String driver = "com.mysql.jdbc.Driver";

	public String sou = null;
	public String dest =null;
	public String b_date = null;
	public String b_time = null;
	public String no_seats = null;
	public String id= null;
	public String price = null;
	public String NAME	=null;
	public String Booked_SOUR=null;	
	public String Booked_DEST=null;
	public String EMAIL	=null;
	public String Booked_DATE=null;
	public String Booked_TIME=null;
	public String Booked_seat=null;
	public String Booked_id=null;
	//jtable display
	public void getDetails(String sou,String dest)
	{		
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			String sql = "select id ,b_FROM,b_to,date,time,Noseat,price from buses where b_FROM = ? AND b_to= ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1,sou);
			stm.setString(2,dest);
			rs= stm.executeQuery();
					      
			 while (rs.next()) 
			 {
			        	id = rs.getString(1);
			        	sou = rs.getString(2);
			        	dest = rs.getString(3);
			        	b_date = rs.getString(4);
			        	b_time= rs.getString(5);
			        	no_seats = rs.getString(6);
			        	price=rs.getString(7);
			        	
			        }
			

		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public int addBuses(ArrayList a)
	{
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int b = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			sql = "INSERT into buses(b_FROM,b_TO,date,time,Noseat,price	)VALUES(?,?,?,?,?,?)";
			stm = con.prepareStatement(sql);
			stm.setString(1, (String) a.get(0));
			stm.setString(2, (String) a.get(1));
			stm.setString(3, (String) a.get(2));
			stm.setString(4, (String) a.get(3));
			stm.setString(5, (String) a.get(4));
			stm.setString(6, (String) a.get(5));
			b = stm.executeUpdate();

		} catch (Exception e1) {
			System.out.println(e1);
		}
		return b;
	}
	
	public int book(ArrayList a)
	{
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int b = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			sql = "INSERT into booking(	name,b_FROM,b_to,email,Date_b,b_time,no_seats,amount) VALUES(?,?,?,?,?,?,?,?)";
			stm = con.prepareStatement(sql);
			stm.setString(1, (String) a.get(0));
			stm.setString(2, (String) a.get(1));
			stm.setString(3, (String) a.get(2));
			stm.setString(4, (String) a.get(3));
			stm.setString(5, (String) a.get(4));
			stm.setString(6, (String) a.get(5));
			stm.setString(7, (String) a.get(6));
			stm.setInt(8,  (int) a.get(7));
			b = stm.executeUpdate();
			

		} catch (Exception e1) {
			System.out.println(e1);

		}
		return b;
	}
	public int decBus(int id, int no)
	{
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int b = 0;
		
		int tono=Integer.parseInt(this.no_seats);
		int sno=tono-no;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			sql = "update  buses set NO_SEATS= ? where id = ?";
			stm = con.prepareStatement(sql);
			stm.setInt(1, sno);
			stm.setInt(2, id);
			b = stm.executeUpdate();
		} catch (Exception e1) {
			
		}
		return b;
	}
	public void getBookingDetails(int id)
	{		
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			String sql = "select NAME,b_FROM,b_to,EMAIL,Date_b,B_TIME,NO_SEATS,amount from booking where id = ? ";
			stm = con.prepareStatement(sql);
			stm.setInt(1,id);
			rs= stm.executeQuery();
					      
			 while (rs.next()) 
			 {
			       	 NAME = rs.getString(1);
			       	Booked_SOUR = rs.getString(2);
			       	Booked_DEST = rs.getString(3);
			        EMAIL = rs.getString(4);
			       	Booked_DATE= rs.getString(5);
			       	Booked_TIME = rs.getString(6);
			       	Booked_seat=rs.getString(7);
			       	price=rs.getString(8);
			        	
			        }
			

		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
		}
		catch (Exception e) {
			System.out.print(e);
		}
		
	}
	public int cancelTiket(int id)
	{
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int b = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			sql = "delete from  booking where id = ?";
			stm = con.prepareStatement(sql);
			stm.setInt(1, id);
			b = stm.executeUpdate();
		} catch (Exception e1) {

		}
		return b;
	}
	public void getId(String name)
	{		
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			String sql = "select id from booking where name =? ";
			stm = con.prepareStatement(sql);
			stm.setString(1,name);
			rs= stm.executeQuery();
					      
			 while (rs.next()) 
			 {
			        	Booked_id = rs.getString(1);
			        	
			        }
			

		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
		}
		catch (Exception e) {
			
		}
		
	}
	public int removeBuses(int id)
	{
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int b = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			sql = "delete from  buses where id = ?";
			stm = con.prepareStatement(sql);
			stm.setInt(1, id);
			b = stm.executeUpdate();
		} catch (Exception e1) {

		}
		return b;
	}
}