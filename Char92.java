package patternstar;

public class Char92 {

	public static void main(String[] args) {
		System.out.println("Ankita Bibave  Date:27th May 2021");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j - i == 0) {
					System.out.print((char) (65 + j - i + 13));
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
