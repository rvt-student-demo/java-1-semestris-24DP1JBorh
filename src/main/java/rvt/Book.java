package rvt;

class Book {
    String title;
    int pages;
    int publication_year;
    
    public Book(String title, int pages, int publication_year) {
        this.title = title;
        this.pages = pages;
        this.publication_year = publication_year;
    }

    public String toString() {
        return title + ", " + pages + " pages, " + publication_year;
    }
}
