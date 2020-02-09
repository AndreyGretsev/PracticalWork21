package com.alpha.work1;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double cost;

    public Book(String name, String author, String publisher) {
        this(name,author,publisher, 1501,0,20.2);
       /*
       this.name = name;
       this.author = author;
       this.publisher = publisher;
        */
    }

    public Book(String name, String author, String publisher, int year, int pages, double cost) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.cost = cost;
    }

    public Book() {
        this("Cats","Horov","PP", 2000,326,12.4);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public double getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void viewbook(){
        System.out.println("Name " + name + ", author " + author + ", publisher " + publisher + ", year " + year + ", pages " + pages + ", cost " + cost);
    }
}
