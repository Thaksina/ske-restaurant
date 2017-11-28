package DMW;

public class lesson3 {
	public static void arraycopy( int[] a, int[] b ) {
		 if (b.length < a.length) /*throw exception*/;
		 for(int k=0; k<a.length; k++) b[k] = a[k]; 
	}
	public static void main(String[] args) {
		
		int[] x = new int[] { 10, 20 };
		 int[] y = new int[] { 0, 0 };
		 arraycopy( x, y);
		 System.out.printf("\u0E01");

	}

}
