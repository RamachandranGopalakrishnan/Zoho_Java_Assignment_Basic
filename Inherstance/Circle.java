package Inherstance;

public class Circle extends Shape{
       private int radius;
     
       Circle(String colour,int radius){
    	   super(colour);
    	   this.radius=radius;
       }
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
