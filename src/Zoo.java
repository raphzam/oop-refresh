
public class Zoo {

	public static void main(String[] args) {
		
		Animal crow = new Animal("bird", "sky", "cawww caww");
		Animal dog = new Animal("mammal", "house", "woof woof");
		
		crow.speak();
		dog.speak();
		
		
		Animal fish = new Fish("fish", "water", "glub glub");
		
		fish.speak();
		fish.sleep();

	}

}
