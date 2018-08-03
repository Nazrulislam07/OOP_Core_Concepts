package polymorphism01;

public class Test {

	public static void main(String[] args) {

	/*	Shape s = new Shape();	
		Shape s1 = new Rectangle(10, 20);
		Shape s2 = new Triangle(5, 10);
		
		/*Dynamic method dispatch
		 akhane sob class ar object creat karte hobe na
		 super class ar akta reference varible sub class ar object
		 k refer kartese.atai polymorphism ar macanisom .
		 */
		/*
		System.out.println(s.area());		
		System.out.println(s1.area());
		System.out.println(s2.area());
		*/
		
		 Shape[] s =new Shape[3];
		 s[0] = new Shape();
		 s[1] = new Rectangle(10, 20);
		 s[2] = new Triangle(5, 10);
		 
		
		 for (int i =0; i < 3; i++){
			 System.out.println(s[i].area());
			 
		 }
		 
		
		
	}

}
