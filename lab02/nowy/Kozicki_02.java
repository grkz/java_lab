import java.util.Random;

public class Kozicki_02 {
	static Random losowanie = new Random();
	public static void main(String args[]) {
		int kwota;

		// Zadanie 1: liczby palindromowe
		System.out.println("\nPieciocyfrowe liczby palindromowe:\n");
		for (int i = 10000; i < 100000; i++)
			if(czyJestPalindromowa(i)) System.out.print(i + " ");
		System.out.println();
		
		// Zadanie 2: rozmienianie kwoty pieniedzy
		if (args.length == 1) {
			kwota = (int) Double.parseDouble(args[0]);
			rozmien(kwota);
		} else {
			System.out.print("\nAby rozmienic kwote, prosze podac jeden argument\nw linii polecen, ");
			System.out.println("będący liczbą rzeczywistą.");
		}

		// Test algorytmu rozmieniania pieniedzy
		System.out.println("\nTest dla 10 losowych kwot < 1000 PLN:");
		for (int i = 0; i < 10; i++)
			rozmien(losowanie.nextInt(1000));

		wylosuj();





	}

	
	public static boolean czyJestPalindromowa(int liczba) {
		boolean palindromowa = true;
		int rozmiarTab = Integer.toString(liczba).length();
		int tablicaCyfr[] = new int[rozmiarTab];

		for (int i=0; i < rozmiarTab; i++) {
			tablicaCyfr[i] = liczba % 10;
			liczba /= 10;
		}
		
		for (int i=0; i < rozmiarTab; i++) {
			if(tablicaCyfr[i] != tablicaCyfr[rozmiarTab - (i+1)]) {
				palindromowa = false;
				break;
			}
		}

		return palindromowa;
	}

	public static void rozmien(int kasa) {
		int nominaly[] = {10, 5, 2, 1};
		int ilosc, reszta;

		System.out.println("\nRozmieniam kwote " + kasa + " PLN:");
		for (int nominal : nominaly) {
			if(kasa/nominal > 0) System.out.println("Nominał " + nominal + " PLN:\t" + kasa / nominal);
			kasa %= nominal;
			if (kasa == 0) break;
		}
	}

	public static void wylosuj()  {
		int wylosowaneLiczby[] = new int[4];
		int min = 100, max = 0, los, suma = 0;
		for (int i=0; i < 4; i++) wylosowaneLiczby[i] = losowanie.nextInt(100);
		System.out.print("\n\nLosowanie liczb.\nWylosowane liczby z zakresu [0, 100): ");
		for (int liczba : wylosowaneLiczby) System.out.print(liczba + " ");
		System.out.println();
		for (int liczba : wylosowaneLiczby) if (liczba > max) max = liczba;
		for (int liczba : wylosowaneLiczby) if (liczba < min) min = liczba;
		System.out.println("Najmniejsza liczba: " + min + "\nNajwieksza liczba: " + max);
		System.out.println("\nLosuje " + max + " liczb z zakresu [0, " + min + "]:");
		for (int i = 0; i < max; i++) {
			los = losowanie.nextInt(min + 1);
			suma += los;
			System.out.print(los + " ");
		}
		System.out.println();
		System.out.println("\nŚrednia z powyższego losowania wynosi: " + (double) suma/max);
	}
	
	/*	metoda wypisuje palindromowe liczby 5 cyfrowe; nie testuje ich, 
		dlatego powyzej napisalem metode testujaca			*/
		
		
	/*	public static void generujPalindromowe() {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				for(int k = 1; k < 10; k++) {
					System.out.println("" + i + j + k + j + i);
				}
			}
		}
	}														*/
}
