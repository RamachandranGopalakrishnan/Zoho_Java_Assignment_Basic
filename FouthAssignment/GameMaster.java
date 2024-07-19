package FouthAssignment;

public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
       public String describe(Character c){
           return "You're a level "+c.getLevel()+" "+ c.getCharacterClass()+" with "+ c.getHitPoints()+" hit points.";
       }
    // TODO: define a 'describe' method that returns a description of a Destination
      public String describe(Destination d){
          return "You've arrived at "+  d.getName()+", which has " +d.getInhabitants()+ " inhabitants.";
}
    // TODO: define a 'describe' method that returns a description of a TravelMethod
       public String describe(TravelMethod t){
           String s=t.name().toLowerCase();
           if(s.equals("walking")){
             return  "You're traveling to your destination by walking.";
}
           return "You're traveling to your destination on horseback.";
}
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
       public static String describe(Character c,Destination d,TravelMethod t){
           String s=t.name().toLowerCase();
           if(s.equals("horseback")){
           return "You're a level "+c.getLevel()+" "+c.getCharacterClass() +" with "+c.getHitPoints()+" hit points. You're traveling to your destination on "+s+". You've arrived at "+ d.getName()+", which has "+d.getInhabitants()+" inhabitants.";
           }
            return "You're a level "+c.getLevel()+" "+c.getCharacterClass() +" with "+c.getHitPoints()+" hit points. You're traveling to your destination by "+s+". You've arrived at "+d.getName()+", which has "+d.getInhabitants()+" inhabitants.";
       }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character c,Destination d){
        return "You're a level "+c.getLevel()+" "+c.getCharacterClass()+ " with " +c.getHitPoints()+" hit points. You're traveling to your destination by walking. You've arrived at "+d.getName()+", which has "+d.getInhabitants()+" inhabitants.";
}
}
 class Character {
    private String characterClass;
    private int level;
    private int hitPoints;

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
 class Destination {
	    private String name;
	    private int inhabitants;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getInhabitants() {
	        return inhabitants;
	    }

	    public void setInhabitants(int inhabitants) {
	        this.inhabitants = inhabitants;
	    }
	}
  enum TravelMethod {
	    WALKING,
	    HORSEBACK
	}