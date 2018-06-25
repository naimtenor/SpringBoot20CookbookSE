package com.example.bookpub.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.bookpub.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	public Book findBookByIsbn(String isbn);
}
