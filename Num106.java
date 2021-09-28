package patternstar;

public class Num106 {

	public static void main(String[] args) {
		System.out.println("Ankita Bibave, Date: 26th May");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j - i <= 0) {
					if (i % 2 == 0) {
						if (j % 2 == 0) {
							System.out.print("1");
						} else {
							System.out.print("0");
						}
					} else {
						if (j % 2 == 0) {
							System.out.print("0");
						} else {
							System.out.print("1");
						}
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
