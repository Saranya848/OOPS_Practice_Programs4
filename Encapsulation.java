package day4;

public class Encapsulation {

	private long accno;  
	private String bname;  
	private float balance;
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public float getBalance() {
		return balance;
	}
	public void setAmount(float balance) {
		this.balance = balance;
	}
	public static void main(String[] args) {
		
		Encapsulation a=new Encapsulation();
		a.setAccno(5046384370L);
	    a.setBname("Vizag"); 
      System.out.println(a.getAccno()+" "+a.getBname()+": ");
	    a.setBalance(50002314);
	    System.out.println(" "+a.getBalance()); 
	}
}
