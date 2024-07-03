package NewPackage;

public interface USMedical extends WHO{
	
	int MIN_FEE=10;
	
	public void phramacyServices();
	public void phramacyServices(int a);
	
	public void neuroServices();
	
	public void emergencyservice();

	public static void statservice()
	{
		System.out.println(" US....statservice");
	}
	
	default public void helpdesk()
	{
		System.out.println("us help center");
		
	}
	


	
	
	

}
