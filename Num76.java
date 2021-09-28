package patternstar;

public class Num76 {

	public static void main(String[] args) {
		System.out.println("Name: Ankita Bibave");
		System.out.println("Date: 8th June 2021");
		int counter = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j - i <= 0) {
					System.out.print(counter);
					counter++;
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
