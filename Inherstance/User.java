package Inherstance;

public class User {
          private String name;
          private int id;
          public User(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}
		
          
          public void verify() {
        	  System.out.println("verify");
          }
          public void checkAccount() {
        	  System.out.println("check Account");
          }
          public void getBookInfo() {
        	  System.out.println("info of book");
          }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
}
