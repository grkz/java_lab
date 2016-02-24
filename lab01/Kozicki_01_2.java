public class Kozicki_01_2 {
	public static void main(String[] args) {
		double a, b, c, tmp, h, wynik, calka;
		int f1 = 1, f2 = 1, tmp1, tmp2, wyraz, n;

		if(args.length == 3) {
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);

			// Sortowanie przy uzyciu zmiennej tymczasowej

			if(a > b) {
				tmp = a;
				a = b;
				b = tmp;
			}
			if(b > c) {				// po tej zamianie c jest na pewno najmniejsze
				tmp = b;
				b = c;
				c = tmp;
			}
			if(a > b) {
				tmp = a;
				a = b;
				b = tmp;
			}
				
			System.out.println("\nSortowanie przy uzyciu zmiennej tymczasowej:\t" + a + " " + b + " " + c);

			/*	Ponownie ustawiam zmienne a, b, c na wartosci poczatkowe;	
				- na potrzeby demonstracji sortowania bez uzycia zmiennej
				tymczasowej													*/

			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);
			
			
			System.out.println("Przed sortowaniem druga metoda zmienne wynosza:\t" + a + " " + b + " " + c);
			
			if(a > b) {
				a += b;
				b = a-b;
				a -= b;
			}
			if(b > c) {
				b += c;
				c = b-c;
				b -= c;
			}
			if(a > b) {
				a+= b;
				b = a-b;
				a -=b;
			}
			
			System.out.println("Sortowanie przy użyciu dodawania/odejmowania:\t" + a + " " + b + " " + c + "\n");
		}

		

		else if (args.length == 2) {

			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			
			// funkcja x^2 - 1 (dla czytelnosci uzylem metody statycznej funkcja1())
			wynik = (b*b*b/3 - a*a*a/3 + a - b);
			System.out.println("\nCalka oznaczona funkcji x^2 - 1 w przedziale [" + a + ", " + b + "]");
			calka = 0;
			for(n=10; n<100000; n*=10) {
				h = (b - a)/n;
				for(int i=1; i < n/2; i++) {
					calka += 4 * funkcja1(a + 2*i*h);
					calka += 2 * funkcja1(a + (2*i+1)*h);
				}

					calka += funkcja1(a) + funkcja1(b);
					calka *= h /3;

					System.out.printf("N = %d: \tI = \t%.4f\tbłąd względny: %.2f%%\n", n, calka, ((calka-wynik)/calka*100));
			}
			System.out.printf("Wynik analityczny: \t%.4f\n", wynik);
			

			// funkcja exp(-x))
			wynik = Math.pow(Math.E, -a)-Math.pow(Math.E, -b);
			System.out.println("\nCalka oznaczona funkcji exp(-x) w przedziale [" + a + ", " + b + "]");
			calka = 0;
			for(n=10; n<100000; n*=10) {
				h = (b - a)/n;
				for(int i=1; i < n/2; i++) {
					calka += 4 * funkcja2(a + 2*i*h);
					calka += 2 * funkcja2(a + (2*i+1)*h);
				}

					calka += funkcja2(a) + funkcja2(b);
					calka *= h /3;

					System.out.printf("N = %d: \tI = \t%.4f\tbłąd względny: %.2f%%\n", n, calka, ((calka-wynik)/calka*100));
			}
			System.out.printf("Wynik analityczny: \t%.4f\n", wynik);

			
			// funkcja 1/x
			wynik = Math.log(b)-Math.log(a);
			System.out.println("\nCalka oznaczona funkcji 1/x w przedziale [" + a + ", " + b + "]");
			calka = 0;
			for(n=10; n<100000; n*=10) {
				h = (b - a)/n;
				for(int i=1; i < n/2; i++) {
					calka += 4 * funkcja3(a + 2*i*h);
					calka += 2 * funkcja3(a + (2*i+1)*h);
				}

					calka += funkcja3(a) + funkcja3(b);
					calka *= h /3;

					System.out.printf("N = %d: \tI = \t%.4f\tbłąd względny: %.2f%%\n", n, calka, ((calka-wynik)/calka*100));
			}
			System.out.printf("Wynik analityczny: \t%.4f\n\n", wynik);
		}

		
		else if (args.length == 1) {
			for (int i = 1; i < (Integer.parseInt(args[0]) + 1); i++) {
				if(i == 1 || i == 2) wyraz = 1;
					else {
						wyraz = f1 + f2;
						tmp1 = f1;
						tmp2 = f2;
						f1 = tmp2;
						f2 = wyraz;
					}
				System.out.print(wyraz + " ");
			}
			System.out.println();
		}
	}

	public static double funkcja1(double x) {
		return x*x -1;
	}

	public static double funkcja2(double x) {
		return Math.pow(Math.E, -x);
	}

	public static double funkcja3(double x) {
		return 1/x;
	}
}
