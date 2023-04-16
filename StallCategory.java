package class_and_object;

public class StallCategory {
	
	private String name;
	private String details;
	
	void display() {
		System.out.println("display the category of stall:");
		
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	// default constructor
	StallCategory(){
		System.out.println("Default constructor");
	}

	public StallCategory(String name, String details) {
		super();
		this.name = name;
		this.details = details;
		System.out.println("Enter the name of the stall category:"+name);
		System.out.println("Enter the details of the stall category:"+details);
	}
	
	
	

}