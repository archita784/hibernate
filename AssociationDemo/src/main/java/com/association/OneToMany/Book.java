package com.association.OneToMany;

import javax.persistence.*;

@Table(name = "HiberBook")
@Entity
public class Book {
	 String title;
	String author;
	String category;
	
	
	@Id
	@GeneratedValue(generator = "booksq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "booksq", sequenceName = "book_sequence",initialValue = 50,allocationSize =1 )
	 int bookId;
	
	 int price;

	public Book() {
		super();
	}
	

	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		
		this.price = price;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", bookId=" + bookId
				+ ", price=" + price + "]";
	}

}
