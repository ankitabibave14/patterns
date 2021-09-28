package patternstar;

public class Star78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ankita Bibave Date : 21/5/2021");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j < 20; j++)
			{
				if(j-i>0 && j<5)
					System.out.print(" ");
				else if(j+i>9 && j-i<10)
					System.out.print(" ");
				else if(j>14 && j+i<19)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
