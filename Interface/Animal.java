public class Animal{

	String name;
	int weight;
	int height;
	String type;

	public Animal(String name, int weight, int height, String type){
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.type = type;
	}

	public void sleep(){
		System.out.println(name + " is Sleeping...");
	}

	public void walk(){
		System.out.println(name + " is Walking...");
	}

	public void eat(){
		System.out.println(name + " is Eating...");
	}

	/*public static void main(String args[]){
		Animal animal1 = new Animal("Lion", 165, 60, "Carnivore");
		Animal animal2 = new Animal("Deer", 40, 70, "Herbivore");
		Animal animal3 = new Animal("Dog", 50, 40, "Omnivore");

		animal1.sleep();
		animal2.sleep();
		animal3.sleep();

	}*/

}