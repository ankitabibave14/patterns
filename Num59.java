package patternstar;

public class Num59 {
	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 8th June 2021");

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {

				if (j - i >= 0) {
					System.out.print(j - i + 1);
				} else if (j + i >= 8) {
					System.out.print(i + j - 7);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}