public class Kozicki_04 {
	public static void main(String args[]) {
		Wektor_Kozicki w1 = new Wektor_Kozicki(1, 3, 5);
		Wektor_Kozicki w2 = new Wektor_Kozicki(3, -5, 2);
		
		System.out.println("\nw1 = " + w1);
		System.out.println("w2 = " + w2);
		
		Wektor_Kozicki w3 = new Wektor_Kozicki(w2);
		System.out.println("w3 = " + w3 + "\t //konstruktor przyjmujacy obiekt jako parametr");
		System.out.println();

		System.out.println("w1 + w2 = " + w1.getSuma(w2));
		w3.pomnozPrzezLiczbe(7);
		System.out.println("7 * w3 = " + w3);
		System.out.println();

		System.out.println("Iloczyn skalarny: " + w1 + "." + w2 + " = " + w1.getSkalarny(w2));
		Wektor_Kozicki w4 = new Wektor_Kozicki(1, 5, 0);
		Wektor_Kozicki w5 = new Wektor_Kozicki(5, -3, 0);
		System.out.println("w4 = " + w4);
		System.out.println("w5 = " + w5);
		System.out.println("Iloczyn wektorowy: " + w4 + "x" + w5 + " = " + w4.getWektorowy(w5));
		System.out.println("Iloczyn mieszany: w1.(w2 x w4) = " + w1.getMieszany(w2, w4));
		System.out.println();
	
		System.out.println("27.5 stopni C to " + Fizyka_Kozicki.przeliczNaKelwiny(27.5) + " stopni K");
		System.out.println("15 K to " + Fizyka_Kozicki.przeliczNaCelsjusza(15) + " stopni C");
		System.out.println("m = 2.5 kg, v = 4 m/s:\t Ek = " + Fizyka_Kozicki.obliczEk(2.5, 4) + " J");
		System.out.println("m = 3.3 kg, h = 10 m:\t Ep = " + Fizyka_Kozicki.obliczEp(3.3, 10) + " J");
		System.out.println();

		System.out.println("B = 1.5 T, S = 0.01 m^2, alfa = 60 stopni: \t Strumien indukcji magn.: = "
				+ Fizyka_Kozicki.obliczStrumienIndukcjiMag(1.5, 0.01, Math.PI/3));
		System.out.println("Siła Lorentza:\n" + "q = 1.5 C E = " + w1 + " v = " + w2 + " + m/s B = " + w3);
		System.out.println("F_L = " + Fizyka_Kozicki.obliczSileLorentza(1.5, w1, w2, w3));
		System.out.println("Moc siły lorentza:");
		System.out.println("P = " + Fizyka_Kozicki.obliczMocSilyLorentza(1.5, w1, w2));

	
	}
}

