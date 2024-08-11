import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Simple loop methods
        App.setLoopsMethods();
        // sorting array numbers
        App.sortArray();
        // set the matrix
        App.matrixSetup();
        // find the maximum value in the array
        App.findTheMaximumValue();
    }

    public static void setLoopsMethods() {
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
        // create a int[] array list filled with 30 random numbers between 10 and 1000
        int[] numbers = {1, 5, 3, 2, 4, 6, 8, 7, 9, 10, 12, 11, 13, 15, 14, 16, 18, 17, 19, 20, 22, 21, 23, 25, 24, 26, 28, 27, 29, 30};
        // sort the array
        Arrays.sort(numbers);
        // print the sorted array
        System.out.println(Arrays.toString(numbers));
    }

    public static void matrixSetup () {

        int width = 10;
        int height = 10;

        // create a 2D int array matrix with 3 rows and 3 columns
        int[][] matrix = new int[height][width];
        // fill the matrix with random numbers
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        // print the matrix
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void findTheMaximumValue () {
        // create a int[] array list filled with 30 random numbers
        int[] numbers = {1, 5, 3, 2, 4, 6, 8, 7, 9, 10, 12, 11, 13, 15, 14, 16, 18, 17, 19, 20, 22, 21, 23, 25, 24, 26, 28, 27, 29, 30};
        int maxNumber = numbers[0];
        // find the maximum value in the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        // print the maximum value
        System.out.println("The maximum value is: " + maxNumber);
    }

}