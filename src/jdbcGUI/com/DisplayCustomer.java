package jdbcGUI.com;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.omg.CORBA.portable.ValueOutputStream;

public class DisplayCustomer {

	public DisplayCustomer() {
		 Font fontApplicatonName = new Font("Courier", Font.BOLD,25);
		   JFrame frame=new JFrame("Customer Management");
		   
		   JLabel lApplicationName =new JLabel("Customer View");
		   lApplicationName.setBounds(200, 20, 200, 50);
		   lApplicationName.setFont(fontApplicatonName);
		   
		   JLabel lId=new JLabel("ID:-");
		   Font fontLable=new Font("Courier", Font.BOLD,16);
		   lId.setFont(fontLable);
		   lId.setBounds(100, 100, 150, 20);
		   JTextField tId=new JTextField();
		   tId.setBounds(220, 100, 200, 20);
		  
		   
		   	JLabel lName=new JLabel("Name:-");
			Font fontLable2 =  new Font("Courier", Font.BOLD,16);
			lName.setFont(fontLable2);
			lName.setBounds(100,150,150,20);
			JTextField tName=new JTextField();
			tName.setBounds(220,150,200,20);
		   
			JLabel lEmailId=new JLabel("EmailId:-");
			Font fontLable3 =  new Font("Courier", Font.BOLD,16);
			lEmailId.setFont(fontLable3);
			lEmailId.setBounds(100,200,150,20); 
			JTextField tfEmailId=new JTextField();
			tfEmailId.setBounds(220,200,200,20);
	       
			JLabel lPhoneno=new JLabel("Phoneno:-");
			Font fontLable4 =  new Font("Courier", Font.BOLD,16);
			lPhoneno.setFont(fontLable4);
			lPhoneno.setBounds(100,250,150,20); 
			JTextField tPhoneno=new JTextField();
			tPhoneno.setBounds(220,250,200,20);
			
			JLabel lblMsg= new JLabel();
			lblMsg.setBounds(500, 100, 100, 40);
			
		   JButton btnClear=new JButton("clear");
		   btnClear.setBounds(250,300, 100, 40);
		   
		   JButton btnSearch=new JButton("Search");
		   btnSearch.setBounds(500,50, 100, 40);
		   btnSearch.addActionListener(new ActionListener() {			
			   
			   
			  
				public void actionPerformed(ActionEvent arg0) {	
					CustomerDAO customerDAO = new CustomerDAO();
					if(!tId.getText().isEmpty()) {
						Customer c=customerDAO.findCustomerById(Integer.parseInt(tId.getText()));
						if(c!=null) {
							tName.setText(c.getName());
							tfEmailId.setText(c.getEmailid());
							tPhoneno.setText(c.getPhoneno());
							lblMsg.setText("");
						}
					}
					else if(!tName.getText().isEmpty()) {
						Customer c=customerDAO.findCustomerByName((tName.getText()));
						if(c!=null) {
							tId.setText(String.valueOf(c.getId()));
							tfEmailId.setText(c.getEmailid());
							tPhoneno.setText(c.getPhoneno());
							lblMsg.setText("");
					}
					}
					else if(!tfEmailId.getText().isEmpty()) {
						Customer c=customerDAO.findCustomerByEmailid((tfEmailId.getText()));
						if(c!=null) {
							tId.setText(String.valueOf(c.getId()));
							tName.setText(c.getName());
							tPhoneno.setText(c.getPhoneno());
							lblMsg.setText("");
						}
					}
					else if(!tPhoneno.getText().isEmpty()) {
						Customer c=customerDAO.findCustomerByPhoneno((tPhoneno.getText()));
						if(c!=null) {
							tId.setText(String.valueOf(c.getId()));
							tName.setText(c.getName());
							tfEmailId.setText(c.getEmailid());
							lblMsg.setText("");
						}
					}
							       
				}
			   	
			});
		   
		  
		  
		   btnClear.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent arg0) {	
					tId.setText("");
					tName.setText("");	
					tfEmailId.setText("");
					tPhoneno.setText("");
					
				}
			});
		   
		   
		   JButton btnHome=new JButton("Home");
		   btnHome.setBounds(10,10, 100, 40);
		   btnHome.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				 CustomerJFrame customerJFrame = new CustomerJFrame();
				  frame.setVisible(false);
			   }
				});
		   
		  
		   
		   
	      
		frame.add(lApplicationName);
		
		frame.add(btnHome);
		frame.add(btnSearch);
		frame.add(btnClear);
		frame.add(lId);
		frame.add(tId);
		frame.add(lName);
		frame.add(tName);
		frame.add(lEmailId);
		frame.add(tfEmailId);
		frame.add(lPhoneno);
		frame.add(tPhoneno);
		frame.add(lName);
		frame.add(lblMsg);
		
		
		frame.setLayout(null);
		frame.setBounds(10, 10, 800, 400);
		frame.setVisible(true);
	   }

}
