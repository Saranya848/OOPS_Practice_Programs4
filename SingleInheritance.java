package day4;
class Animal{
	void eat() {
		System.out.println("The animal is eating");
	}
}
	class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog m = new Dog();
    m.eat();
    m.bark();
	}

}
