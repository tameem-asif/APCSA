package example;
import java.util.ArrayList;
import java.util.Scanner;


public class Teacher extends GSMST implements Gsmsteaching{
	public String department = "unknown";
	public double roomnumber = 0;
	public ArrayList<Student> studentlist = new ArrayList<Student>();
	
	public Teacher(String name, String email, String department, double roomnumber)
	{
		super(name, email, "Teacher");
		this.department = department;
		this.roomnumber = roomnumber;
	}//Teacher constructor
	
	
	public void print() {
		super.print();
		System.out.println("Department:  " + department);
		
	}//print()
	
	public void printroster() {
		System.out.println("\n" + super.name + "'s Current Roster:  ");
		for(int i = 0; i<studentlist.size(); i++)
			System.out.println(i+1 + ".  " + studentlist.get(i).name);
		
	}//print()
	
	public void validateemail()
	{
		while((getemail().indexOf("@gsmst.org")<0)  && (getemail().indexOf("@gwinnett.k12.ga.us")<0) )
		{
			System.out.println("\n" + super.name + "'s email (" +getemail()+") is not valid.  Please enter again:  ");
			Scanner scan = new Scanner(System.in);
			setemail(scan.nextLine());
		}//while
			
			
	}//validateemail()
	
	
	
}//Teacher class