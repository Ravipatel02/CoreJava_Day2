package Question9;

public class Book extends LibraryResource implements Searchable {
    private String author;
	public Book(String title , String author) {
		super(title);
		this.author = author;
		
	}
	@Override
	public void searchResource(String quary) {
		if(getTitle().equalsIgnoreCase(quary) || author.equalsIgnoreCase(quary)) {
			System.out.println("Book fount :"+getTitle() +" by " +author);
		}else {
			System.out.println(quary +" book not found !");
		}
		
	}
    
	

}
