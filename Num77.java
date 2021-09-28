package patternstar;

public class Num77 {

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			counter++;
			int counter2 = counter;
			int a = 4;
			for (int j = 0; j < 5; j++) {
				if (j - i <= 0) {
					System.out.print(counter);
					counter = counter + a;
					a = a - 1;
				} else
					System.out.print(" ");
			}
			counter = counter2;
			System.out.println();
		}
	}
}