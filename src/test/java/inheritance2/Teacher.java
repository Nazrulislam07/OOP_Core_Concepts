package inheritance2;

public class Teacher extends Person {
	
	String qualification;
	
	void displayInformation2(){
		
	/*	System.out.println("Name: "+name);
		System.out.println("Age: "+age);*/
		// or
		displayInformation(); // Because method displayInformation already Name and age printed
		
		System.out.println("Qualification: "+qualification);
		System.out.println("\n\n\n");
	}

}
