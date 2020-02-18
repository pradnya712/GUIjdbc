package jdbcGUI.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DisplayCustomerFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtEmailid;
	private JTextField txtPhoneno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayCustomerFrame frame = new DisplayCustomerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DisplayCustomerFrame() {
		setTitle("Customer View");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setBounds(12, 26, 88, 16);
		contentPane.add(lblCustomerId);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setBounds(12, 53, 109, 16);
		contentPane.add(lblCustomerName);
		
		JLabel lblCustomerEmailid = new JLabel("Customer Emailid");
		lblCustomerEmailid.setBounds(12, 82, 109, 16);
		contentPane.add(lblCustomerEmailid);
		
		JLabel lblNewLabel = new JLabel("Customer Phoneno");
		lblNewLabel.setBounds(12, 111, 109, 16);
		contentPane.add(lblNewLabel);
		
		txtID = new JTextField();
		txtID.setBounds(161, 23, 116, 22);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(161, 50, 116, 22);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtEmailid = new JTextField();
		txtEmailid.setBounds(161, 79, 116, 22);
		contentPane.add(txtEmailid);
		txtEmailid.setColumns(10);
		
		txtPhoneno = new JTextField();
		txtPhoneno.setBounds(161, 108, 116, 22);
		contentPane.add(txtPhoneno);
		txtPhoneno.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(24, 174, 97, 25);
		contentPane.add(btnSearch);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(161, 174, 97, 25);
		contentPane.add(btnClear);
		
	}
}
