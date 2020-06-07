package rozwiazaniazadan.libraryapp;

import java.util.Arrays;

public class LibraryApp {
    public static void main(String[] args){
        Book book1 = new Book("Niezwycięzony", "Stanisław Lem");
        Book book2 = new Book("Wojna i pokój", "Lew Tołstoj");
        Book book3 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz");
        Book book4 = new Book("Władca Pierścieni: Drużyna Pierścienia","J.R.R Tolkien");
        Book book5 = new Book("Władca Pierścieni: Dwie wieże","J.R.R Tolkien");
        Book book6 = new Book("Władca Pierścieni: Powrót Króla","J.R.R Tolkien");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.printBooks();
        System.out.println(Arrays.toString(library.searchBooks("Władca")));
    }
}