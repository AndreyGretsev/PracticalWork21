package com.alpha.work1;

public class Main {
    public static void main(String[] args) {
       /*
       Book book = new Book();
       book.viewbook();
       book.setAuthor("McDuck");
       book.viewbook();
       Book book1 = new Book("Java","AGretsev","Alfa");
       book1.viewbook();
       Book book2 = new Book();
       book2.viewbook();
       */
       /*
       Book[] books = {
               new Book(),
               new Book("Dogs","Ivanov","EE"),
               new Book("Cats","Horov","ZZ",2010,1990,2123.12),
               new Book("Vamps","Tatatrenko","CC",2019,120,20.12),
               new Book("Pigs","Ruzinov","AP",2009,450,223.12),
               new Book("Birds","Gromov","PA",2000,80,12.12),
               new Book("Dick","John","WWW",2002,123,3445.12),
               new Book("Duck","McDuck","RAE",2011,4352,56.12)
       };
       */

        Book[] books = createBooks();
        printBooks(books);
        System.out.println("===================================================================================");
        updateBooks(books,10);
        printBooks(books);

    }

    public static Book[] createBooks() {
        return new Book[]{
                new Book(),
                new Book("Dogs", "Ivanov", "EE"),
                new Book("Cats", "Horov", "ZZ", 2010, 1990, 2123.12),
                new Book("Vamps", "Tatatrenko", "CC", 2019, 120, 20.12),
                new Book("Pigs", "Ruzinov", "AP", 2009, 450, 223.12),
                new Book("Birds", "Gromov", "PA", 2000, 80, 12.12),
                new Book("Dick", "John", "WWW", 2002, 123, 3445.12),
                new Book("Duck", "McDuck", "RAE", 2011, 4352, 56.12)
        };
    }

    public  static void printBooks(Book[] books){
        for(Book elem : books){
            elem.viewbook();
        }
    }

    public static void updateBooks(Book[] books, int percent){
        for (Book elem : books) {
            double cost = elem.getCost();
            cost += cost * (percent / 100.0);
            elem.setCost(cost);

        }
    }
}

