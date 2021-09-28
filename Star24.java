package patternstar;
public class Star24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ankita Bibave Date : 21/5/2021");
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if((i+j <4 || j-i< -4) || (i+j > 8& j-i > 0))
				{
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}