package jdbcGUI.com;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.SelectableChannel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CustomerJFrame {
	
   
   CustomerJFrame(){
	   Font fontApplicatonName = new Font("Courier", Font.BOLD,25);
	   JFrame frame=new JFrame("Customer Management");
	   
	   JLabel lApplicationName =new JLabel("CustomerDAO");
	   lApplicationName.setBounds(200, 20, 200, 50);
	   lApplicationName.setFont(fontApplicatonName);
	   
	   JLabel lId=new JLabel("ID:-");
	   Font fontLable=new Font("Courier", Font.BOLD,16);
	   lId.setFont(fontLable);
	   lId.setBounds(100, 100, 150, 20);
	   JTextField tId=new JTextField();
	   tId.setBounds(220, 100, 200, 20);
	   tId.disable();
	   
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
      
		JLabel msg = new JLabel();
		msg.setBounds(500, 300,300, 40);
      
       JButton btnAdd=new JButton("Add");
       btnAdd.setBounds(100,300,100,40);
       
       btnAdd.addActionListener(new ActionListener() {
	   public void actionPerformed(ActionEvent e) {
		   Customer customer = new  Customer();
		   //customer.setId(Integer.parseInt(tId.getText()));
		   customer.setName(tName.getText());
		   customer.setEmailid(tfEmailId.getText());
		   customer.setPhoneno(tPhoneno.getText());
		   CustomerDAO customerDAO = new CustomerDAO();
		   int response=customerDAO.customerAdd(customer);
		   	if(response==1) {
		   		msg.setText("Success Insertion");
		   	}else {
		   		msg.setText("Failure in insertion");
		   	}
		   	
		}
		});
	   
	   JButton btnClear=new JButton("clear");
	   btnClear.setBounds(250,300, 100, 40);
		
	   btnClear.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {			
				tName.setText("");	
				tfEmailId.setText("");
				tPhoneno.setText("");
				msg.setText("");
			}
		});
	   
	   
	   JButton btnDisplay=new JButton("Display");
	   btnDisplay.setBounds(500,50, 100, 40);
	   btnDisplay.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			 DisplayCustomer customer = new DisplayCustomer();
			  frame.setVisible(false);
		   }
			});
	   
	   JButton btnDelete=new JButton("Delete");
	   btnDelete.setBounds(650,50,100, 40);
	   
	   btnDelete.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent arg0) {
			tId.setText(" ");
			tName.setText(" ");
		    tfEmailId.setText(" ");
		    tPhoneno.setText("");
			
		}
	});
	   
	   
      
	frame.add(lApplicationName);
	frame.add(btnAdd);
	frame.add(btnDisplay);
	frame.add(btnDelete);
	frame.add(btnClear);
	//frame.add(lId);
	//frame.add(tId);
	frame.add(lName);
	frame.add(tName);
	frame.add(lEmailId);
	frame.add(tfEmailId);
	frame.add(lPhoneno);
	frame.add(tPhoneno);
	frame.add(msg);
	
	frame.setLayout(null);
	frame.setBounds(10, 10, 800, 400);
	frame.setVisible(true);
   }
   
}
