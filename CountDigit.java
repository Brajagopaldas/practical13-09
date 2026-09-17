import java.util.Scanner;

class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int t = num;

        if (t == 0) {
            count = 1;
        } else {
            while (t != 0) {
                t = t / 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + num + " = " + count);
    }
}
