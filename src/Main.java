import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];

        ArrayList<Integer> integers = new ArrayList<>();
        LinkedList<Integer> integers1 = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
            integers.add(random.nextInt(0, 2));
            integers1.add(random.nextInt(0, 2));


        }
        System.out.print("Array:      [");
        for (int k : array) {
            System.out.print(k + ", ");
        }
        System.out.print("]");
        System.out.println("\nArrayList:  " + integers);
        System.out.println("LinkedList: " + integers1);

        Collections.sort(integers);
        Collections.sort(integers1);
        System.out.println("\nArrayList:  " + integers);
        System.out.println("LinkedList: " + integers1);
        int counter = 0;
        do {

            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    counter++;
                }
            }
        } while (counter > 0);

        System.out.print("Array:      [");
        for (int k : array) {
            System.out.print(k + ", ");
        }
    }
}