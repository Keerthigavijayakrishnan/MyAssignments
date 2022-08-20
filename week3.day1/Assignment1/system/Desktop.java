package org.system;

//Create a class
public class Desktop {
	
	//Add Method
	public void desktopSize() {
		System.out.println("Desktop size: 21In");
	}

	//create a main class
	public static void main (String[] args) {
	
		//Create object for class Computer
		Computer computer = new Computer();
		//call the method in class computer
		computer.computerModel();
		//create a object for class Desktop
		Desktop desktop = new Desktop();
		//call the method in class Desktop
		desktop.desktopSize();
		
	}
}
