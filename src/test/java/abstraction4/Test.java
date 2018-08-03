package abstraction4;

public class Test {

	public static void main(String[] args) {
		
     /*abstract class object create kara jaina but abstract class holo
      super class so reference variable create kara jabe */
		
		MobileUser mu;  /*reference variable create. 
						super class reference dara sub class ar objet k refer kara jabe
							*/
		mu = new Nazrul();
		mu.sendMessage();
		
		mu = new Nabil();
		mu.sendMessage();
		
	}

}
