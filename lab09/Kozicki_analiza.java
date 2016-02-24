import java.util.*;

public class Kozicki_analiza {
	public static <T> boolean jestSymetryczna(T[][] tab) {
		for(int i=0; i<tab.length; i++) {
			if(tab[i].length != tab.length) {
				return false;
			}
			for(int j=0; j<i; j++) {
				if(!tab[i][j].equals(tab[j][i])) {
					return false;
				}
			}
		}
	return true;
	}

	public static <T extends Number> ArrayList<Double> obliczSrednie(T[][] tab) {
		ArrayList<Double> al = new ArrayList<Double>();
		
		for(int i=0; i<tab.length; i++) {
			if(tab[i].length != tab.length) throw new ArrayIndexOutOfBoundsException();
			for(int j=0; j<=i; j++) al.add((tab[i][j].doubleValue() + tab[j][i].doubleValue())/2.0);
		}

		return al;
	}

	/* public static <T extends Number> ArrayList<ArrayList<Double>> */
}
