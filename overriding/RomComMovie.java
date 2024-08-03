package overriding;

public class RomComMovie extends Movie{
      
	RomComMovie(String name, String hero, String genre){
		super(name,hero,genre);
	}
	
	public String printGenre() {
		return super.printGenre();
	}
	
	public String printDetails() {
		return super.toString();
	}
}
