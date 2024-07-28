package ClassAndObjects;

public class Movie {
           private String heroName;
           private int budget;
           private String producerName;
           private String directorName;
           private String genres;
           
           Movie(String heroName,int budget,String producerName,String directorName,String genres){
        	   this.budget=budget;
        	   this.heroName=heroName;
        	   this.producerName=producerName;
        	   this.directorName=directorName;
        	   this.genres=genres;
           }
		public String getHeroName() {
			return heroName;
		}
		public void setHeroName(String heroName) {
			this.heroName = heroName;
		}
		public int getBudget() {
			return budget;
		}
		public void setBudget(int budget) {
			this.budget = budget;
		}
		public String getProducerName() {
			return producerName;
		}
		public void setProducerName(String producerName) {
			this.producerName = producerName;
		}
		public String getDirectorName() {
			return directorName;
		}
		public void setDirectorName(String directorName) {
			this.directorName = directorName;
		}
		public String getGenres() {
			return genres;
		}
		public void setGenres(String genres) {
			this.genres = genres;
		}
           
}
