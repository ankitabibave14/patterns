package patternstar;

public class pat15 {

	public static void main(String[] args) {
		int counter =1;
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(j-i <=0)
				{
				System.out.print(counter++ +" ");
			}
				else
					System.out.print(" ");
			
		}
			System.out.println();

	}

}}
