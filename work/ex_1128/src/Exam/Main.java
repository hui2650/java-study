package Exam;

public class Main {
	public static void main(String[] args) {
		Animal[] zoo = new Animal[3];
		//Animal[] zoo = { new Animal(), new Dog(), new Cat() }
		
		zoo[0] = new Animal();
		zoo[1] = new Dog();          
		zoo[2] = new Cat();
		
		for(Animal a : zoo) {
			a.sound();
		}
		
		AnimalTrainner trainner = new AnimalTrainner();
		
		trainner.train(new Dog());
		trainner.train(zoo[2]);                            
		
		
	}                                 
}
