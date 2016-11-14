package com.test.socket.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.socket.dao.BookDao;
import com.test.socket.modle.Book;
@Service
public class BookService {
	@Autowired
	private BookDao bookDao;  
	  
    public BookDao getBookDao() {  
        return bookDao;  
    }  
  
    @Resource  
    public void setBookDao(BookDao bookDao) {  
        this.bookDao = bookDao;  
    }  
      
    public void add(Book book){  
        bookDao.add(book);  
    }  
    public void update(Book book){  
        bookDao.update(book);  
    }  
}
