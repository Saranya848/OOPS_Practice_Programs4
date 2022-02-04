package day4;

public class Constructor {
    int id;
    String name;
    Constructor()
    {
      System.out.println(id+" "+ name);
    }//default constructor
    Constructor(int i,String n){
    id = i;
    name = n;
    }//parameter constructor
    void display(){
    	System.out.println(id+" "+name);}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Constructor c1 = new Constructor();
	    Constructor c2 = new Constructor(22,"Ram");
	    c1.display();
	    c2.display();
	}

}
