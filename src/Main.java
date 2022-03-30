import java.util.Scanner;

public class Main {
    public static class Euclidean {
        public static int findGCD(int a, int b) {
            //if(a == 0 || b == 0) {
            //    return 1;
            //}
             while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the A value:");
            int a = scanner.nextInt();
            System.out.println("");

            System.out.print("Please enter the B value:");
            int b = scanner.nextInt();
            System.out.println();

            scanner.close();
            int result = findGCD(a, b);

            System.out.println("GCD(" + a + " , " + b + ") = " + result);
        }

    }
}
