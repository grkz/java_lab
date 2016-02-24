public class Kozicki_07 {
	public static void main(String args[]) {
		System.out.println("\nMetoda trapezów: \n");

		Trapez_Kozicki t1 = new Trapez_Kozicki();
		Trapez_Kozicki t2 = new Trapez_Kozicki(4, 8);
		Trapez_Kozicki t3 = new Trapez_Kozicki(4, 8, 2000);


		System.out.println("f(x) = 2*x + 3");
		System.out.println(t1.obliczCalke(1));
		System.out.println(t2.obliczCalke(1));
		System.out.println(t3.obliczCalke(1));
		System.out.println("f(x) = 2*x^2 - 1");
		System.out.println(t1.obliczCalke(2));
		System.out.println(t2.obliczCalke(2));
		System.out.println(t3.obliczCalke(2));
		System.out.println("f(x) = sin(x)");
		System.out.println(t1.obliczCalke(3));
		System.out.println(t2.obliczCalke(3));
		System.out.println(t3.obliczCalke(3));

		System.out.println("\nMetoda Simpsona: \n");

		t1 = new Simpson_Kozicki();
		t2 = new Simpson_Kozicki(4, 8);
		t3 = new Simpson_Kozicki(4, 8, 2000);

		System.out.println("f(x) = 2*x + 3");
		System.out.println(t1.obliczCalke(1));
		System.out.println(t2.obliczCalke(1));
		System.out.println(t3.obliczCalke(1));
		System.out.println("f(x) = 2*x^2 - 1");
		System.out.println(t1.obliczCalke(2));
		System.out.println(t2.obliczCalke(2));
		System.out.println(t3.obliczCalke(2));
		System.out.println("f(x) = sin(x)");
		System.out.println(t1.obliczCalke(3));
		System.out.println(t2.obliczCalke(3));
		System.out.println(t3.obliczCalke(3));


	}
}
