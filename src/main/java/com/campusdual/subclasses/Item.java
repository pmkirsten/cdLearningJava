package com.campusdual.subclasses;

public class Item {
    private String title;
    private String publicationDate;
    private boolean isCheckedOut = false;

    public Item(String title, String publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getDetails(){
        return "Title: " + this.getTitle() + ", Publication date: " + this.getPublicationDate() + ", Checked out: " + isCheckedOut();
    }

    public void showDetails(){
        System.out.println(this.getDetails());
    }

    public void checkOut(){
        if (!isCheckedOut()){
            this.setCheckedOut(true);
            System.out.println(this.getTitle() +  " has been checked out.");
        } else {
            System.out.println(this.getTitle() + " is already checked out.");
        }
    }

    public void returnItem(){
        if (isCheckedOut()){
            this.setCheckedOut(false);
            System.out.println(this.getTitle() +  " has been returned.");
        } else {
            System.out.println(this.getTitle() + " was not checked out.");
        }
    }
}
