package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
	int i[]= new int [4];
	i[0]=1;
	i[1]=2;
	i[2]=3;
	i[3]=4;
	System.out.println(i[1]);
	System.out.println(i.length);
	
	for (int j=0 ; j<i.length; j++)
		System.out.println(i[j]);
	
	char c[]=new char[2];
	c[0]='a';
	c[1]='2';
	
	boolean b[]= new boolean [2];
	b[0]=true;
	b[1]=false;
	
	String s[]=new String[3];
	s[0]= "hai";
	s[1]="bye";
	s[2]="dai";
	System.out.println(s[2]);
	System.out.println(s.length);
	
	//object array
	
	Object ob1[]=new Object[4];
	ob1[0]="Tom";
	ob1[1]= 'M';
	ob1[2]="12/8/1986";
	ob1[3]=25;
	System.out.println(ob1.length);
	
	for (int k=0 ; k<ob1.length; k++)
		System.out.println(ob1[k]);
	
	
		
		
    
	}

}

