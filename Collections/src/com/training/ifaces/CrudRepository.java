package com.training.ifaces;

import com.training.model.Book;
import java.util.*;

public interface CrudRepository {
	public boolean add(Book book);
	public Book findById(int id);
	public boolean remove(Book book);
	public List<Book>findAll();
    public Book update(Book oldBook,Book recentbook);
}
