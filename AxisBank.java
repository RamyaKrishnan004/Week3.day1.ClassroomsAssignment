package week3.day1;

public class AxisBank extends Bankinfo {
	public void deposit(){
		System.out.println(" deposit method is override");
		
	}

	public static void main(String[] args) {
	
		AxisBank objt=new AxisBank();
		objt.saving();
		objt.fixed();
		objt.deposit();

	}


}
