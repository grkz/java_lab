import java.util.Arrays;

class Kozicki {
	public static void main(String[] args) {
		Automat_Kozicki a1 = new Automat_Kozicki(100, 30, 30, false);
		Automat_Kozicki a2 = new Automat_Kozicki(100, 40, 90, false);
		Automat_Kozicki a3 = new Automat_Kozicki(100, 50, 110, false);
		
		a1.start(30);
		System.out.println(a1);
		a2.start(40);
		System.out.println(a2);
		a3.start(50);
		System.out.println(a3);
	}
}
