package patternstar;

public class Num108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ankita Bibave, Date: 26th May");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int a = (j + 1);
				if (j - i == 0) {
					System.out.print(a);
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
