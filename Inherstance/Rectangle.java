package Inherstance;

public class Rectangle extends Shape{
	private int height;
	private int width;
	
        Rectangle(int height,int weight,String colour){
        	super(colour);
        	this.height=height;
        	this.setWidth(weight);
        }

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		
}
