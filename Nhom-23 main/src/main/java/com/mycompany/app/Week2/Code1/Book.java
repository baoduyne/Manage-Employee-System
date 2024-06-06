package com.mycompany.app.week2.code1;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getYearPublished() {
        return yearPublished;
    }
    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
   
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
   
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe", 2020);
        System.out.println(book1);
        
        book1.setTitle("Java Programming: Advanced Topics");
        book1.setYearPublished(2021);
        System.out.println(book1);
    }
}
    
