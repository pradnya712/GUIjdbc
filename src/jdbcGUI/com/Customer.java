package jdbcGUI.com;

public class Customer {
	private int id;
	private String Name;
	private String Emailid;
	private String phoneno;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, String emailid, String phoneno) {
		super();
		this.id = id;
		Name = name;
		Emailid = emailid;
		this.phoneno = phoneno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	

}
