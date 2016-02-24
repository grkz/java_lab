public class Kozicki_01 {
	public static void main(String[] args) {
		double a, b, c, tmp, h, calka = 0.0;
		int f1 = 1, f2 = 1, wyraz, n=10;

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
				
			System.out.println("Sortowanie przy uzyciu zmiennej tymczasowej: " + a + " " + b + " " + c);

			/*	Ponownie ustawiam zmienne a, b, c na wartosci poczatkowe;	
				- na potrzeby demonstracji sortowania bez uzycia zmiennej
				tymczasowej													*/

			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);
			
			
			// System.out.println(a + " " + b + " " + c);
			
			/* if (a > b) a += b;
			if (b > c) b = a-b;
			if (a > b) a -= b;
			
			System.out.println(a + " " + b + " " + c); */
		}

		

		else if (args.length == 2) {

			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			
			// funkcja x^2 - 1 (dla czytelnosci uzylem metody statycznej funkcja1())
			System.out.println("Calka oznaczona funkcji x^2 - 1 w przedziale [" + a + ", " + b + "]");
			for(n=10; n<100000; n*=10) {
				h = (b - a)/n;
				for(int i=1; i < n/2; i++) {
					calka += 4 * funkcja1(a + 2*i*h);
					calka += 2 * funkcja1(a + (2*i+1)*h);
				}

					calka += funkcja1(a) + funkcja1(b);
					calka *= h /3;

					System.out.println("N = " + n + ": I = " + calka);
			}
			System.out.println("Wynik analityczny: " + (b*b*b/3 - a*a*a/3 + a - b));
			

			// funkcja exp(-x))
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

					System.out.println("N = " + n + ": I = " + calka);
			}
			System.out.println("Wynik analityczny: " + (Math.pow(Math.E, -a)-Math.pow(Math.E, -b)));

			
			// funkcja 1/x
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

					System.out.println("N = " + n + ": I = " + calka);
			}
			System.out.println("Wynik analityczny: " + (Math.log(b)-Math.log(a)));


		}

		
		else if (args.length == 1) {
			wyraz = 1;
			for (int i = 0; i < Integer.parseInt(args[0]); i++) {
				if(i == 1) wyraz = 1;
				else if(i == 2) wyraz = 1;
				else {
					wyraz = tmp
					System.out.print(f1 + " ");
					wyraz = f2;
					f1 = f2 + wyraz;


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
