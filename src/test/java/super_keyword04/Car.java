package super_keyword04;

public class Car extends Vehicle{
  //color,weight,display()
	
	int gear;
	
	Car(String c, double w, int g){
		
		super(c,w); //calling the constructor of vehicle class
		gear = g;
		
	}
	@Override
  void display(){
		
		super.display();
		System.out.println("Gear :"+gear);
  }
}
