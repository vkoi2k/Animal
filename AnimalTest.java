
public class AnimalTest {
	public static void main(String[] args) {
		Animal cat1 = new Cat("Mèo Nga xanh");	
		cat1.introduce();
		System.out.println("The numbers of cat: "+Cat.getPopulation());
		System.out.println("-----------");
		Animal dog1 = new Dog("Husky");
		dog1.introduce();
		System.out.println("The numbers of dog: "+Dog.getPopulation());
		System.out.println("-----------");
		Animal cow1 = new Cow("Bò sữa");
		cow1.introduce();
		System.out.println("The numbers of cow: "+Cow.getPopulation());
		System.out.println(Cow.getPopulation());
		System.out.println("-----------");
		Animal babyHusky = dog1.giveBirth();
		babyHusky.introduce();
		System.out.println("The numbers of dog: "+Dog.getPopulation());
		System.out.println("-----------");
		System.out.println("All animal: "+Animal.getAllAnimal());
	}
}
