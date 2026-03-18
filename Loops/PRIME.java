import java.util.Scanner;

class PRIME {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter how many prime numbers you want:");
        int n = scn.nextInt();
        int count = 0;

        for (int i = 2; true; i++) {
            boolean flag = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i);
                count++;
                if (count == n) { 
                    break;
                }
            }
        }
    }
}

