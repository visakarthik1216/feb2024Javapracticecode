package NewPackage;

public class TestHosp {

	public static void main(String[] args) {
	 FortisHospital fh=new FortisHospital();
	 Hospital h=new Hospital();
	 fh.AutoImmuneService();
	 fh.emergencyservice();
	 fh.footology();
	 fh.gynecServices();
	 fh.neuroServices();
	 fh.pediatricService();
	 fh.phramacyServices();
	 fh.phramacyServices(10);
	 fh.orthoServices();
	 FortisHospital.statservice();
	 USMedical.statservice();
	 fh.covidVaccination();
	 fh.medicalnews();
	 fh.medicalRND();
	 
	 System.out.println(USMedical.MIN_FEE);
	 
	USMedical us =new FortisHospital();
	us.phramacyServices(); 
	us.neuroServices();
	us.emergencyservice();
	
	

	}

}
