package com.restapi.book.restapibook.dao;

import org.springframework.data.repository.CrudRepository;

import com.restapi.book.restapibook.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
    public Book findById(int id);
}
