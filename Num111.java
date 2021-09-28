package patternstar;

public class Num111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ankita Bibave, Date: 26th May");

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i <=0)
				{
					System.out.print(5-j);
				}
				else
				{
					System.out.print(5-i);
				}
			}
			System.out.println();
		}

	}

}
