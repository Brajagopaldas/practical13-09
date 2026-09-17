class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 0) {
                break; 
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop terminated.");
    }
}
