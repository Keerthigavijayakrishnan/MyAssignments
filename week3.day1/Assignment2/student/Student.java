
//Create a package
package org.student;

import org.department.Department;
import org.college.College;

//Create a class extends with parent class
public class Student extends Department  {

	//Add a Method studentName
	public void studentName() {
		System.out.println("Student Name: Ms.K");
	}
	
	//Add a Method studentDept
		public void studentDept() {
			System.out.println("Student Department: CSE");
		}
		
		//Add a Method studentId
		public void studentId() {
			System.out.println("Student ID: 40075");
		}
	
		//Add main method
		public static void main(String[] args) {
			//Create object for package1.class
			College college = new College();
			//Call all the methods in class College
			college.collegeCode();
			college.collegeName();
			college.collegeRank();
			
			//Create object for package2.class
			Department department = new Department();
			//Call all the methods in class Department
			department.deptName();
			//Call all the methods in class College
			department.collegeCode();
			department.collegeName();
			department.collegeRank();
			
			//Create object for package3.class
			Student student = new Student();
			//Call all the methods in class Student
			student.studentId();
			student.studentName();
			student.studentDept();
			//Call all the methods in class Department
			department.deptName();
			//Call all the methods in class College
			department.collegeCode();
			department.collegeName();
			department.collegeRank();
			
			
		}
		
}
