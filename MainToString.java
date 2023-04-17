package class_and_object;
import java.util.Scanner;

public class MainToString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("The Address Details are");
		
		//takes input(sc) from the keyboard
		
		String addressLine1 = sc.nextLine();
		String addressLine2 = sc.nextLine();
		String city = sc.nextLine();
		String state= sc.nextLine();
		Integer pincode =sc.nextInt();
		
		// closes the scanner
		sc.close();
	}

	}


