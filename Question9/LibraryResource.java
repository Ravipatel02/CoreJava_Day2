package Question9;

public abstract class LibraryResource {
	private String title;
	private boolean checkOut;
	
	public LibraryResource(String title) {
		super();
		this.title = title;
		this.checkOut = false;
	}
	
	public void checkout() {
		if(!checkOut) {
			checkOut = true;
			System.out.println(title +" checkout successfully ! ");
		}else {
			System.out.println(title + "is allrady check out !");
		}
	}
	
	public void returnResource() {
		if(checkOut) {
			checkOut = false;
			System.out.println(title +" Resource return successfully !");
		}else {
			System.out.println(title + " is not cheked out !");
		}
	}

	public String getTitle() {
		return title;
	}



	public boolean isCheckOut() {
		return checkOut;
	}

}
