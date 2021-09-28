package patternstar;

public class pat20 {

	public static void main(String[] args) {
		int ctr=1;
		for (int i = 0; i < 7; i=i+2) {
			
			for (int j = 0; j < 7; j++) {
				
				if(j-i <=0)
				{
					if(i<=j*2)
					
						System.out.print(ctr++ +" ");
					
					else
						System.out.print(ctr-- + " ");
				}
				
			}
			System.out.println();
	
		}
	}
}
