import java.util.Scanner;

/**
 * RecursiveProduct.java
 *
 * Prompts the user to enter five numbers, stores them in an array,
 * and computes their product using a recursive method.
 *
 * Base case:      when the index reaches the end of the array, return 1.
 * Recursive case: nums[index] * product(nums, index + 1)
 *
 * @author Connor (Lightbearer77)
 * Course: CSC372 - Module 5 Critical Thinking
 */
public class RecursiveProduct {

    // The assignment specifies exactly five numbers.
    private static final int COUNT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[COUNT];

        System.out.println("===== Recursive Product Calculator =====");
        System.out.println("Please enter " + COUNT + " numbers:");

        // Read the five user-supplied numbers.
        for (int i = 0; i < COUNT; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Compute the product recursively, starting at index 0.
        double result = product(numbers, 0);

        System.out.println("----------------------------------------");
        System.out.printf("Product of the %d numbers = %.4f%n", COUNT, result);
        System.out.println("========================================");

        scanner.close();
    }

    /**
     * Recursively computes the product of all elements in the array,
     * starting from the given index.
     *
     * @param nums  the array of numbers
     * @param index the current index in the recursion
     * @return the product of nums[index] through nums[nums.length - 1]
     */
    public static double product(double[] nums, int index) {
        // Base case: no more elements to multiply, return identity (1.0).
        if (index == nums.length) {
            return 1.0;
        }
        // Recursive case: multiply current element by product of the rest.
        return nums[index] * product(nums, index + 1);
    }
}
