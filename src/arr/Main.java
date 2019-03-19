package arr;

public class Main {

    public static void main(String args[]) {

        double[] array = ArraySorter.parse(args);

        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n] + " ");
        }

        System.out.println();

        double[] arrrrr = ArraySorter.sortSwap(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(arrrrr[i] + " ");
        }

    }

}



