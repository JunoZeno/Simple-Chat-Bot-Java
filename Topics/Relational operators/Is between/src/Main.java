import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean comparison = ((num1 >= num2) && (num1 <= num3)) 
                || ((num1 >= num3) && (num1 <= num2));
        System.out.println(comparison);
    }
}