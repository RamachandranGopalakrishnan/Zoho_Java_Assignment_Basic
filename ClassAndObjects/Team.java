package ClassAndObjects;

public class Team {
         private String name;
         private String division;
         private String city;
         
         Team(String name,String division,String city){
        	 this.setName(name);
        	 this.setDivision(division);
        	 this.setCity(city);
         }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDivision() {
			return division;
		}

		public void setDivision(String division) {
			this.division = division;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
		public void playGame() {
			System.out.println("Playing game");
		}
		public void hireCouch() {
			System.out.println("Hiring couch");
		}
}
