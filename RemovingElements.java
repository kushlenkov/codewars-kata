public class RemovingElements {

    public static Object[] removeEveryOther(Object[] arr) {
        Object[] output = new Object[(arr.length + 1) / 2];

        for (int i = 0; i < output.length; i++) {
            output[i] = arr[i * 2];
        }

        return output;
    }
}