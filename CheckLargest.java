class CheckLargest {
    public static void main (String[] args){
        int a = 25, b = 78, c = 42;
        int largest;

        if (a >= b) {
            if (a >= c) {
                largest =  a;
            } else {
                largest = c;
            }
        } else {
            if (b >= c) {
                largest = b;
            } else {
                largest = c;
            }
        }
        System.out.println("The Largest Number is  =  " + largest);
    }
}
