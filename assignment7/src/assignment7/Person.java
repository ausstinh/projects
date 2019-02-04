package assignment7;

public class Person implements PersonInterface, Comparable<Person> {

	
	private String firstName;
	private String lastName;
	private boolean running;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public void walk() {
		System.out.println(this.firstName + " is walking now");
		running = false;
	}

	@Override
	public void run() {
		System.out.println(this.firstName + " is running now");
		running = true;
	}

	@Override
	public boolean isRunning() {
		
		
		
		return running;
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

	@Override
	public int compareTo(Person other) {
		
		 if ( this.age == other.age )
			 return 0;
		 if (this.age > other.age)
			 return 1;
		 else 
			 return -1;
		
		
		
		
		
		
	}

	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.age;
	}

}
