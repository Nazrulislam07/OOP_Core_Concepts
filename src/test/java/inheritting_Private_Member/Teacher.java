package inheritting_Private_Member;

public class Teacher extends Person {
	// getName(),setName(),setAge(),getAge() are already came here

	private String qualification;
	

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	void displayInformation(){
		
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getQualification());
		System.out.println("\n");
	}
}
