package patternstar;

public class Char91 {

	public static void main(String[] args) {
		System.out.println("Ankita Bibave  Date:27th May 2021");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i == 4) {
					System.out.print((char) (65 + (i + j + 9)));
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
