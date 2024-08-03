package Abstarct;

public class Cloth extends Product{
	private String size;

    public Cloth(String name, double price, String size) {
        super(name, price);
        this.setSize(size);
    }

	@Override
	public double getPrice() {
		return this.getAmount();
	}

	@Override
	public String getDes() {
		return  getName() +" " + getPrice()+" "+getSize();
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
