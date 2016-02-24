import java.util.*;
class Kozicki_09 {
	public static void main(String args[]) {
		Integer[][] t1 =   {{1, 2}, {2, 2}};
		Double[][] t2 = {{1.0, 2.0, 3.0}, 
						 {2.0, 5.0, 3.0},
						 {3.0, 3.0, 5.0}};
		Integer[][] t3 = {{1, 2, 3}, {3, 5, 5}, {3, 4}};

		System.out.println("\n" + Arrays.deepToString(t1));
		System.out.println("Symetryczna: " + Kozicki_analiza.jestSymetryczna(t1));

		ArrayList<Double> al1 = new ArrayList<Double>();
		System.out.println("\nŚrednie par elementów:");

		try {
			al1 = Kozicki_analiza.obliczSrednie(t1);
			for(double sr : al1) System.out.println(sr);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Tablica nie jest symetryczna.");
		}

		System.out.println("\n" + Arrays.deepToString(t2));
		System.out.println("Symetryczna: " + Kozicki_analiza.jestSymetryczna(t2));

		ArrayList<Double> al2 = new ArrayList<Double>();
		System.out.println("\nŚrednie par elementów:");
		
		try {
			al2 = Kozicki_analiza.obliczSrednie(t2);
			for(double sr : al2) System.out.println(sr);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Tablica nie jest symetryczna.");
		}

		/* zla tablica */


		System.out.println("\n" + Arrays.deepToString(t3));
		System.out.println("Symetryczna: " + Kozicki_analiza.jestSymetryczna(t3));

		ArrayList<Double> al3 = new ArrayList<Double>();
		System.out.println("\nŚrednie par elementów:");

		try {
			al3 = Kozicki_analiza.obliczSrednie(t3);
			for(double sr : al1) System.out.println(sr);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Tablica nie jest symetryczna.");
		}
	}
}
