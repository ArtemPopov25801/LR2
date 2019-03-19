package arr;

public class ArraySorter {

    public static double[] parse(String[] array) {
        double[] result = new double[array.length];
        for (int a = 0; a < result.length; a++) {
            result[a] = Double.parseDouble(array[a]);
        }
        return result;
    }

    public static double[] sortSelect(double[] array) {
        double[] result = array.clone();
        for (int i = 0; i < result.length; i++) {
            int j = minIndex(result, i);
            swap(result, i, j);
        }
        return result;
    }

    private static void swap(double[] array, int i, int j) {
        double x = array[i];
        array[i] = array[j];
        array[j] = x;

    }

    private static int minIndex(double[] array, int startIdx) {
        int minIdx = startIdx;
        for (int a = startIdx; a < array.length; a++) {
            if (array[a] < array[minIdx]) {
                minIdx = a;
            }
        }
        return minIdx;
    }
}












