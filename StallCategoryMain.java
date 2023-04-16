package class_and_object;

public class StallCategoryMain {
	
	public static void main(String[] args) {
	
		//create object of default constructor
		
				StallCategory stall1 = new StallCategory();
				
				System.out.println("Using Default Constructor");
				System.out.println("name :" + stall1.getName()  + " and Details:" + stall1.getDetails());
				
				// create object of parametarised constructor
				StallCategory stall2 = new StallCategory("Book","All latest books are available under this category");
				
				System.out.println("Using Parameterised Constructor");
				System.out.println("name :" + stall2.getName()  + " and Details:" + stall2.getDetails());
			}

		
		
	}


