import java.util.Random;

class UR_Kozicki {
	private int[][] A;
	private int[] Y;
	private double[] X = new double[3];							// wektor rozwiązań
	private Random r = new Random();

	UR_Kozicki(int rozmiar, int zakres, boolean znak) {
		A = new int[rozmiar][rozmiar];
		Y = new int[rozmiar];

		if(znak) {
			for(int i=0; i<rozmiar; i++) {
				for(int j=0; j<rozmiar; j++) {
					A[i][j] = r.nextInt(zakres+1);
				}

				Y[i] = r.nextInt(zakres+1);
			}
		}
		else {
			for(int i=0; i<rozmiar; i++) {
				for(int j=0; j<rozmiar; j++) {
					A[i][j] = r.nextInt(2*zakres+1) - zakres;
				}

				Y[i] = r.nextInt(2*zakres+1) - zakres;
			}		
		}
	}

	private int det3x3(int[][] m) {
		int det = 0;
		det += m[0][0]*(m[1][1]*m[2][2]-m[2][1]*m[1][2]);
		det -= m[0][1]*(m[1][0]*m[2][2]-m[2][0]*m[1][2]);
		det += m[0][2]*(m[1][0]*m[2][1]-m[2][0]*m[1][1]);

		return det;
	}

	private int[][] zamienKolumne(int k) {
		int[][] A_Yk = new int[A.length][A.length];
		for(int i=0; i<3; i++) {
			System.arraycopy(A[i], 0, A_Yk[i], 0, A[0].length);
			A_Yk[i][k] = Y[i];
		}
		return A_Yk;
	}




	public double[] rozwiazUklad() {
		if(det3x3(A)!=0) {
			for(int i=0; i<3; i++) X[i] = (double)det3x3(zamienKolumne(i))/det3x3(A);
		}
		
		return X;
	}

	public boolean sprawdzRozwiazanie(double[] rozwiazanie) {
		boolean flaga = true;
		for(int i=0; i<3; i++) {
			double y_j = 0.0;
			for(int j=0; j<3; j++) {
				y_j += A[i][j]*rozwiazanie[j];
			}
			if(Math.abs(y_j - Y[i]) < 0.00001) flaga = false;
		}
		return flaga;
	}


	public String toString() {
		String tekst = "Macierz A:\n";
		for(int[] w : A) {
			for(int i : w) tekst += (i<0)?("-"+(-i)+" "):(" " + i + " ");
			tekst += "\n";
		}
		tekst += "Macierz Y:\n";
		for(int i : Y) {
			tekst += (i<0)?("-"+(-i)+"\n"):(" " + i + "\n");
		}

		return tekst;

	}
}
