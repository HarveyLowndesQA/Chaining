
public class AnimalApp {

	public static void main(String args[]) {
		AnimalWithWings bird = ((AnimalWithWings) (new AnimalWithWings()
				.setName("Perry The Parrot")
				.setAge(21)))
				.setNumberOfWings(14);
		System.out.println(bird);
		
		/*int no = 2152;
		if(no > 4000) {
			System.out.println("A");
			no = no + 1000;
			if(no > 5000){
				System.out.println("B");
				System.out.println("C");
			} else {
				System.out.println("D");
			}
			System.out.println("E");
		} else {
			no = no + 1000;
			System.out.println("F");
			System.out.println("G");
			if(no < 5000) {
				System.out.println("J");
			} else {
				System.out.println("H");
				System.out.println("I");
			}
			System.out.println("K");
		}
		System.out.println("L");*/
	}
	
}
