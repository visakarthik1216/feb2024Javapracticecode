package JavaBasics;

public class Car1 {
	
	
	    String brand;
	    String model;
	    int year;

	 
	        

	public static void main(String[] args) {
		Car1 carw = new Car1();
        carw.brand = "Toyota";
        carw.model = "Camry";
        carw.year = 2020;

        Car1 carx = new Car1();
        carx.brand = "Honda";
        carx.model = "Accord";
        carx.year = 2019;

        Car1 cary = new Car1();
        cary.brand = "Ford";
        cary.model = "Fusion";
        cary.year = 2018;

      Car1 carz = new Car1();
        carz.brand = "Audi";
        carz.model = "A6";
        carz.year = 2022;

        System.out.println("Original values:");
        System.out.println(carw.brand + " " + carw.model + " " + carw.year);
        System.out.println(carx.brand + " " + carx.model + " " + carx.year);
        System.out.println(cary.brand + " " + cary.model + " " + cary.year);
          System.out.println(carz.brand + " " + carz.model + " " + carz.year);
          
          
          System.out.println("assigning carx=carw");
          carx=carw;
          System.out.println(carw.brand + " " + carw.model + " " + carw.year);//toyota
          System.out.println(carx.brand + " " + carx.model + " " + carx.year);//toyota
          System.out.println(cary.brand + " " + cary.model + " " + cary.year);//ford
          System.out.println(carz.brand + " " + carz.model + " " + carz.year);//audi
          
          System.out.println("assigning cary=carz");
          
          cary=carx;
          System.out.println(carw.brand + " " + carw.model + " " + carw.year);//toyota
          System.out.println(carx.brand + " " + carx.model + " " + carx.year);//toyota
          System.out.println(cary.brand + " " + cary.model + " " + cary.year);//toyota
          System.out.println(carz.brand + " " + carz.model + " " + carz.year);//audi
            
            
            System.out.println("assigning carz=cary");
            carz=cary;
            
            System.out.println(carw.brand + " " + carw.model + " " + carw.year);//toyota
            System.out.println(carx.brand + " " + carx.model + " " + carx.year);//toyota
            System.out.println(cary.brand + " " + cary.model + " " + cary.year);//toyota
            System.out.println(carz.brand + " " + carz.model + " " + carz.year);//toyota
              
              
              System.out.println("assigning carw=carz");
              carw=carz;
              System.out.println(carw.brand + " " + carw.model + " " + carw.year);//t
              System.out.println(carx.brand + " " + carx.model + " " + carx.year);//t
              System.out.println(cary.brand + " " + cary.model + " " + cary.year);//t
              System.out.println(carz.brand + " " + carz.model + " " + carz.year);//t
            
            
	}
		

	}


