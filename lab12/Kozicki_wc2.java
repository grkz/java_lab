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
		counter++;
		nazwaPliku = str;
		try {
			skaner = new Scanner(new FileReader(str));
		} catch (IOException e) {
			System.out.println("Nie znaleziono pliku.");
		}
	}

	public void wc() {
		int znaki = 0, slowa = 0, linie = 0;
		
		while(skaner.hasNextLine()) {
			linie++;
			
			String linia = skaner.nextLine();
			znaki = znaki + linia.length() + 1;
			String[] wyrazy = linia.split(" ");
			int nslow = 0;
			for(String slowo : wyrazy) {
				if(!wyrazy.equals("\n")) nslow++;
			}
			slowa = slowa + nslow;
			
		}


	suma[0] += linie;
	suma[1] += slowa;
	suma[2] += znaki;

	opis += linie + "\t" + slowa + "\t" + znaki + "\t" + nazwaPliku + "\n";
	}

	public String toString() {
		if(counter > 1) opis +=  suma[0] + "\t" + suma[1] + "\t" + suma[2] + "\ttotal";
		return opis;
	}

}
