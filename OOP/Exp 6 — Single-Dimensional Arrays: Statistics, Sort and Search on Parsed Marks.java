import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] tokens = input.split(",");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i].trim());
        }

        int target = Integer.parseInt(sc.nextLine().trim());

        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for (int value : arr) {
            if (value > max) {
                max = value;
            }

            if (value < min) {
                min = value;
            }

            sum += value;
        }

        double average = (double) sum / arr.length;

        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Sorted: " + Arrays.toString(sorted));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.printf("Average: %.2f%n", average);

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found");
        }
    }
}
