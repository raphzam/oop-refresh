
public class Earth {
	public static void main(String[] args) {
		
		Human tom; 				// reference variable of type Human
		tom = new Human(); 		// new keyword used to create Object
								// memory location of the Object is referenced by variable
		
		tom.age = 6;
		tom.eyeColor = "brown";
		tom.height = 72;
		tom.name = "Thomas";
		
		tom.speak();
		
		System.out.println();
		
		Human joel = new Human("Joel", 16, 22, "green");
		joel.speak();
		
		System.out.println();
		System.out.println();
		
		Human human1 = new Human("Jason", 26, 60, "brown");
		Human human2 = new Human("Jasmine", 24, 64, "brown");
		Human human3 = new Human("Henry", 17, 55, "brown");
		
		human1.speak();
		human2.speak();
		human3.speak();
		
		
	}

}
