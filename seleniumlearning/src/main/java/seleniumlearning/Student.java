package seleniumlearning;

public class Student {

	public String Studentname="manu";
	public int rollno;
	public long phoneno;
	public  String address;
	
	void display() {
		System.out.println("the student detalis");
		System.out.println("the student name: "+Studentname);
		
		
	}
	
	public Student(){
		Studentname="pranika";
		 rollno=1345;
		phoneno=974106;
		System.out.println("the student detalis");
		System.out.println("the student student name"+Studentname);
	}
}
