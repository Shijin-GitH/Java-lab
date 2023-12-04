class OddNumbers implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd number: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenNumbers implements Runnable {
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even number: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class OddEvenThreads {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddNumbers());
        Thread evenThread = new Thread(new EvenNumbers());

        oddThread.start();
        evenThread.start();
    }
}