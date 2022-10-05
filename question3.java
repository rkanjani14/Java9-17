package rakesh;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class question3 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(0,50)
                .boxed()
                .collect(Collectors.toList()));
    }
}