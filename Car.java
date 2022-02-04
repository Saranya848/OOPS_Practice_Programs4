package day4;

public class Car {
    int version;//varible
    String name;
    Car(int i,String n){
    version = i;
    name = n;
    }
    void display(){
    	System.out.println(name+" "+version);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Car c1 = new Car(700,"XUV");
	    c1.display();
	}

}
