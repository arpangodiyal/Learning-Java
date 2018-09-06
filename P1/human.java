public class Human{
	String name;
	int age;
	int height;

	public Human(){

	}

	public void speak(){
		System.out.println("My name is" + name);
		System.out.println("I am " + age + " years old");
		System.out.println("I am " + height + " inches tall");
	}

	public void eat(){
		System.out.println("Eating...");
	}

	public void walk(){
		System.out.println("Walking...");
	}
}