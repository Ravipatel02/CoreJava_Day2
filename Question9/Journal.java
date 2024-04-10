package Question9;

public class Journal extends LibraryResource implements Searchable {
	private int ishuNumber;
	
	public Journal(String title , int ishuNumber ) {
		super(title);
		this.ishuNumber = ishuNumber;
		
	}

	@Override
	public void searchResource(String quary) {
		if(getTitle().equalsIgnoreCase(quary) || ishuNumber == Integer.parseInt(quary)) {
			System.out.println("Found Journal "+getTitle() + " Issue Number "+ ishuNumber);
		}
		
	}
	
	



}
