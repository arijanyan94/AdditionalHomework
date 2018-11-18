package Homework6;

public class Class1 {
	 int age;
	    String name;
	    public Class1(int age,String name) {

	        this.age = age;
	        this.name = name;
	    }
	    int Age () {

	        return this.age;
	    }

	    String Name () {
	        return this.name;
	    }

	public static void main(String[] args) {
		 Class1 properties = new Class1(16, "Arsen");

	        System.out.println(properties.Name()+" is "+ properties.Age()+" years old");

	}

}

