
public class Animal {
	
	String type; //mammal, reptile, bird, amphibian
	String habitat; //water, underground, forest, etc..
	String voice;
	
	
//	Default constructor
//	public Animal() {
//		
//	}


	public Animal(String type, String habitat, String voice) {
		super();
		this.type = type;
		this.habitat = habitat;
		this.voice = voice;
	}
	
	public void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println(voice);
		};
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void sleep() {
		System.out.println("sleeping...");
	}


	
	
}
