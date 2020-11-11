
public class Cat extends Animal{

	private static int population = 0;
	
	public Cat() {
		System.out.println("Call cat");
		population++;
	}
	
	public Cat(String name) {
		super(name);
		System.out.println("Call cat");
		population++;
	}
	
	@Override
	public String makeASound() {
		// TODO Auto-generated method stub
		return "Meow!";
	}

	public static int getPopulation() {
		return population;
	}

	@Override
	public Animal giveBirth() {
		return new Cat(getName()+"'s baby");
	}
	
	
}
