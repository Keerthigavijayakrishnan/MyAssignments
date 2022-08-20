package week3.day1assignment3;
//Create a class extends with super class
public class AxisBank extends BankInfo {
	//Add a method deposit
	public void deposit(){
		System.out.println("BaseClass Deposit: 20,000");
		
	}
	
	//@Method Override
	public void LearnOverride(){
		//Call the method deposit in super class
	super.deposit();
		//Call the method deposit in base class
		this.deposit();
	}
	
	
	//Create main method
	public static void main(String[] args) {
		
		//Create a object for base class
		AxisBank axisbank = new AxisBank();
		//Call the methods in base class
		axisbank.deposit();
		axisbank.LearnOverride();
		//Call the methods in super class 
		axisbank.saving();
		axisbank.fixed();
		axisbank.deposit();
	}
	
	

}
