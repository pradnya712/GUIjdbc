 package jdbcGUI.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class CustomerDAO {
	 Databaseutility databaseutility=new Databaseutility();
	 public int customerAdd(Customer customer) {
		 int flag =0;
		 
		 String sqlQuery="insert into Customer (Name,EmailId,Phoneno)  values(?,?,?)";
		 Connection con=null;	
		   try {
			   con=databaseutility.getconnection();
			   //st = con.createStatement();
			   PreparedStatement ps=con.prepareStatement(sqlQuery);
			   ps.setString(1,customer.getName());
			   ps.setString(2,customer.getEmailid());
			   ps.setString(3,customer.getPhoneno());
			   int r=ps.executeUpdate();
			   if(r==1) {
				   flag =1;
				} 
				else {
					flag =0;
			   }
			   con.close();
			
		}catch (SQLException e) {
			// TODO: handle exception
		}
		   catch (Exception e) {
			e.printStackTrace();  
			
		}
		      return flag;
	 }
	 
	 
	 public Customer findCustomerById(int id)  {
		 Customer customer=new Customer();
		 Connection con=null;
		try {
			 con= databaseutility.getconnection();
			String sqlQuery="select * from Customer where id=?";
			PreparedStatement ps=con.prepareStatement(sqlQuery);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery(); 
			if (rs.next()){
				customer.setId(id);
				customer.setName(rs.getString(2));
				customer.setEmailid(rs.getString(3));
				customer.setPhoneno(rs.getString(4));
				
			}
			con.close();
		    
			} catch (Exception e) {
				e.printStackTrace();
		
			}
		
		return customer;
		
	 }
	 
	 public Customer findCustomerByName(String Name) {
		Customer customer=new Customer();
		Connection con=null;
		try {
			con=databaseutility.getconnection();
			String sqlQuery="select *from Customer where Name=?";
			PreparedStatement ps=con.prepareStatement(sqlQuery);
			ps.setString(1,Name);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				
				customer.setId(rs.getInt(1));
				customer.setEmailid(rs.getString(3));
				customer.setPhoneno(rs.getString(4));
				
				
			}
			con.close();
		    
		} catch (Exception e) {
			e.printStackTrace();
	
		}
		
		 return customer;
	    }
	 
	   
	 
	 public Customer findCustomerByEmailid(String Emailid) {
			Customer customer=new Customer();
			Connection con=null;
			try {
				con=databaseutility.getconnection();
				String sqlQuery="select *from Customer where Emailid=?";
				PreparedStatement ps=con.prepareStatement(sqlQuery);
				ps.setString(1,Emailid);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					
					customer.setId(rs.getInt(1));
					customer.setName(rs.getString(2));
					customer.setPhoneno(rs.getString(4));
					
					
				}
				con.close();
			    
			} catch (Exception e) {
				e.printStackTrace();
		
			}
			
			 return customer;
		    }
		 
	 public Customer findCustomerByPhoneno(String Phoneno) {
			Customer customer=new Customer();
			Connection con=null;
			try {
				con=databaseutility.getconnection();
				String sqlQuery="select *from Customer where Phoneno=?";
				PreparedStatement ps=con.prepareStatement(sqlQuery);
				ps.setString(1,Phoneno);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					
					customer.setId(rs.getInt(1));
					customer.setName(rs.getString(2));
					customer.setEmailid(rs.getString(3));
					}
				con.close();
			    
			} catch (Exception e) {
				e.printStackTrace();
		
			}
			
			 return customer;
		    }
	 
	 public int customerExist(int id) {
		 int flag =0;
		 Connection con=null;
			try {
				con= databaseutility.getconnection();
				String sqlQuery="select * from Customer where id=?";
				PreparedStatement ps=con.prepareStatement(sqlQuery);
				ps.setInt(1,id);
				ResultSet rs=ps.executeQuery();
				if (rs.next()){
					flag =1;					
				}else {
					flag=0;
				}
				con.close();
			    
				} catch (Exception e) {
				e.printStackTrace();
			
		 }
		 return flag;
	 }
	
}
