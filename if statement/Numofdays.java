import java.util.Scanner;

class Numofdays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter month number:");
        int m = scn.nextInt();

        System.out.println("Enter year:");
        int n = scn.nextInt();

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            case 2:
                if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
                    System.out.println("29 days (Leap Year)");
                } else {
                    System.out.println("28 days");
                }
                break;

            default:
                System.out.println("Invalid month number");
        }
    }
}
