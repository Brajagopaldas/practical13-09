class CheckSmallest {
    public static void main (String[] args){
        int a = 25, b = 78, c = 42;
        int smallest;

        if (a <= b) {
            if (a <= c) {
                smallest =  a;
            } else {
                smallest = c;
            }
        } else {
            if (b <= c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }
        System.out.println("The Smallest Number is  =  " + smallest);
    }
}
