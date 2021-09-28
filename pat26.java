package patternstar;
public class pat26 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j + i == 4 || (j + i == 6 && i > 0) || (j + i == 8 && i > 1) || (j + i == 10 && i > 2)
						|| (i == 4 && j == 8)) {
					System.out.print("*");
				} else
					System.out.print("-");
			}
			System.out.println();
		}
	}
}