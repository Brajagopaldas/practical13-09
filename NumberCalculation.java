class NumberCalculation {
public static void main(String[] args) {
        
        int number = 9;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        } 

        int square = number * number;
        int cube = number * number * number;
        System.out.println("Square of " + number + " is: " + square); 
        System.out.println("Cube of " + number + " is: " + cube);
    }
}
