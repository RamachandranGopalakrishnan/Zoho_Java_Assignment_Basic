package Abstarct;

public class Main {
    public static void main(String args[]) {
    	
    	//1
    	Employee employee1=new HourlyEmployee("xxx","Business",24,10000000);
    	System.out.println(employee1.calculatePay());
    	
    	Employee employee2=new SalariedEmployee("yyy","Software devoper",30,6000);
    	System.out.println(employee2.calculatePay());
    	
    	
    	Cart cart = new Cart();

        Product laptop = new Electronic("Laptop", 1200.00, "Dell");
        Product tshirt = new Cloth("T-Shirt", 20.00, "L");
        Product book = new Book("Java Programming", 45.00, "John Doe");

        cart.addProduct(laptop);
        cart.addProduct(tshirt);
        cart.addProduct(book);

        cart.displayProducts();
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}
