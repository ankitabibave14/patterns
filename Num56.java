package patternstar;

public class Num56 {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 8th June 2021");

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i >=4)
				{
					System.out.print(j+i-3+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
