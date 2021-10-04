package solid.book;
import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        ScreenPrint book = new ScreenPrint("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}
