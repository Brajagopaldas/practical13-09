import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for(int i=1; i <= n; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of even Nummber = " + sum);
    }
}
