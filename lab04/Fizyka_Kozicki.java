class Fizyka_Kozicki {
	final static double KONWERSJA_CK = 273.15;
	final static double G_SRED = 9.81;


	public static double przeliczNaKelwiny(double stopnie) {
		return stopnie + KONWERSJA_CK;
	}

	public static double przeliczNaCelsjusza(double kelwiny) {
		return kelwiny - KONWERSJA_CK; 
	} 
	public static double obliczEp(double masa, double wysokosc) {
		return masa * wysokosc * G_SRED;
	}

	public static double obliczEk(double masa, double predkosc) {
		return masa * predkosc * predkosc / 2.0;
	}

	public static double obliczStrumienIndukcjiMag(double indukcja, double powierzchnia, double kat_radiany) {
		return indukcja * powierzchnia * Math.cos(kat_radiany);
	}

	public static Wektor_Kozicki obliczSileLorentza(double q, Wektor_Kozicki E, Wektor_Kozicki v, Wektor_Kozicki B) {
		Wektor_Kozicki F = new Wektor_Kozicki(v.getWektorowy(B));
		F = F.getSuma(E);
		F.pomnozPrzezLiczbe(q);
		return F;
	}

	public static double obliczMocSilyLorentza(double q, Wektor_Kozicki v, Wektor_Kozicki E) {
		// moc = qE.v;
		return q * E.getSkalarny(v);
	}

}

