package day4;
class Animal1{
	void sound() {
		System.out.println("The following animals:");
	}
}
class Cats1 extends Animal1{
	void meow() {
		System.out.println("The Cats are meowing");
	}
}
class Dogs1 extends Animal1{
	void bark() {
		System.out.println("The Dogs are barking");
	}
}
public class HierarchicaInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dogs1 d = new Dogs1();
d.sound();

d.bark();




	}

}
