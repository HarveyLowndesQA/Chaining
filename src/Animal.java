
public class Animal {

	private int age;
	private String name;
	
	public Animal(int age, String name) {
		this.setAge(age);
		this.setName(name);
	}
	
	public Animal() {
	}

	public int getAge() {
		return age;
	}

	public Animal setAge(int age) {
		this.age = age;
		return this;
	}

	public String getName() {
		return name;
	}

	public Animal setName(String name) {
		this.name = name;
		return this;
	}
	
	public String toString() {
		return name + " " + age;
	}

}
