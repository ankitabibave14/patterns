package patternstar;

public class Char89 {

	public static void main(String[] args) {
		System.out.println("Ankita Bibave  Date:27th May 2021");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4) {
					System.out.print((char) 80);
				} else if (j == 0 || j == 4) {
					System.out.print((char) 80);
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
