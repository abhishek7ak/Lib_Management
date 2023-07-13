package com.greatlearning.libmgmt.service;

import java.util.List;

import com.greatlearning.libmgmt.entity.Book;

public interface BookService {
	
	public List<Book> getAllBooks();
	public void saveBook(Book book);
	public void deleteBookById(int id);
	public Book getBookById(int id);

}
