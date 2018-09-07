class Zoo{
	public static void main(String args[]){
		Animal animal1 = new Animal("Lion", 165, 60, "Animal");
		Animal animal2 = new Animal("Deer", 40, 70, "Animal");
		Animal animal3 = new Animal("Dog", 50, 40, "Animal");

		animal1.sleep();
		animal2.sleep();
		animal3.sleep();

		Fish fish1 = new Fish("Shark", 200, 1000, "Fish");
		fish1.swim();
		fish1.eat();

		Sparrow s1 = new Sparrow("Sparrow", 10, 10, "Bird");
		s1.eat();
		s1.sleep();
		s1.fly();

		Chicken c1 = new Chicken("Chicken", 5, 10, "Bird");
		c1.eat();
		c1.fly();

	}
}