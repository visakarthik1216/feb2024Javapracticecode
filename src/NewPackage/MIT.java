package NewPackage;

public class MIT extends ManagementSchool implements US_Education, UK_Education,Indian_Education {
	
	public void writing()
	{
		System.out.println("MIT writing");
	}
	public void reading()
	{
		System.out.println("MIT  reading");
	}
	public void stem()
	{
		System.out.println("MIT  stem");
	}
	
	public void arts()
	{
		System.out.println("MIT  arts");
	}
	
	public void math()
	{
		System.out.println("MIT  math");
	}
	public void Accounts()
	{
		System.out.println("MIT  accounts");
	}
	public void English()
	{
		System.out.println("MIT  English");
	}
	
	//common method of child interface
	public void writeExam()
	{
		System.out.println("MIT ....exam");
	}
	//common method of all interface

	public void culturals()
	{
		System.out.println(" mit....culturals");
		
		
	}
	
	
	//indvidual method
	public void ownTraining()
	{
		System.out.println("mit own training");
	}
}
