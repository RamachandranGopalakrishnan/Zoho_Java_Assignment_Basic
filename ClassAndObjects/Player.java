package ClassAndObjects;

public class Player {
          private String name;
          private int jerseyNumber;
          private int position;
          Player(String name,int jerseyNumber,int position){
        	  this.name=name;
        	  this.jerseyNumber=jerseyNumber;
        	  this.position=position;
          }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getJerseyNumber() {
			return jerseyNumber;
		}
		public void setJerseyNumber(int jerseyNumber) {
			this.jerseyNumber = jerseyNumber;
		}
		public int getPosition() {
			return position;
		}
		public void setPosition(int position) {
			this.position = position;
		}
		public void playGame() {
			System.out.println("Playing game");
		}
		public void train() {
			System.out.println("Under training");
		}
          
}
