package qcm1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class Book {
	public String title;
	public String genre;
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Double price;
	public Book(String title, Double price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public Book(String genre,String title) {
		super();
		this.title = title;
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [genre=" + genre + ", title=" + title + ", price=" + price + "]";
	}
	public static void main(String args[])
	{
		//Book b2 = new Book("titre book",null);
		//Supplier s2 = b2::getPrice;
		//System.out.println(b2.getTitle()+" "+s2.getAsDouble());
		List<Book>books = Arrays.asList(new Book("E","C"),new Book("E","B"),new Book("A","C"));
		Comparator<Book>c1 = (b1,b2)->b1.getGenre().compareTo(b2.getGenre());
		books.stream().sorted(c1.thenComparing(Book::getTitle)).forEach(System.out::println);
		System.out.println(books);
	}

}
