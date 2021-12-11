import java.util.ArrayList;
import java.util.List;

public class Library {

    public List<Book> listOfBooks = new ArrayList<>();

    public Library(List<Book> listOfBooks) {
        this.listOfBooks.addAll(listOfBooks);
    }

    public Library(Book book) {
        this.listOfBooks.add(book);
    }

    public List<Book> getListByAuthor(String inputAuthor) {
        List<Book> list = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getAuthor().equals(inputAuthor)) {
                list.add(book);
            }
        }
        return list;
    }

    public List <Book> getListByPublishingHouse(String inputPublishingHouse) {
        List<Book> list = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getPublishingHouse().equals(inputPublishingHouse)) {
                list.add(book);
            }
        }
        return list;
    }

    public List <Book> getListAfterYearPublished (int inputYear) {
        List<Book> list = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getYearOfPublication() >= inputYear) {
                list.add(book);
            }
        }
        return list;
    }
}