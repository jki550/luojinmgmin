package java_exam;

import java.util.Scanner;

public class tuzi {
	public static void main(String[] args) {
 
			long f1 = 1;
			long f2 = 1;
			long fn = 1;
			for (int i = 1; i < 50; i++) {

			fn = f1 + f2;

			f2 = f1;

			f1 = fn;

			System.out.println(i + "," + fn);
			}
			}		
		
}