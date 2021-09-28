package patternstar;

public class Num46 {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 8th June 2021");

		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				int a= i+1;
				if(j-i <= 0)
				{
					System.out.print(a);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
