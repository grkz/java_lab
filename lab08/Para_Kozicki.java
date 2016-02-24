public class Para_Kozicki<T> {
	private T a, b;
	
	public void setVar(int i, T x) {
		switch(i) {
			case 1 : a = x; break;
			case 2 : b = x; break;
		}
	}

	public T getVar(int i) {
		switch(i) {
			case 1 : return a;
			default : return b;
		}
	}

}
