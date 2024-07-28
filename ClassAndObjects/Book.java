package ClassAndObjects;

public class Book {
         private String name;
         private String ISBN;
         private String authorName;
         private String publisher;
         private int totalPages;
         private int price;
         private static int bookCount=0;
         
         Book(String name,String ISBN,String authorName,String publisher,int totalPages,int price){
        	 this.name=name;
        	 this.ISBN=ISBN;
        	 this.authorName=authorName;
        	 this.publisher=publisher;
        	 this.totalPages=totalPages;
        	 this.price=price;
        	 bookCount++;
         }
         public static int getBookCount() {
        	 return bookCount;
         }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getISBN() {
			return ISBN;
		}
		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public int getTotalPages() {
			return totalPages;
		}
		public void setTotalPages(int totalPages) {
			this.totalPages = totalPages;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
}
