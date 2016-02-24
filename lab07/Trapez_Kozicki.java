class Trapez_Kozicki extends Calka_Kozicki {
	Trapez_Kozicki() {super();}
	Trapez_Kozicki(double a, double b) {
		super.a = a;
		super.b = b;
	}
	Trapez_Kozicki(double a, double b, int n) {
		this(a, b);
		super.n = n;
	}

	public double obliczCalke(int f) {
		System.out.print("[" + a + ", " + b + "]\t n = " + n + "\tI = ");

		double s = 0;
		double dx = (b - a) / n;
		for(int i=1; i < n; i++) {
			s = s + getValue(f, a+i*dx);
		}
		s += (getValue(f, a) + getValue(f, b) ) / 2;
		s *= dx;
		return s;
	}

}
