import java.lang.Math;

abstract public class Calka_Kozicki {
	double a, b;			// przedzial calkowania [a, b]
	int n;					// liczba przedzialow
	
	Calka_Kozicki() {
		a = 0;
		b = 1;
		n = 1000;
	}

	abstract public double obliczCalke(int f);
	
	double getValue(int f, double x) {
		switch(f) {
			case 1 : return 2*x+3;
			case 2 : return 2*x*x-1;
			case 3 : return Math.sin(x);
		}

		System.out.println("f = 1,2,3! (Wybrano zla funkcje)");

		return -1;
	}
}

