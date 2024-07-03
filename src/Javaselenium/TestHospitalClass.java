package Javaselenium;

public class TestHospitalClass {

	public static void main(String[] args) {
		
		Hospital h= new Hospital();
		h.admitPatient();
		h.dischargePatient();
		h.treatPatient();
		Hospital.Billing();
		Apollo.Billing();
		System.out.println(h.minspeed);
		
		  System.out.println("......................");
		
		Apollo a=new Apollo();
        a.treatPatient();//override apollo
        a.dischargePatient();//override apollo
        a.admitPatient(); // inheriting
        a.performSurgery();//indvidual
        a.bloodTest();//overidden from medical
        //a.Billing();
        System.out.println(a.minspeed);
        System.out.println("......................");
        
        
        Max m= new Max();
        m.treatPatient();//override max
        m.dischargePatient();//override max
        m.admitPatient(); // inheriting from hospital
        m.conductTest();//individual
        m.bloodTest();
        
        System.out.println("......................");
        
        
        Fortis f= new Fortis();
        f.treatPatient();//override fortis
        f.dischargePatient();//override fortis
        f.admitPatient(); // inheriting from hospital
        f.prescribeMedication();//individual
        
        
        System.out.println("......................");
        
      Hospital h1 =new Apollo();
      h1.treatPatient();
      h1.dischargePatient();
      h1.admitPatient();
      h1.bloodTest();
      h1.finalReport();
      System.out.println(h1.minspeed);
      
      System.out.println("......................");
     
        
       Medical m1 =new Apollo();
       m1.bloodTest();
       h1.finalReport();
       
       System.out.println("......................");
       
       
       
     Medical m2 = new Hospital();
     m2.bloodTest();
     m2.finalReport();
     
     System.out.println("......................");
     Pharmacy p=new Pharmacy();
     p.medicinecheck();
     p.bloodTest();
     p.finalReport();
     
      
       
       //Medical m2= new Max();
       //m2.bloodTest();
       
       
	}

}
