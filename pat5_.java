package patternstar;

public class pat5_ {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 12; j++) {
				if (j + i < 6) {
					System.out.print((char) (j + 65));
				} else if (j - i >= 6)
					System.out.print((char) (11 - j + 65));
			}
			System.out.println();
		}
	}
}