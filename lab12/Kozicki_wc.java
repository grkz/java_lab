import java.util.*;
import java.io.*;

class Kozicki_wc {
	private static int counter = 0;
	private static String opis = "";
	public static int[] suma = {0, 0, 0};


	private Scanner skaner = null;
	private String nazwaPliku = "";

	Kozicki_wc(InputStream in) {
		skaner = new Scanner(in);
		counter++;
	}

	Kozicki_wc(String str) {
		nazwaPliku = str;
		try {
			skaner = new Scanner(new FileReader(str));
			counter++;
		} catch (IOException e) {
			System.out.println("Nie znaleziono pliku " + str + ".");
		}
	}

	public void wc() {
		int znaki = 0, slowa = 0, linie = 0;
		
		try {	
		while(skaner.hasNextLine()) {
			linie++;
			String linia = skaner.nextLine();
			if(!linia.isEmpty()) {
				znaki = znaki + linia.length() + 1;
				String[] wyrazy = linia.split(" ");
				slowa = slowa + wyrazy.length;
			} else {
				znaki++;
			}
			
		}
		} catch (NullPointerException e) {
			return;
		}

	suma[0] += linie;
	suma[1] += slowa;
	suma[2] += znaki;

	//opis += linie + "\t" + slowa + "\t" + znaki + "\t" + nazwaPliku + "\n";
	if(counter > 1) opis += "\n";
	opis = opis + String.format("%4d %4d %4d %s", linie, slowa, znaki, nazwaPliku);
	}

	public String toString() {
		if(counter > 1) opis +=  String.format("\n%4d %4d %4d razem", suma[0], suma[1], suma[2]);
		return opis;
	}

}
