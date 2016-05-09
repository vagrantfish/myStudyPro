package abstractClasses;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] people = new Person[2];
		people[0] = new Employee("harry",50000,1989,10,1);
		people[1] = new Student("harry","comupet");
		
		for(Person p:people)
			System.out.println(p.getName()+","+p.getDescription());

	}

}
