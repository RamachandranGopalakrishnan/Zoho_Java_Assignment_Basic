package Inherstance;

public class LibraryManagementSystem {
	private  String usertype;
	private String userName;
    private String userPassword;
       public LibraryManagementSystem(String usertype, String userName, String userPassword) {
		super();
		this.usertype = usertype;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	
       
       public void logIn() {
    	   System.out.println("log in");
       }
       
       public void register() {
    	   System.out.println("register");
       }
       
       public void logOut() {
    	   System.out.println("log out");
       }

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	 @Override
		public String toString() {
			return "LibraryManagementSystem [usertype=" + usertype + ", userName=" + userName + ", userPassword="
					+ userPassword + "]";
		}

}
