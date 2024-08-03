package overriding;

public class ThrillerMovie extends Movie{
     
	ThrillerMovie(String name, String hero, String genre){
		super(name,hero,genre);
	}
	
	public String printGenre() {
		return super.printGenre();
	}
	
	public String printDetails() {
		return super.toString();
	}
}
