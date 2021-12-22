import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<Integer> makeList(int n) {
        return IntStream.range(1, n + 1).boxed().collect(Collectors.toList());
    }

    public static List<String> fizzBuzzIt(List<Integer> intArr) {
        return intArr.stream().map(x -> {
            if (x % 15 == 0) {
                return "Fizz Buzz";
            } else if (x % 3 == 0) {
                return "Fizz";
            } else if (x % 5 == 0) {
                return "Buzz";
            }
            return x.toString();
        }).collect(Collectors.toList());
    }
}
