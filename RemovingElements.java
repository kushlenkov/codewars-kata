
import java.util.stream.IntStream;

public class RemovingElements {
    public static void main(String[] args) {

    }

    public static Object[] removeEveryOther(Object[] arr) {
        Object[] output = new Object[(arr.length + 1) / 2];

        for (int i = 0; i < output.length; i++) {
            output[i] = arr[i * 2];
        }

        return output;
    }
}

class Kata {
    public static Object[] removeEveryOther(Object[] arr) {
        return IntStream.range(0, arr.length).filter(n -> n % 2 == 0).mapToObj(i->arr[i]).toArray();
    }
}