public class Book {
    private int releaseYear;
    private String title;
    private Author author;

    public Book(Author author, String title, int releaseYear){
        this.releaseYear = releaseYear;
        this.author = author;
        this.title = title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getAuthorFirstName(){
        return this.author.getFirstName();
    }

    public String getAuthorLastName(){
        return this.author.getLastName();
    }

    public String getTitle() {
        return this.title;
    }
}
