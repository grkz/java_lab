import java.util.Random;

public class Kozicki_03 {
	public static void main(String[] args) {
		int tab[] = {3, 5, 10, 9, 11, 4, 0, 3, 1};
		
		System.out.println("\nTablica przed odwróceniem kolejności elementów:");
		for(int element : tab) System.out.print(element + " ");
		System.out.println();

		/* 	Zadanie 1: kod odwracający elementy tablicy jednowymiarowej;
			Aby odwrócić elementy tablicy innego typu wystarczy zmienić
			typ zmiennej tymczasowej.									*/

		for(int i=0; i < tab.length/2; i++) {
			int tmp = tab[i];
			tab[i] = tab[tab.length - (i+1)];
			tab[tab.length - (i+1)] = tmp;
		}
		
		System.out.println("Tablica po odwróceniu kolejności elemeentów:");
		for(int element : tab) System.out.print(element + " ");
		System.out.println();
		System.out.println();

		/*	Zadanie 2: Reprezentacja 3 dowolnych liczb całkowitych
			w systemie dwójkowym.										*/

		Random los = new Random();
		boolean wyswietl;
		for(int i=0; i<3; i++) {			// powtarzam 3 razy dla różnych liczb
			int binarna[] = new int[8];		// inicjalizacja z wypełnieniem zerami
			int liczba = los.nextInt(301);	// losowa z zakresu [0, 300], by uwzglednic "przepelnienie"
			int j=7;
			wyswietl = true;

			System.out.print("Rezprezentacja binarna liczby " + liczba + ": ");
	
			while(liczba > 0) {
				if(j < 0) {wyswietl = false; break;}
				binarna[j] = liczba % 2;
				liczba /= 2;
				j--;
			}
			if(wyswietl) {
				for(int cyfra : binarna) System.out.print(cyfra);
				System.out.print(" Sprawdzenie: ");
				int wynik = 0;
				for(int k=0; k<8; k++) {
					wynik += Math.pow(2, (7-k))*binarna[k];
				}
				System.out.println(wynik);
			}
			else
				System.out.println("Nie mozna wyswietlic wyniku. 8 bitów to za mało, by ją przechować.");
		}
		System.out.println();
		

		/*	Zadanie 3: Dopasowanie prostej mnk								*/

		int punkty[][] = new int[100][2];				// tablica równie dobrze mogła by być typu double
		for(int i=0; i<punkty.length; i++) {
			punkty[i][0] = i;
			punkty[i][1] = 3 * i + 7;					// wybrana funkcja liniowa o parametrach a=3, b=7.
		}

		System.out.println("Punkty pomiarowe (leżące na prostej y=ax+b: a=3, b=7):");
		System.out.println("x\ty");
		for(int[] wiersz : punkty) {
			for(int liczba : wiersz)
				System.out.print(liczba + "\t");
			System.out.println();
		}
		

		double xsr, ysr, a, b, D, dy, da, db, R;
		xsr = ysr = a = b = D = dy = da = db = R = 0;

		for(int[] wiersz : punkty) {
			xsr += wiersz[0];
			ysr += wiersz[1];
		}
		xsr /= punkty.length;
		ysr /= punkty.length;
			
		for(int[] wiersz : punkty) {
			D += (wiersz[0] - xsr) * (wiersz[0] - xsr);
			a += wiersz[1] * (wiersz[0] - xsr);				//uwaga, a jeszcze nie podzielone przez D!
		}
		a /= D;												//dziele przez D, które jest już policzone.
		b = ysr -a*xsr;
	

		for(int[] wiersz : punkty)
			dy += (wiersz[1] - (a*wiersz[0] + b))*(wiersz[1] - (a*wiersz[0] + b));
		dy /= (punkty.length - 2);
		dy = Math.sqrt(dy);

		da = dy / Math.sqrt(D);
		db = dy * Math.sqrt(1/punkty.length + xsr*xsr/D);	
		System.out.println("\nx_sr:\t" + xsr + "\ty_sr:\t" + ysr);
		System.out.println("D:\t" + D);
		System.out.println("a:\t" + a + "\tb:\t" + b);
		System.out.println("da:\t" + da + "\tdb\t" + db);
	}
}

