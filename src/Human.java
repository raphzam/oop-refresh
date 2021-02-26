
public class Human {
	
	
//	attributes or member variables
	
	String name;
	int age;
	int height; // measured in inches
	String eyeColor;
	
	
//	default constructor
	public Human(){
	}
	
	public Human(String name, int age, int height, String eyeColor) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyeColor = eyeColor;
	}
	

	public void speak(){
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + age + " years old");
		System.out.println("I am " + height + " inches tall");
		System.out.println("My eye color is " + eyeColor);
	}
	
	public void eat(){
		System.out.println("eating...");
	}
	
	public void walk(){
		System.out.println("walking...");
	}
	
	public void work(){
		System.out.println("working...");
	}
	

}
