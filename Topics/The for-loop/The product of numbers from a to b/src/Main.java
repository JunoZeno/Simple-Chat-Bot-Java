import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int total = 1;

        for (int i = num1; i < num2;  i++){
            total *= i;
        }

        System.out.println(total);

    }
}