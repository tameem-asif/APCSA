package example;

import java.util.Scanner;

public class Student extends GSMST{
	private Teacher advisement;
	private Teacher math;
	private String mathcourse;
	private double gpa;
	private int currentgrade;
	
	public Student(String name, String email, Teacher advisement, Teacher math, String mathcourse, double gpa, int currentgrade) {
		super(name, email, "Student");
		this.advisement = advisement;
		this.math = math;
		this.mathcourse = mathcourse;
		this.gpa = gpa;
		this.currentgrade = currentgrade;
		math.studentlist.add(this);
}//student constructor
	
	public void print() {
		super.print();
		System.out.println("This student is in the " + currentgrade + "th grade.");
		System.out.println("Advisement teacher Information:  "+ advisement.name + " (Room:  "+ advisement.roomnumber + ")");
		System.out.println("Math Course:  \t"+ mathcourse + " (" + math.name + ", Room:  "+ math.roomnumber + ")");
		System.out.println("Current GPA:  " + gpa);
		
	}//print()
	
	
	public void validateemail()
	{
		while((getemail().indexOf("@gsmst.org")<0))
		{
			System.out.println("\n" + super.name + "'s email (" +getemail()+") is not valid.  Please enter the student's gsmst.org email:  ");
			Scanner scan = new Scanner(System.in);
			setemail(scan.nextLine());
		}//while
			
			
	}//validateemail()
	
		
	public void changemath(String mathcourse, Teacher math)
	{
	
		this.mathcourse = mathcourse;
		this.math=math;
		System.out.println("\n" + name + "'s math course has been changed to:  " + mathcourse + " with " + math.name);
		math.studentlist.add(this);
	}//changemath
	
}//student class