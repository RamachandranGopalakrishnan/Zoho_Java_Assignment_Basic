package Inherstance;

public class Book {
	private String title;
  	private String author;
        private String ISBN;
        private String pubshlier;
      
      public Book(String title, String author, String iSBN, String pubshlier) {
  		super();
  		this.title = title;
  		this.author = author;
  		ISBN = iSBN;
  		this.pubshlier = pubshlier;
  	}
      public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPubshlier() {
		return pubshlier;
	}
	public void setPubshlier(String pubshlier) {
		this.pubshlier = pubshlier;
	}
	
      
      public void showDueDate(){
    	  System.out.println("Due date");
      }
      public void reservationStatus(){
    	  System.out.println("reservation status");
      }
      public void feedBack(){
    	  System.out.println("FeedBack");
      }
      public void bookReq(){
    	  System.out.println("Book Request");
      }
      public void info(){
    	  System.out.println("Info");
      }
      @Override
  	public String toString() {
  		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", pubshlier=" + pubshlier + "]";
  	}
  	
}
