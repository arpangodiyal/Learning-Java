public class Sparrow extends Bird implements Flyable{

	public Sparrow(String name, int weight, int height, String type){
		super(name, weight, height, type);
	}

	public void fly(){
		System.out.println("Sparrow flying high...");
	}

}