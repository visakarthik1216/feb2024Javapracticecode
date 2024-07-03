package naveenSelenium;

public class Stringlearn {

	public static void main(String[] args) {
		String str= "hello this is my java code and i am so happy";
		System.out.println(str.indexOf('i'));//1st occurrence of i
		//System.out.println(str.indexOf('i',str.indexOf('i')));//2nd occurrence of i
		int a=str.indexOf('i',str.indexOf('i')+1);
		System.out.println(a);
		System.out.println(str.indexOf('i',a+1));

	}

}
