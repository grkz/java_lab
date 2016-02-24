import java.io.FileReader;
import java.util.*;
import java.io.IOException;

class Kozicki_dane {
	private FileReader plik;
	private Scanner in;
	ArrayList<Double> al = new ArrayList<Double>();

	Kozicki_dane(String nazwa_pliku) throws IOException {
		plik = new FileReader(nazwa_pliku);
		in = new Scanner(plik);

		czytajPlik();	
	}

	private void czytajPlik() {
		while(in.hasNext()) {
			if(in.hasNextDouble()) al.add(in.nextDouble());
				else in.next();
		}
	}

	/*public ArrayList<Double> sortujDane() {
		ArrayList<Double> nowa = new ArrayList<Double>(al);
		Collections.sort(nowa);
		return nowa;
	
	} */

	public TreeSet<Double> sortujDane() {
		TreeSet<Double> sortowanie = new TreeSet(al);
		return sortowanie;
	}

		
}

