public class Fish extends Animal{

	public Fish(String name, int weight, int height, String type){
		super(name, weight, height, type);
	}

	public void swim(){
		System.out.println("Swimming...");
	}
}