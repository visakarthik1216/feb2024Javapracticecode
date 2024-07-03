package Javaselenium;



public class Hospital extends Medical{
	
	int minspeed=100;
	
	public final void testdrive() //final method cannot be overridden
	{
	}
	
	
	
	public void admitPatient()
	{
		System.out.println(" admitting patient from parent hospital");
	}
	
	public void treatPatient()
	{
		System.out.println(" Treating patient from parent hospital");
	}
	
	public void dischargePatient()
	{
		System.out.println(" discharging patient from parent hospital");
	}
	
	public void bloodTest()
	{
		
	System.out.println("hospital bloodtest");
		

	}
	
	public static void Billing()
	{
		System.out.println("hospital billing");
	}
	
	

}
