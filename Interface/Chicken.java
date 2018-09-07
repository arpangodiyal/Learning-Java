public class Chicken extends Bird implements Flyable{

	public Chicken(String name, int weight, int height, String type){

		super(name, weight, height, type);
	}

	public void fly(){
		System.out.println("A chicken cannot fly");
	}
}