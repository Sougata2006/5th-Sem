import java.util.Scanner;

class SumThread extends Thread {
    private int start;
    private int end;
    private long sum;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int mid = n / 2;

        SumThread threadA = new SumThread(1, mid);
        SumThread threadB = new SumThread(mid + 1, n);

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        long total = threadA.getSum() + threadB.getSum();

        System.out.println("Thread-A sum (1 to " + mid + "): " + threadA.getSum());
        System.out.println("Thread-B sum (" + (mid + 1) + " to " + n + "): " + threadB.getSum());
        System.out.println("Total sum (1 to " + n + "): " + total);
    }
}
