import java.util.Scanner;

class StopNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Negative number detected. Loop terminated.");
                break;
            }

            System.out.println("You entered: " + num);
        }

        sc.close();
    }
}

