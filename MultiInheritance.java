package day4;
class Animals{
	void bark() {
		System.out.println("The Dog is barking");
	}
}
class Puppy extends Animals{
	void weep() {
		System.out.println("The puppies are weeping");
	}
}
class Dogs extends Puppy{
	void eat() {
		System.out.println("The puppies are eating");
	}
}
public class MultiInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dogs d = new Dogs();
    d.bark();
    d.weep();
    d.eat();


	}

}
