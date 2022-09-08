public class Book {
    private String author;
    private String title;
    private int pages;


    public Book() {
    }

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "{" +
            " author='" + getAuthor() + "'" +
            ", title='" + getTitle() + "'" +
            ", pages='" + getPages() + "'" +
            "}";
    }
    // @Override
    // public int compareTo(Book o) {
    //     //return Integer.compare(this.pages, o.getPages());
    //     if(this.pages > o.getPages()) return 1; //-1 for reverse order
    //     if(this.pages == o.getPages()) return 0;
    //     else return -1; //+1 for reverse order 
    //     //for reverse order switch signs of the 1s (both of them)
    //     }


}
