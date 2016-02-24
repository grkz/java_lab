import java.util.*;

class IFS_Kozicki {
	Random los = new Random();

	Para_Kozicki<Double> punkt;
	ArrayList<Para_Kozicki<Double>> ewolucja;
	ArrayList<ArrayList<Double>> wspolczynniki;

	IFS_Kozicki(ArrayList<ArrayList<Double>> al) {
	
		punkt = new Para_Kozicki<Double>();
		ewolucja = new ArrayList<Para_Kozicki<Double>>();
		wspolczynniki = al;

		punkt.setVar(1, 5.5);
		punkt.setVar(2, 10.5);

		ewolucja.add(punkt);
	}

	void start() {
		ArrayList<Double> wylosowane = wspolczynniki.get(los.nextInt(4));	
	}

	void showXY() {
		System.out.println(punkt.getVar(1) + " " + punkt.getVar(2));
	}

	public static void main(String args[]) {
		ArrayList<ArrayList<Double>> al1 = new ArrayList<ArrayList<Double>>();
		ArrayList<ArrayList<Double>> al2 = new ArrayList<ArrayList<Double>>();
		ArrayList<ArrayList<Double>> al3 = new ArrayList<ArrayList<Double>>();
		al1.add(new ArrayList<Double>(Arrays.asList(0.0, 0.0, 0.0, 0.2, 0.16, -0.04)));
		al1.add(new ArrayList<Double>(Arrays.asList(0.2, -0.26, 0.0, 0.23, 0.22, 0.1)));
		al1.add(new ArrayList<Double>(Arrays.asList(-0.15, 0.28, 0.0, 0.26, 0.24, 0.1)));
		al1.add(new ArrayList<Double>(Arrays.asList(0.85, 0.04, 0.0, -0.04, 0.84, 0.1)));
		al2.add(new ArrayList<Double>(Arrays.asList(0.7, 0.109682, 0.05, -0.109504, 0.893292, 0.1)));
		al2.add(new ArrayList<Double>(Arrays.asList(0.058474, -0.573783, -0.18, -0.191261, 0.175423, -0.21)));
		al2.add(new ArrayList<Double>(Arrays.asList(0.011, 0.0, 0.0, 0.0, 0.3, -0.35)));
		/*al2.add(new ArrayList<Double>(Arrays.asList()));
		al3.add(new ArrayList<Double>(Arrays.asList()));
		al3.add(new ArrayList<Double>(Arrays.asList()));
		al3.add(new ArrayList<Double>(Arrays.asList()));
		al3.add(new ArrayList<Double>(Arrays.asList()));*/


		
		IFS_Kozicki test = new IFS_Kozicki(al1);
		test.showXY();

	}
}
