package patternstar;
public class Star75 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ankita Bibave Date : 21/5/2021");

		for (int i = 2; i < 11; i = i + 2) {
			for (int j = 0; j < 11; j++) {
				if (j - i <= 0) {
					if (i / 2 == j) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
/*
 * for(int i=0; i<11; i=i+2) { for(int j=0; j<11; j++) { if(j-i <=0 && j != i/2)
 * { System.out.print("*"); } else { System.out.print(" "); } }
 * System.out.println(); }
 * 
 * 
 * }
 * 
 * }
 */