import java.util.*;

class Automat_Kozicki {
	Random r = new Random();
	
	int rule_tab[];
	int automat[][];

	int n, max, rule;
	boolean random;

	Automat_Kozicki(int n, int max, int rule, boolean random) {
		this.rule = rule;
		this.n = n;
		this.max = max;
		automat = new int[max+1][n];		// pierwszy wiersz dodatkowo, na stan poczatkowy

		if(random) {
			for(int j=0; j<n; j++) automat[0][j] = r.nextInt(2);
		}
		else
			automat[0][n/2] = 1;
		
		rule_tab = new int[8];
		int m=7;
		while(rule>0 || m<0) {
			rule_tab[m] = rule % 2;
			rule /= 2;
			m--;
		}
	
	}

	void start(int k) {
		if(k > max) {System.out.println("Liczba iteracji wieksza niz max podana w konstruktorze automatu."); return;}
		
		for(int i=1; i<k+1; i++) {
			for(int j=0; j<n; j++) {
				int wzorzec = 4*automat[i-1][((j-1)<0)?(n-1):(j-1)] + 2*automat[i-1][j] + 1*automat[i-1][((j+1)==n)?0:(j+1)];
				automat[i][j] = rule_tab[wzorzec];
			}



		}
	}

	public String toString() {
		String wypisz = "Regula " + rule + " : ";
		wypisz += Arrays.toString(rule_tab);
		wypisz += "\n";
		for(int[] wiersz : automat) {
			for(int liczba : wiersz) {
				if(liczba==0) wypisz+=" ";
				else
					wypisz+="x";
			}
			wypisz+="\n";
		}
		return wypisz;
	}

}


