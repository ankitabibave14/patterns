package patternstar;
public class Star5 {
	public static void main(String[] args) {
		System.out.println("Ankita Bibave Date : 21/5/2021");
		for (int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
				{
				if(j+i <=4 ||   j-i<= -4)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
				}
			System.out.println();
		}
	}
}