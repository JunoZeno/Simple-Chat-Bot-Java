import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int area = n * m;

        if (k > (area)){
            System.out.println("NO");
        } else if (k % 2 == 0 && area % 2 == 0) {
            System.out.println("YES");
        } else if (k % n == 0 || k % m == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}