
public class Cow extends Animal{
	
	private static int population = 0;
	
	public Cow() {
		System.out.println("Call cow");
		population++;
	}
	
	public Cow(String name) {
		super(name);
		System.out.println("Call cow");
		population++;
	}
	
	@Override
	public String makeASound() {
		// TODO Auto-generated method stub
		return "Moo!";
	}
	
	public static int getPopulation() {
		return population;
	}

	@Override
	public Animal giveBirth() {
		return new Cow(getName()+"'s baby");
	}
}
