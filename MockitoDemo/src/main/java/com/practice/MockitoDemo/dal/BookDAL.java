package com.practice.MockitoDemo.dal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.practice.MockitoDemo.model.Book;

/**
* API layer for persisting and retrieving the Book objects.
*/
public class BookDAL {

  private static BookDAL bookDAL = new BookDAL();

  public List<Book> getAllBooks(){
      return Collections.EMPTY_LIST;
  }

  public Book getBook(String isbn){
      return null;
  }

  public String addBook(Book book){
      return book.getIsbn();
  }

  public String updateBook(Book book){
      return book.getIsbn();
  }

  public static BookDAL getInstance(){
      return bookDAL;
  }
}