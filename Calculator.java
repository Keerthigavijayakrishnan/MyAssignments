package week1.day2;



import org.testng.annotations.BeforeClass;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;


public class Calculator {
	
		
	public int addThreeNumbers (int a, int b, int c) {
		int d =a+b+c;
		return d;
	}
	public int subTwoNumbers (int e, int f) {
		int g =e-f;
		return g;
	}
	public int multiTwoNumbers (int h, int i) {
		int j =h*i;
		return j;
	}
	public int divTwoNumbers (int k, int l) {
		int m =k/l;
		return m;
	}

}
 

	



