package patternstar;

public class Char34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ankita Bibave  Date:27th May 2021");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j + i <= 5) {
					System.out.print((char) (65 + j));
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}