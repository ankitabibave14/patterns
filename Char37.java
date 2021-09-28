package patternstar;

public class Char37 {

	public static void main(String[] args) {
		System.out.println("Ankita Bibave  Date:27th May 2021");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j - i <= 0) {
					System.out.print((char) (65 + (i + 5 * j)));
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
