package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring container from applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bookService bean
        BookService service = (BookService) context.getBean("bookService");

        // Call the method to verify DI
        service.listBooks();
    }
}
