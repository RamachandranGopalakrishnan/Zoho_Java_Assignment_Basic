package Constructors;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Book> books=new ArrayList<>();
         List<Employee> employees=new ArrayList<>();
         List<Movie> movies=new ArrayList<>();
         
         addBooks("AAA","BBB","CCC","DDD",20,2000,books);
         addBooks("ZZZ","XXX","VVV","BBB",90,80,books);
         displayBook(books);
         
         addEmployee("Ram",10000000,"software devloper",employees);
         addEmployee("soundarya",10000000,"Doctor",employees);
         displayEmployee(employees);
         
         addMovie("Vijay",100000000,"Ram","shankar","action",movies);
         addMovie("Hrithick Roshan",100000000,"Ram","shankar","comdy",movies);
         displayMovie(movies);
         
	}
	public static void addEmployee(String name,int salary,String role,List<Employee> employees) {
		Employee employee=new Employee(name,salary,role);
		employees.add(employee);
	}
	public static void displayEmployee(List<Employee> employees) {
		for(Employee e:employees) {
			System.out.println(e);
		}
	}
     public static void addBooks(String name,String ISBN,String authorName,String publisher,
    		 int totalPages,int price,List<Book> books) {
    	 Book book=new Book(name,ISBN,authorName,publisher,totalPages,price);
    	 books.add(book);
     }
     public static void displayBook(List<Book> books) {
    	 for(Book b:books) {
    		 System.out.println(b);
    	 }
     }
     public static void addMovie(String heroName,int budget,
    		 String producerName,String directorName,String genres,List<Movie> movies) {
    	 Movie movie=new Movie(heroName,budget,producerName,directorName,genres);
    	 movies.add(movie);
     }
     public static void displayMovie(List<Movie> movies) {
    	 for(Movie m:movies) {
    		 System.out.println(m);
    	 }
     }
}
