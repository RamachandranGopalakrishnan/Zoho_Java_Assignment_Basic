package Abstarct;

public class ActionMovie extends Movie{
       private String name;
   	   private String actorname;
       private String director;
       private int price;
       
        ActionMovie(String name, String actorname, String director, int price) {
		super();
		this.name = name;
		this.actorname = actorname;
		this.director = director;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActorname() {
		return actorname;
	}
	public void setActorname(String actorname) {
		this.actorname = actorname;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int priceOfTicket() {
		// TODO Auto-generated method stub
		return this.price;
	}
	@Override
	public void cast() {
		System.out.println(this.name+" "+this.actorname+" "+this.director);
		
	}

       
}
