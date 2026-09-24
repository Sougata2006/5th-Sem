import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] marks = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                marks[i][j] = sc.nextInt();
            }
        }



        for (int i = 0; i < rows; i++) {
            int total = 0;

            for (int j = 0; j < cols; j++) {
                total += marks[i][j];
            }

            System.out.println("Student " + (i + 1) + " Total: " + total);
        }

        for (int j = 0; j < cols; j++) {
            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += marks[i][j];
            }

            double average = (double) sum / rows;

            System.out.printf("Subject %d Average: %.2f%n", j + 1, average);
        }

        sc.close();
    }
}
