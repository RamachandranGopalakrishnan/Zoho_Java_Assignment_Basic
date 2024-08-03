package Abstarct;

public abstract class Product {
        private String name;
        private double amount;
        
        Product(String name,double price){
        	this.name=name;
        	this.amount=price;
        }
        
        public double getAmount() {
			return this.amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public abstract double getPrice();
        public abstract String getDes();

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
}
