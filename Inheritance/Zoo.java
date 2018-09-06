class Zoo{
	public static void main(String args[]){
		Animal animal1 = new Animal("Lion", 165, 60, "Carnivore");
		Animal animal2 = new Animal("Deer", 40, 70, "Herbivore");
		Animal animal3 = new Animal("Dog", 50, 40, "Omnivore");

		animal1.sleep();
		animal2.sleep();
		animal3.sleep();

		Fish fish1 = new Fish("Shark", 200, 1000, "Carnivore");
		fish1.swim();
		fish1.eat();

	}
}