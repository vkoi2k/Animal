
public class Dog extends Animal{
	
	private static int population = 0;
	
	public Dog() {
		System.out.println("Call dog");
		population++;
	}
	
	public Dog(String name) {
		super(name);
		System.out.println("Call dog");
		population++;
	}

	@Override
	public String makeASound() {
		// TODO Auto-generated method stub
		return "Woof!";
	}

	public static int getPopulation() {
		return population;
	}

	@Override
	public Animal giveBirth() {
		return new Dog(getName()+"'s baby");
	}
	
	
}
