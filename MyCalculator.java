package week1.day2;


public class MyCalculator {
	
		
		public static void main (String[] args) {
		Calculator objectcal = new Calculator();
		int addobj = objectcal.addThreeNumbers(4,5,6);
		System.out.println(addobj);
		int subobj = objectcal.subTwoNumbers(10,5);
		System.out.println(subobj);
		int mulobj = objectcal.multiTwoNumbers(12,2);
		System.out.println(mulobj);
		int divobj = objectcal.divTwoNumbers(25,5);
		System.out.println(divobj);

		
	}	
	
}
