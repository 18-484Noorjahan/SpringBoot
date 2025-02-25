package in.sp.main.bean;

public class Student {
	
	
	private String name;
	private int rollNo;
	private float marks;
	
	public Student(String name, int rollNo, float marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void displayStdDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("rollNo: "+rollNo);
		System.out.println("marks  : "+marks);
		
	}
	

}
