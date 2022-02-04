package day4;

public class Overloading {
   static double volume(double a, double b) {
	   return a*b;
   }
   static double volume(double a, double b, double c) {
	   return a*b*c;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("The volume is: " + Overloading.volume(3,6));
	}

}
