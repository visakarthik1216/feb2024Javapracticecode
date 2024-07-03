package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int i[][]=new int [3][2];
		i[0][0]=10;
		i[0][1]=20;
		i[1][0]=30;
		i[1][1]=40;
		i[2][0]=50;
		i[2][1]=60;
		System.out.println(i[1][1]);
		System.out.println(i.length);
		System.out.println(i[0].length);
		
		for (int a=0;a<i.length;a++)
		{
			for (int b=0;b<i[0].length;b++)
			{
				System.out.println(i[a][b]);
			}
			
				

	}

}
}
