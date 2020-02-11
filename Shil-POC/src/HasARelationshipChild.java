
public class HasARelationshipChild {
	int age;
	HasARelationshipParent name;
	public void display(int age,HasARelationshipParent name) {
		
		System.out.println(age);
		System.out.println(name.firstName +name.middleName +name.lastName);
	}

	public static void main(String[] args) {
		HasARelationshipChild child = new HasARelationshipChild();
		HasARelationshipParent name = new HasARelationshipParent("shilpa","shil","muniyalla");
		child.display(30, name);
	}

}
