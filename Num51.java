package patternstar;

public class Num51 {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 8th June 2021");

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (i <= 4 && j + i >= 4) {
					System.out.print(i + 1 + " ");
				} else if (i > 4 && j - i >= -4) {
					System.out.print(9 - i + " ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}