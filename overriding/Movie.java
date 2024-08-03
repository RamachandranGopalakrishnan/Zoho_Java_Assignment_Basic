package overriding;

public class Movie {
      private String name;
      private String hero;
      private String genre;
      
      
	public Movie(String name, String hero, String genre) {
		super();
		this.name = name;
		this.hero = hero;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
      public String toString() {
    	  return this.hero+" "+this.genre+" "+this.name;
      }
	public String printGenre() {
		return this.genre;
		
	}
}
