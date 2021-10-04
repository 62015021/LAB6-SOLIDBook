package solid.book;
import java.util.List;
public class ScreenPrint extends Book{
    
    public ScreenPrint(String title, List<String> pages) {
        super(title, pages);
    }
    
    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
