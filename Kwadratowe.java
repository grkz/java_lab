class Kwadratowe {
	public static void main(String[] args) {
		double a, b, c;
		double delta;
		if (args.length == 3) {
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);

			if (a != 0) {
				delta = b*b - 4*a*c;

				if (delta > 0) {
					System.out.println("x_1 = " + (-b-Math.sqrt(delta))/(2*a) );
					System.out.println("x_2 = " + (-b+Math.sqrt(delta))/(2*a) );
				}
				else if (delta == 0)
					System.out.println("x = " + (-b/(2*a)) );
				else 
					System.out.println("Równanie nie ma rozwiązań w ciele"
											+ "liczb rzeczywistych.");


			}
				else {
					if (b == 0 && c== 0)
						System.out.println("Równanie spełnia dowolna liczba rzeczywista.");
					else
						System.out.println("Równanie sprzeczne!");
			}
		}
		if (args.length == 1) {
			System.out.println(Integer.parseInt(args[0]) + "! = " + silnia2(Integer.parseInt(args[0])));	
		}

	}


	public static int silnia(int n) {
		int wynik = 1;
		for( ; n>0; n--) wynik *= n;
		return wynik;
	}

	public static int silnia2(int n) {
		int silnia = n;
		if (n == 0) return 1;
		n--;
		return silnia * silnia2(n);
	}
}
