/**
 * 
 */
package sef.module3.activity;

/**
 * @author
 *
 */
public class FindLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Find Largest of two numbers
				
		int num1 = 1, num2 = 2;

		if (num1 > num2) {
			System.out.println(num1 + " is largest of two numbers");
		} else {
			System.out.println(num2 + " is largest of two numbers");
		}

		// Find Largest of three numbers
				
		int i = 1, j = 2, k = 10;

		if(i >= j) {
			if(i >= k)
				System.out.println(i + " is the largest number.");
			else
				System.out.println(k + " is the largest number.");
		} else {
			if(j >= k)
				System.out.println(j + " is the largest number.");
			else
				System.out.println(k + " is the largest number.");
		}


	}

}
