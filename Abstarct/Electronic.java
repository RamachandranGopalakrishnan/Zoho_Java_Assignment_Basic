package Abstarct;

public class Electronic extends Product{
          private String brand;
          Electronic(String name,double price,String brand){
        	  super(name,price);
        	  this.brand=brand;
          }
		@Override
		public double getPrice() {
			return this.getAmount();
		}
		@Override
		public String getDes() {
			return this.getName()+" "+this.getPrice()+" "+this.brand;
		}
}
