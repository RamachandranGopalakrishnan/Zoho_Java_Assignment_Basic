package Inherstance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Circle circle=new Circle("blue",23);
		System.out.println(circle.getColour());
		System.out.println(circle.circleArea(23));
		
		Rectangle rec=new Rectangle(23,45,"red");
		System.out.println(rec.rectangelArea(23, 45));
		System.out.println(rec.getColour());
		
		
		ZsgsStudent people=new ZsgsStudent("people",21,10000,3);
		System.out.println(people);
	}

}
