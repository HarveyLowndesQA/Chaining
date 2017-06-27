
public class AnimalWithWings extends Animal {

	private int numberOfWings;
	
	public AnimalWithWings(int age, String name, int numberOfWings) {
		super(age, name);
		this.setNumberOfWings(numberOfWings);
	}
	
	public AnimalWithWings() {
	}

	public int getNumberOfWings() {
		return numberOfWings;
	}

	public AnimalWithWings setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
		return this;
	}
	
	public String toString() {
		return getName() + " " + getAge() + " " + numberOfWings;
	}
}
