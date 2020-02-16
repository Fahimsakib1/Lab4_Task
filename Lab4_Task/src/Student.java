
public class Student 

{
    
	private String Name;
	private String ID;
	private String Dept;
	private double CGPA;
	
	
	public Student() 
	{
		
	}
	
	public Student(String name, String iD, String dept, double cGPA) 
	{
		
		Name = name;
		ID = iD;
		Dept = dept;
		CGPA = cGPA;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}
	
	
	
	
	public void show()
	{
		System.out.println(" Name = " + Name );
		System.out.println(" ID = " + ID );
		System.out.println(" Department = " + Dept );
		System.out.println(" CGPA is = " + CGPA );
		
	}


	public String toString() {
		return "Student [Name=" + Name + ", ID=" + ID + ", Dept=" + Dept + ", CGPA=" + CGPA + "]";
	}
	
	
	
	
}
