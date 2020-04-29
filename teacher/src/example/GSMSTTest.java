package example;

public class GSMSTTest {
	
	public static void main(String[]args)
	{
		Teacher gray = new Teacher("Laura Gray", "laura.gray@gsmst.org", "Math", 5.342);
		gray.print();
		ChangingCourses mullen = new DepartmentHead("Christy Mullen", "chirsty.mullen@gsmst.org", "Math", 5.244, 7);
		mullen.print();
		Student tameem = new Student("Tameem Asif", "tameem.asif@gsmst.org", gray, (Teacher)mullen, "Pre-Calc", 4.0, 10);
		tameem.print();
		Senior cameron = new Senior("Cameron Leung", "cameron.leung@gsmst.org", (Teacher)mullen, gray, "Multivariable Calc", 3.6, true);
		cameron.print();
		Student cameron2 = new Senior("Cameron Leung", "cameron.leung@gsmst.org", (Teacher)mullen, gray, "Multivariable Calc", 3.6, true);
		Gsmsteaching boyette = new DepartmentHead("Jason Boyette", "jason.boyette@gsmst.org", "Engineering", 5.104, 4);
		mullen.changemath("Calc II", cameron, (Teacher)mullen);
		cameron.print();
	}

}
