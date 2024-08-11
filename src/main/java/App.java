import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Simple loop methods
        App.testLoopsMethods();
        // sorting array numbers
        App.sortArray();
    }

    public static void testLoopsMethods() {
        // create String[] names parameter and fill it with 5 random names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        // Using a for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // Using a for-each loop
        for (String name : names) {
            System.out.println(name);
        }
    }


    public static void sortArray () {
        // create a int[] array list filled with 30 random numbers
        int[] numbers = {1, 5, 3, 2, 4, 6, 8, 7, 9, 10, 12, 11, 13, 15, 14, 16, 18, 17, 19, 20, 22, 21, 23, 25, 24, 26, 28, 27, 29, 30};
        // sort the array
        Arrays.sort(numbers);
        // print the sorted array
        System.out.println(Arrays.toString(numbers));
    }

}