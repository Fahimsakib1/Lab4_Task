
public class Contact 
{

	private String PersonName;
	private String PersonID;
	private int Age;
	private String Mobile;
	private String Gender;
	
	public Contact() 
	{
		
		
	}
	
	
	public Contact(String personName, String personID, int age, String mobile, String gender) 
	{
		
		PersonName = personName;
		PersonID = personID;
		Age = age;
		Mobile = mobile;
		Gender = gender;
	}
	
	
	public void DetectOperator()
	{
		if ( Mobile =="017")
		{
			System.out.println(" Moble Operator is  GP " );
			
		}
		else if (Mobile =="018")
		{
			
			System.out.println(" Mobile Operator is Robi");
			
		}
		
		else if (Mobile =="019")
		{
			
			System.out.println(" Mobile Operator is Banglalink");
			
		}
			
		else if (Mobile =="016")
		{
				
				System.out.println(" Mobile Operator is Airtel");
				
		}
		
		else
		{
				System.out.println(" Other Operator");
				
		}
			
		}
	
	
	
	
	public String toString() 
	{
		return "Contact [PersonName=" + PersonName + ", PersonID=" + PersonID + ", Age=" + Age + ", Mobile=" + Mobile
				+ ", Gender=" + Gender + "]";
	}


	public void ShowInfo()
	{
		
		System.out.println(" Person's Name is : " + PersonName);
		System.out.println(" Person's ID is : " + PersonID);
		System.out.println(" Person's Age is : " + Age);
		System.out.println(" Person Mobile Number is : " + Mobile);
		System.out.println(" Person's Gender is : " + Gender);
		
	}
		
}
	
