package FouthAssignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person ram=new Person("Ram");
     Person soundarya=new Person("Soundarya",22);
     Person gopalakrishnan=new Person("Gopalakrishnan",63,"karuppur");
     Person sumathi=new Person("sumathi");
     System.out.println(ram.name);
     System.out.println(soundarya.name+" "+soundarya.age);
     System.out.println(gopalakrishnan.name+" "+gopalakrishnan.age+" "+gopalakrishnan.address);
     System.out.println(sumathi.name);
	}

}

