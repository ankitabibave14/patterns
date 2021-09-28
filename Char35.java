package patternstar;

public class Char35 {

	public static void main(String[] args) {
		System.out.println("Ankita Bibave  Date:27th May 2021");
		int counter = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j - i <= 0) {
					System.out.print((char) (65 + counter++));
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
