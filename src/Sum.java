import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int First_No = 0, Second_No = 0;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number ");    //Taking Input from user
		First_No = input.nextInt();
		
		System.out.println("Enter Second Number ");
		Second_No = input.nextInt();
		
		while (Second_No != 0) {
			int carry = (First_No & Second_No); //CARRY is AND of two bits

			First_No = First_No ^ Second_No; //Sum of two bits is XOR
			Second_No = carry << 1; // shifting carry
		}
		System.out.println("The sum is :" + First_No);
	}

}
