package calculte_num;

import java.util.Scanner;

public class CalculateNum {

	public static void main(String[] args) {
		
System.out.println("Enter the number here : ");
		
		Scanner sc = new Scanner(System.in);
		int i = 1, fact = 1;
		int number = sc.nextInt();
		
		while(i <= number) {
			fact = fact * i;
			i++;
			
			}
			
			System.out.println("The factorial is  =  " + fact );
			
	}
}
