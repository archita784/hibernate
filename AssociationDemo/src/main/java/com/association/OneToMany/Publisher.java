package com.association.OneToMany;

import java.util.Set;

import javax.persistence.*;

@Table(name = "HiberPublisher")
@Entity
public class Publisher {
	@Column(name="publisher_name",length=50)
	private String name;
	
	@Id
	@GeneratedValue(generator = "pubsq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "pubsq", sequenceName = "pub_sequence")
	@Column(name="publisher_id")
	private Integer publisherId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="publ_id",referencedColumnName = "publisher_id")
	private Set<Book> bookList;



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getPublisherId() {
		return publisherId;
	}



	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}



	public Set<Book> getBookList() {
		return bookList;
	}



	public void setBookList(Set<Book> bookList) {
		this.bookList = bookList;
	}
	

	@Override
	public String toString() {
		return "Publisher [name=" + name + ", publisherId=" + publisherId + ", bookList=" + bookList + "]";
	}

}
