package patternstar;

public class Num83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ankita Bibave, Date: 26th May");

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(j-i <=0)
				{
					System.out.print(j+1);
				}
				else if(j+i >=9)
				{
					System.out.print(j+i-8);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
