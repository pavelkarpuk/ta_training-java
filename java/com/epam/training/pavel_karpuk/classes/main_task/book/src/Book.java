public class Book {

    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearOfPublication;
    private int numberOfPages;
    private double price;
    private String typeOfBinding;

    public Book (int id, String title, String author, String publishingHouse, int yearOfPublication,
                 int numberOfPages, double price, String typeOfBinding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public String toString() {
        return "Book: " +
                "id - " + id +
                ", title - " + title +
                ", author - " + author  +
                ", publishingHouse - " + publishingHouse +
                ", yearOfPublication - " + yearOfPublication +
                ", numberOfPages - " + numberOfPages +
                ", price - " + price +
                ", typeOfBinding - " + typeOfBinding;
    }
}