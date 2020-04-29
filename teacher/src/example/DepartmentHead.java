package example;

public class DepartmentHead extends Teacher implements ChangingCourses {
	private int planningperiod = 0;
	
	public DepartmentHead(String name, String email, String department, double roomnumber, int planningperiod)
	{
		super(name, email, department, roomnumber);
		this.planningperiod = planningperiod;
	}//Teacher constructor
	
	
	public void print() {
		super.print();
		System.out.println(name + " is currently head of the " + super.department + " department.  \nMeeting time during period " + planningperiod + ".");
		
	}//print()
	
		
	
	public void changemath(String mathcourse, Student student, Teacher math)
	{
		
		student.changemath(mathcourse, math);	
		
	}//changemath
	
}//DepartmentHead