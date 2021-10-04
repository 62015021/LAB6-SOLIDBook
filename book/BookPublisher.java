package solid.book;
import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        FilePrint book = new FilePrint("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}
