package com.Library.Service;
import com.Library.Repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook() {
        System.out.println("BookService is working...");
        bookRepository.saveBook();
    }
}
