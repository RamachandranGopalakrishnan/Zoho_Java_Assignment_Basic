package Inherstance;

public class Librarian {
        private String name;
		private int id;
        private int password;
        private String searchString;
        public Librarian(String name, int id, int password, String searchString) {
			super();
			this.name = name;
			this.id = id;
			this.password = password;
			this.searchString = searchString;
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
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
		public String getSearchString() {
			return searchString;
		}
		public void setSearchString(String searchString) {
			this.searchString = searchString;
		}
		
        
        public void verifyLibrarian() {
        	System.out.println("varifying");
        }
        public void search() {
        	System.out.println("searching");
        }
        @Override
		public String toString() {
			return "Librarian [name=" + name + ", id=" + id + ", password=" + password + ", searchString="
					+ searchString + "]";
		}
}
