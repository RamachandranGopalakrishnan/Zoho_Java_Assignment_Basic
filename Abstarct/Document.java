package Abstarct;

public abstract class Document {
     String name;
     
     Document(String name){
    	 this.name=name;
     }
     abstract void save();
     public void prinf() {
    	 System.out.println("The file name is "+name);
     }
}
