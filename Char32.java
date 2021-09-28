package patternstar;

public class Char32 {

	public static void main(String[] args) {
		System.out.println("Ankita Bibave  Date:27th May 2021");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j + i <= 5) {
					System.out.print((char) (5 - j + 65));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}