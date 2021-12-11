import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Book> listOfBooks = Arrays.asList(
                new Book(1, "Цифровая крепость", "Дэн Браун", "AST Publishiers", 2015, 537, 34.35, "Твердый переплет"),
                new Book(2, "Ангелы и Демоны", "Дэн Браун", "AST Publishiers", 2015, 639, 34.35, "Твердый переплет"),
                new Book(3, "Точка обмана", "Дэн Браун", "AST Publishiers", 2015, 508, 35.27, "Твердый переплет"),
                new Book(4, "Код да Винчи", "Дэн Браун", "AST Publishiers", 2015, 542, 35.27, "Твердый переплет"),
                new Book(5, "Утраченный символ", "Дэн Браун", "AST Publishiers", 2015, 575, 34.35, "Твердый переплет"),
                new Book(6, "Инферно", "Дэн Браун", "AST Publishiers", 2018, 576, 14.28, "Мягкий переплет"),
                new Book(7, "Танатонавты", "Бернар Вербер", "Эксмо", 2021, 608, 14.64, "Твердый переплет"),
                new Book(8, "Империя ангелов", "Бернар Вербер", "Эксмо", 2021, 416, 20.76, "Твердый переплет"),
                new Book(9, "Муравьи", "Бернар Вербер", "Эксмо", 2021, 352, 14.64, "Твердый переплет"),
                new Book(10, "День муравья", "Бернар Вербер", "Эксмо", 2021, 480, 15.08, "Твердый переплет"),
                new Book(11, "Гарри Поттер и философский камень", "Джоан Роулинг", "Machaon", 2016, 432, 25.45, "Твердый переплет"),
                new Book(12, "Гарри Поттер и тайная комната", "Джоан Роулинг", "Machaon", 2019, 480, 25.45, "Твердый переплет"),
                new Book(13, "Гарри Поттер и узник Азкабана", "Джоан Роулинг", "Machaon", 2016, 528, 25.45, "Твердый переплет"),
                new Book(14, "Гарри Поттер и Кубок огня", "Джоан Роулинг", "Machaon", 2019, 704, 25.71, "Твердый переплет"),
                new Book(15, "Гарри Поттер и Орден Феникса", "Джоан Роулинг", "Machaon", 2016, 892, 29.18, "Твердый переплет"),
                new Book(16, "Гарри Поттер и Принц-полукровка", "Джоан Роулинг", "Machaon", 2016, 672, 25.45, "Твердый переплет"),
                new Book(17, "Гарри Поттер и Дары смерти", "Джоан Роулинг", "Machaon", 2015, 704, 25.45, "Твердый переплет"),
                new Book(18, "Гарри Поттер и Проклятое дитя", "Джоан Роулинг", "Machaon", 2019, 480, 22.12, "Твердый переплет"),
                new Book(19, "Мастер и Маргарита", "Михаил Булгаков", "Азбука", 2012, 480, 10.17, "Твердый переплет"),
                new Book(20, "Преступление и наказание", "Федор Достоевский", "Азбука", 2019, 608, 10.59, "Твердый переплет"));

        Library library = new Library(listOfBooks);

        System.out.println("Enter the full author's name:");
        BufferedReader author = new BufferedReader(new InputStreamReader(System.in));
        String inputAuthor = author.readLine();
        library.getListByAuthor(inputAuthor).forEach(System.out::println);

        System.out.println("Enter the name of the publishing house:");
        BufferedReader publishingHouse = new BufferedReader(new InputStreamReader(System.in));
        String inputPublishingHouse = publishingHouse.readLine();
        library.getListByPublishingHouse(inputPublishingHouse).forEach(System.out::println);

        System.out.println("Enter the year after which the books were released:");
        BufferedReader year = new BufferedReader(new InputStreamReader(System.in));
        int inputYear = Integer.parseInt(year.readLine());
        library.getListAfterYearPublished(inputYear).forEach(System.out::println);
    }
}