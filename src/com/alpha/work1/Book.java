package com.alpha.work1;

class Book {

    private int ID = 1234;
    private String name = "Java for 21 days";
    private String author = "A.Gretsev";
    private String publisher = "alfa";
    private int year = 2020;
    private int pages = 10000;
    private double cost = 99.99;

    public int getID(){
        return  ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return  author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getPublisher(){
        return  publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public int getYear(){
        return  year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public int getPages(){
        return  pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }

    public double getPCost(){
        return  cost;
    }
    public void setPCost(double cost){
        this.cost = cost;
    }

}
