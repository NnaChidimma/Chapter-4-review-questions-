import java.util.Arrays;

public class BigONotationSort {
    public static void main(String[] args) {
        // Big O values
        double[] values = {10, Math.log10(10), Math.pow(10, 2), factorial(10)};

        // Sort the array
        Arrays.sort(values);

        // Print the sorted values
        System.out.println("Big O values in ascending order:");
        for (double value : values) {
            System.out.printf("%.0f ", value); // Print as integers
        }
    }

    // Method to calculate factorial
    public static double factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}

