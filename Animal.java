
public abstract class Animal {
	private String name;
	private static int population = 0;
	
	public abstract String makeASound();
	
	public Animal() {
		population++;
	}
	
	public Animal(String name) {
		this.name = name;
		population++;
	}
	
	public void introduce() {
		System.out.println(makeASound() + " My name is "+this.name);
	}
	
	public static int getAllAnimal() {
		return population;
	}

	public abstract Animal giveBirth();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
