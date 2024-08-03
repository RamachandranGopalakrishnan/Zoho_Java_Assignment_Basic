package Abstarct;

public class Book extends Product{
	 private String author;

	    public Book(String name,double price,String author) {
	        super(name, price);
	        this.author = author;
	    }

	    @Override
	    public String getDes() {
	        return  getName()+" "+ author +" "+ getPrice();
	    }

		@Override
		public double getPrice() {
			return this.getAmount();
		}
}
