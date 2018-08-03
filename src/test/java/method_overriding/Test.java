package method_overriding;

public class Test {

	public static void main(String[] args) {

		Teacher t1 = new Teacher();
		t1.name = "Lutfor Khan";
		t1.age = 40;
		t1.qualification = "MSC in Computer";
		t1.displayInformation();
		
		
		Person p1 = new Person();
		p1.name ="Nazrul Islam";
		p1.age = 31;
		p1.displayInformation();
		
	}

}
