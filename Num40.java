package patternstar;

public class Num40 {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 8th June 2021");

		for(int i=0; i<5;i++)
		{
			for(int j=0; j<5; j++)
			{
				int a=j+(i+1);
				if(j+i <=4)
				{
					System.out.print(a);
				}
			}System.out.println();
		}
	}
}
