package patternstar;

public class Char87 {

	public static void main(String[] args) {
		System.out.println("Ankita Bibave  Date:27th May 2021");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j - i == 0) {
					System.out.print((char) (65 - (j - i)));
				} else if (j + i == 4) {
					System.out.print((char) (65 - (4 - (j + i))));
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
