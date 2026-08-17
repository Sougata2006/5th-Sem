import java.util.Scanner;

class Player {
    int playerId;
    String name;
    int runs1, runs2, runs3;

    // Parameterized constructor
    Player(int playerId, String name, int runs1, int runs2, int runs3) {
        this.playerId = playerId;
        this.name = name;
        this.runs1 = runs1;
        this.runs2 = runs2;
        this.runs3 = runs3;
    }

    // Calculate total runs
    int totalRuns() {
        return runs1 + runs2 + runs3;
    }

    // Calculate percentage
    double percentage() {
        return totalRuns() / 3.0;
    }

    // Method overloading: no argument
    String currentForm() {
        double p = percentage();

        if (p >= 75)
            return "Red-Hot Form";
        else if (p >= 60)
            return "Good Form";
        else if (p >= 40)
            return "Average Form";
        else
            return "Out of Form";
    }

    // Method overloading: one argument
    String currentForm(int extraRuns) {
        double p = (totalRuns() + extraRuns) / 3.0;

        if (p >= 75)
            return "Red-Hot Form";
        else if (p >= 60)
            return "Good Form";
        else if (p >= 40)
            return "Average Form";
        else
            return "Out of Form";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playerId = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        int runs1 = sc.nextInt();
        int runs2 = sc.nextInt();
        int runs3 = sc.nextInt();

        int extraRuns = sc.nextInt();

        Player p = new Player(playerId, name, runs1, runs2, runs3);

        System.out.println("Player ID: " + p.playerId);
        System.out.println("Name: " + p.name);
        System.out.println("Runs: " + p.runs1 + ", " + p.runs2 + ", " + p.runs3);
        System.out.println("Total: " + p.totalRuns());
        System.out.printf("Percentage: %.2f%%%n", p.percentage());
        System.out.println("currentForm(): " + p.currentForm());
        System.out.println("currentForm(" + extraRuns + "): " + p.currentForm(extraRuns));

        sc.close();
    }
}
