package NewPackage;

public class FortisHospital extends Hospital implements USMedical,UKMedical,IndianMedical {
	
public void phramacyServices()
{
	System.out.println("FH....phramacyServices");
}
@Override
public void phramacyServices(int a)
{
	System.out.println("FH....phramacyServices with one parameter");
}
	
	public void neuroServices()
	{
		System.out.println("FH....neuroServices");
	}
	
public void gynecServices()
{
	System.out.println("FH....gynecServices");
}
	
	public void  orthoServices()
	{
		System.out.println("FH....orthoServices");
	}
	
	
	public void pediatricService()
	{
		System.out.println("FH....pediatricService");
	}
	
	public void AutoImmuneService()
	{
		System.out.println("FH....AutoImmuneService");
	}
	
	// common
	public void emergencyservice()
	{
		System.out.println("FH.....emergency services");
	}
	
	public void footology()
	{
		System.out.println(" Fh.....footology");
	}

	public static void statservice()
	{
		System.out.println(" FH....statservice");
	}
	
	 public void helpdesk()
	{
		System.out.println("fortis help center");
	}
	 

	public void covidVaccination()
		{
			System.out.println("FH....covid vaacination");
		}
	
	public void medicalRND()
	{
		System.out.println(" fortis hospital medical RND");
	}
}
