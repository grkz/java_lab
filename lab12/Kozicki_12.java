class Kozicki_12 {
	public static void main(String args[]) {

		if(args.length > 0) {
			Kozicki_wc wc = null;
			for(String plik : args) {
				wc = new Kozicki_wc(plik);
				wc.wc();
			}
			System.out.println(wc);
		} else {
			Kozicki_wc wc2 = new Kozicki_wc(System.in);
			wc2.wc();
			System.out.println(wc2);
		}


	}
}
