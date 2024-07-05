package com.restapi.book.restapibook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.book.restapibook.dao.BookRepository;
import com.restapi.book.restapibook.entities.Book;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // public static List<Book> list = new ArrayList();
    
    // static{
    //     list.add(new Book(12,"Java Complete Reference","ABC"));
    //     list.add(new Book(17,"Head First To Java","XYZ"));
    //     list.add(new Book(14,"Think in java","PQR"));
    // }

    //get all books
    public List<Book> getALlBooks(){
        List<Book> list = (List<Book>) this.bookRepository.findAll();
        return list;
    }

    //get single book by id
    public Book getBookById(int id){
        Book book = null;
        try{
       // book =  list.stream().filter(e->e.getId()==id).findFirst().get();
         book = this.bookRepository.findById(id);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return book;
    }

    //adding the book
    public Book addBook(Book b){
        Book result = bookRepository.save(b);
        return result;
    }

    //delete book
    public void deleteBook(int bid){
        //list = list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
        bookRepository.deleteById(bid);
    }

    //Update book
    public void updateBook(Book book, int bookId){
        // list.stream().map(b->{
        //     if(b.getId()==bookId){
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());

        book.setId(bookId);
        bookRepository.save(book);
    }
}
