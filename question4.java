package rakesh;
import java.util.stream.IntStream;

public class question4 {
    public static void main(String[] args) {
        IntStream.iterate(0, i->i<10, i->i+1).forEach(System.out::println);
    }
}