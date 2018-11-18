package Homework6;

public class Class2 {
	 boolean sleep;
	    double d;
	    public Class2(boolean sleep, double d) {
	        this.sleep = sleep;
	        this.d = d;
	    }
	    int get(){
	        if (sleep == true) {
	            return 1;
	        } else {
	            return 0;

	        }
	    }

	    String difference () {
	        if (this.d < 10) {
	            return "The number " + this.d + " is less than 10";
	        }
	        return null;
	    }

}
