package day4;

public class Overriding {
	   static int area(int a, int b) {
		   return a*b;
	   }
	   class Measure extends Overriding{
	   static int area(int a, int b) {
		   return a*b;
	   }
	   }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Overriding m1 = new Overriding();
			Overriding m2 = new Overriding();
		 System.out.println("The volume is: " + m1.area(3,4));
	     System.out.println("The volume is: " + m2.area(3,6));
		}

}
