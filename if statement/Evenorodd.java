import java.util.Scanner;  

class Evenorodd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter a number:");
        int n = scn.nextInt();

        if (n % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }
    }
}
