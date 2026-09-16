import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int org = scanner.nextInt();
        
        int num = org; 
        int reversedNumber = 0;
        
        
        while (num != 0) {
            int lastDigit = num % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            num = num / 10; 
        }
        
        if (org == reversedNumber) {
            System.out.println(org + " is a palindrome number.");
        } else {
            System.out.println(org + " is not a palindrome number.");
        }
    }
}
