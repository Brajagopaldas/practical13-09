class Attendance {
    public static void main(String[] args) {
        int marks = 84;
        int attendance = 75;

        if (attendance >= 75) {
            if (marks >= 40) {
                System.out.println("Status : Eligible for  Examination");
            } else {
                System.out.println("Status :  Not Eligible for  Examination");
            }
        } else {
            System.out.println("Status :  Not Eligible for below 75 % Attendance");
            }
        }
    }
