class Wektor_Kozicki {
	private int a, b, c;
	
	Wektor_Kozicki(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	Wektor_Kozicki(Wektor_Kozicki wektor) {
		a = wektor.a;
		b = wektor.b;
		c = wektor.c;
	}

	public Wektor_Kozicki getSuma(Wektor_Kozicki wektor) {
		return new Wektor_Kozicki(a + wektor.a, b + wektor.b, c + wektor.c);
	}

	public void pomnozPrzezLiczbe(double k) {
		a *= k;
		b *= k;
		c *= k;
	}

	public int getSkalarny(Wektor_Kozicki wektor) {
		return a * wektor.a + b * wektor.b + c * wektor.c;
	}

	public Wektor_Kozicki getWektorowy(Wektor_Kozicki wektor) {
		int x = b * wektor.c - c*wektor.b;
		int y = -(a*wektor.c - c*wektor.a);
		int z = a*wektor.b - b*wektor.a;
		
		return new Wektor_Kozicki(x, y, z);
	}

	public int getMieszany(Wektor_Kozicki wektor1, Wektor_Kozicki wektor2) {
		return this.getSkalarny(wektor1.getWektorowy(wektor2));
	}
	
	public String toString() {
		return "[" + a + ", " + b + ", " + c + "]";
	}
}

