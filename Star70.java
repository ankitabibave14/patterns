package patternstar;

public class Star70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ankita Bibave Date : 21/5/2021");
		for (int i = 0; i < 10; i=i+2) {
			for (int j = 0; j < 9; j++) {
				if (j - i <= 0) {
					if (i % 2 == 0)
						System.out.print("*");
				} else
					System.out.print("");

			}
			System.out.println();
		}
	}
}
