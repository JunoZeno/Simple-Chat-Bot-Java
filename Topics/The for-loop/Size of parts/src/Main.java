import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt();
        int largerCount = 0;
        int smallerCount = 0;
        int perfectCount = 0;

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();

            switch (size) {
                case 1 -> largerCount += 1;
                case -1 -> smallerCount += 1;
                default -> perfectCount += 1;
            }
        }

        System.out.println(perfectCount + " " + largerCount
                + " " + smallerCount);
    }
}