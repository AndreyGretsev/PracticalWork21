package com.alpha.work1;

public class Runner {
    public static void run(){
        System.out.println("I'm Running");
        Book book = new Book();
        System.out.println(book);
    }

    public static void view (){
        Book book = new Book();
        System.out.println(book.getID() + " " + book.getName()  + " " +  book.getAuthor()  + " " +  book.getPublisher()  + " " +  book.getYear()  + " " +  book.getPages());

    }
}
