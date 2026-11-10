package com.campusdual.classes.anotherPackage;

import com.campusdual.classes.Book;

public class AnotherClass {

    static void main() {
        Book b1 = new Book("Rhythm of War","Brandon Sanderson", 1902);
        Book b2 = new Book("The Magician's Apprentice","Trudi Canavan", 781);
        b1.showBookDetails();
        b2.showBookDetails();
        System.out.println(b1.title);
    }
}
