package com.campusdual.subclasses;

public class Library {
    static void main() {
        Item item = new Item("New Item 1", "2010-01-02");
        Book book = new Book("The Martian Chronicles", "Ray Bradbury", "9788445076538", "195-05-04");
        Magazine magazine = new Magazine("Historia National Geographic", "2024-05", 245, "Josep María Casals");
        DVD dvd = new DVD("Inception", "2010-07-16", "Christopher Nolan", 148);

        System.out.println(item.getDetails());

        book.showDetails();
        book.checkOut();
        book.returnItem();

        System.out.println(magazine.getDetails());
        magazine.checkOut();
        magazine.returnItem();

        dvd.showDetails();
        dvd.checkOut();
        dvd.play();
        dvd.returnItem();
        dvd.showDetails();


    }
}
