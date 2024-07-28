package Inherstance;

public class Shape {
        private String colour;

        Shape(String colour){
        	this.colour=colour;
        }
		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}
		public int circleArea(int radius) {
			return (int) (Math.PI*radius*radius);
		}
		public int rectangelArea(int height,int width) {
			return height*width;
		}
}
