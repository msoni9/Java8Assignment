package ComparableComparatorJava7Java8;

public class Employee implements Comparable<Employee> {

	private int id = -1;
	private String firstName = null;
	private String lastName = null;
	private int age = -1;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public Employee(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return this.id - arg0.id;
	}


}
