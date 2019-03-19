package arr;

public class Main {

    public static void main(String args[]) {

        double[] array = ArraySorter.parse(args);

        for (double element : array) {
            System.out.print(element + " ");
        }

        System.out.println();

        double[] arrrrr = ArraySorter.sortSelect(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(arrrrr[i] + " ");
        }

    }

}



