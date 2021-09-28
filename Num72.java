package patternstar;

public class Num72 {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 8th June 2021");

		for (int i = 0; i < 5; i++) {
			int counter = 1;
			for (int j = 0; j < 9; j++) {
				if (j + i >= 4 && j - i <= 4) {
					System.out.print(counter);
					if (j < 4) {
						counter++;
					} else {
						counter--;

					}
				} else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

}
