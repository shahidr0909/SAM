package class_and_object;
import java.util.Scanner;

public class ItemMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// create object of ItemType class with parametariised arguments
		 ItemType item = new ItemType("Electronics",2500,125);
		System.out.println("Item display details:");
		 
		String name = sc.nextLine();
		double deposit = sc.nextDouble();
		double costPerDay= sc.nextDouble();
		
		item.display();
		 
		 System.out.println(item.getName());
		 System.out.println(item.getDeposit());
		 System.out.println(item.getCostPerDay());
		 
}
}

