package inheritting_Private_Member;

public class Test {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.setName("Lutfor Khan");
		t1.setAge(40);
		t1.setQualification("MSC in Computer");
		
		t1.displayInformation();
		
		
		
		Teacher t2 = new Teacher();
		t2.setName("Mokter Hossain");
		t2.setAge(42);
		t2.setQualification("Automation engineer");
		
		t2.displayInformation();
		
	}

}
