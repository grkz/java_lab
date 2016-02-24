import java.util.Arrays;

public class Kozicki_05 {
	public static void main(String[] args) {
		System.out.println("UKŁAD RÓWNAŃ 1 (2x2 zakres współczynników [0:5]):");
		UR_Kozicki uklad1 = new UR_Kozicki(2, 5, true);
		System.out.print(uklad1);
		System.out.println("UKŁAD RÓWNAŃ 2 (4x4, zakres współczynników [-7:7]):");
		UR_Kozicki uklad2 = new UR_Kozicki(4, 7, false);
		System.out.print(uklad2);

		System.out.println("UKŁAD RÓWNAŃ 3 Z ROZWIAZANIEM (3x3 zakres współczynników [-10:10]):");
		UR_Kozicki uklad3 = new UR_Kozicki(3, 10, false);
		System.out.print(uklad3);
		double rozwiazanie3[] = uklad3.rozwiazUklad();
		System.out.println("Rozwiązanie: " + Arrays.toString(rozwiazanie3));
		System.out.println("Rozwiązanie jest " + uklad3.sprawdzRozwiazanie(rozwiazanie3));

		System.out.println("UKŁAD RÓWNAŃ 3 Z ROZWIAZANIEM (3x3 zakres współczynników [0:5]):");
		UR_Kozicki uklad4 = new UR_Kozicki(3, 5, true);
		System.out.print(uklad4);
		double rozwiazanie4[] = uklad4.rozwiazUklad();
		System.out.println("Rozwiązanie: " + Arrays.toString(rozwiazanie4));
		System.out.println("Rozwiązanie jest " + uklad4.sprawdzRozwiazanie(rozwiazanie4) );

	}
}
