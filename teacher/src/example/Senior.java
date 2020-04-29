package example;

public class Senior extends Student{
	private boolean SCEStatus = false;
	public Senior(String name, String email, Teacher advisement, Teacher math, String mathcourse, double gpa, boolean SCEStatus) {
		super(name, email, advisement, math, mathcourse, gpa, 12);
		this.SCEStatus = SCEStatus;
}//senior constructor
	
	
	
	public void print() {
		super.print();
		if(SCEStatus==false)
		System.out.println("This student cannot graduate.  SCE not completed");
		else
			System.out.println("Student has completed SCE requirements.");
		
	}//print()
	
	
public void seniorskip() {
	System.out.print(super.name + " is exempt for finals.");
}
}//Senior class