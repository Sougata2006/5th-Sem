import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] tokens = input.split(",");

        int[] values = new int[tokens.length];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        System.out.println("Parsed values:");

        for (int i = 0; i < tokens.length; i++) {
            values[i] = Integer.parseInt(tokens[i].trim());

            boolean even = values[i] % 2 == 0;

            System.out.println(values[i] + " -> even? " + even);

            sum += values[i];

            if (values[i] > max) {
                max = values[i];
            }
        }

        Integer boxedSum = sum;
        int unboxedSum = boxedSum;

        Double average = (double) unboxedSum / values.length;

        System.out.println("Sum: " + unboxedSum);
        System.out.println("Max: " + max);
        System.out.println("Max in Binary: " + Integer.toBinaryString(max));
        System.out.println("Max in Hex: " + Integer.toHexString(max));
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Character.isLetter('A'): " + Character.isLetter('A'));
        System.out.printf("Average: %.2f%n", average);
    }
}
