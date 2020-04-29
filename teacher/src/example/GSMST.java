package example;

public abstract class GSMST implements Gsmsting {
	public String name = "";
	private String email = "";
	private String type = "Unknown";
	
	public GSMST(String name, String email, String type) {
		this.name=name;
		this.email=email;
		this.type=type;
	}//GSMST Constructor
	
	public void print() {
		System.out.println("\n"+ type + " details:  ");
		System.out.println("Name:  " + name);
		System.out.println("Email:  " + email);
	}//print()
	
	public abstract void validateemail();
	
	public String getemail()
	{
		return email;
	}//validateemail();
	
	public void setemail(String email)
	{
		this.email = email;
	}//setemail

}//abstract class GSMST








