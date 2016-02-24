class Simpson_Kozicki extends Trapez_Kozicki {
	Simpson_Kozicki() {
		super();
	}
	Simpson_Kozicki(double a, double b) {
		super(a, b);
	}
	Simpson_Kozicki(double a, double b, int n) {
		super(a, b, n);
	}

	public double obliczCalke(int f) {
		System.out.print("[" + a + ", " + b + "]\t n = " + n + "\tI = ");

		double s = 0;
		double st = 0;

		double dx = (b - a) / n;
		for(int i = 1; i<=n; i++) {
			double x = a + i*dx;
			st += getValue(f, x-dx/2);
			if(i < n) s += getValue(f, x);
		}
		s = dx/6 * (getValue(f, a) + getValue(f, b) + 2*s + 4*st);
		return s;
	}
}
