package Homework6;

public class Main {
	  static int fact ( int n){
	        if (n == 0)
	            return 1;

	        else {
	            final int i = n * fact(n - 1);
	            return i;
	        }
	    }


	public static void main(String[] args) {
		   System.out.println(fact(6));

	}

}
