import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Katas {

    public static int[] pipeFix(int[] numbers) {
//        int from = numbers[0];
//        int to = numbers[numbers.length - 1];
//        int[] result = new int[to - from + 1];
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = from;
//            from++;
//        }
//        return result;
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();

    }
}