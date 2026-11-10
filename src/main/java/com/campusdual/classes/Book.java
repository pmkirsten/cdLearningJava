package com.campusdual.classes;

import com.campusdual.Utils;

public class Book {

    public String title;
    public String author;
    public int pageNumber;

    public Book() {
        this.title = Utils.string("Write the book title: ");
        this.author = Utils.string("Write the book author: ");
        this.pageNumber = Utils.integer("Write the number of pages: ");
    }

    public Book(String title, String author, int pageNumber) {
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
    }

    public void showBookDetails(){
        System.out.println(this.title + " - " + this.author + " (" + this.pageNumber + " pages)");
    }

    static void main() {
        Book b1 = new Book("Rhythm of War","Brandon Sanderson", 1902);
        Book b2 = new Book("The Magician's Apprentice","Trudi Canavan", 781);
        Book b3 = new Book("1984","George Orwell", 586);
        Book b4 = new Book("El paciente","Juan Gómez-Jurado", 417);
        Book b5 = new Book();

        b1.showBookDetails();
        b2.showBookDetails();
        b3.showBookDetails();
        b4.showBookDetails();
        b5.showBookDetails();
    }
}
