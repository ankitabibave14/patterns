package patternstar;

public class Star80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ankita Bibave Date : 21/5/2021");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(j-i >0 && j+i <9)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
