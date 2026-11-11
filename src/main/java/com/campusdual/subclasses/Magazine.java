package com.campusdual.subclasses;

public class Magazine extends Item{
    private int issueNumber;
    private String director;

    public Magazine(String title, String publicationDate, int issueNumber, String director) {
        super(title, publicationDate);
        this.issueNumber = issueNumber;
        this.director = director;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
