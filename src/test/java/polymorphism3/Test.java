package polymorphism3;

public class Test {

	public static void main(String[] args) {


		Person p = new Person();
		p = new Teacher();	
		p = new Student();
		/*Dynamic method dispatch
		 akhane sob class ar object creat karte hobe na
		 super class ar akta reference varible sub class ar object
		 k refer kartese.atai polymorphism ar macanisom .
		 */
								


		p.display();
		p.display();
		p.display();

		/* or   
		Person p = new Person();
		p.display();

		p = new Teacher();
		p.display();

		p = new Student();		
		p.display();*/
	}

}
