package patternstar;

public class Num52 {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 8th June 2021");

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j + i >= 8) {
					System.out.print(i + 1 + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
