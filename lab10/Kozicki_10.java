import java.io.IOException;

class Kozicki_10 {
	public static void main(String args[]) {
		try {
			Kozicki_dane dane = new Kozicki_dane("test.txt");
			System.out.println("Test utworzonego obiektu:");
			for (double m : dane.al) {
				System.out.println(m);
			}
			System.out.println("Test metody sortującej:");
			for (double m : dane.sortujDane()) {
				System.out.println(m);
			}

		} catch (IOException e) {
			System.out.println("Plik nie został znaleziony.");
		}
	}
}
