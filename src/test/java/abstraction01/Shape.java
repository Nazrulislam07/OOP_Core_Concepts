package abstraction01;

public abstract class Shape {
	
	double dim1, dim2;  // variable declare
	
	
	//create constructor and initialized the instance variable
	Shape(double dim1, double dim2){
		
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	
	abstract void area(); // abstract  method a body thakbe na

}
