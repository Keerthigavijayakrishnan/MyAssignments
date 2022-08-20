
//Create a package
package week3.day1assignment4;

//Create a class
public class Students {
	
	/**
	 * This method contains multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	 */
	
	//Create a class by passing arguments id & name
public void getStudentInfo(int a, String b) {
	System.out.println("Student Id: "+a);
	System.out.println("Student Name: "+b);
}

//Create a class by passing arguments Email & PhoneNumber with same syntax of previous method
public void getStudentInfo(String a, long b) {
	System.out.println("Student Email: "+a);
	System.out.println("Student PhoneNumber: "+b);
}

//Create a main method
public static void main(String[] args) {
	//Creating a object for class
	Students students = new Students();
	//Call the methods by passing the arguments value
	students.getStudentInfo(4122, "Ms.K");
	students.getStudentInfo("k@gmail.com", 9087678909l);
}
	
}
