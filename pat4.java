package patternstar;

public class pat4 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i <= 4) {
					System.out.print(i + j + 1);
				} else if (j - i <= -4)
				{
					System.out.print(j-i+9);
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}





/*
(j - i <= -4) {
for(int k=1; k<=7 ; k=k+2)
{
System.out.print(j+i-k);
}
*/