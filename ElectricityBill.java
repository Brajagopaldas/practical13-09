class ElectricityBill {

    public static void main(String[] args) {

        int units = 189;
        double bill;

        if (units <= 100) {
            bill = units * 2;
        }
        else if (units <= 200) {
            bill = units * 3;
        }
        else if (units <= 300) {
            bill = units * 5;
        }
        else {
            bill = units * 7;
        }

        System.out.println("Units: " + units);
        System.out.println("Electricity Bill: ₹" + bill);
    }
}
