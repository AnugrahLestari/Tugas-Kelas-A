import java.util.Scanner;
class TugasPP2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1 ; i <= n ; i++) {
            if (n %i==0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);

        sc.close();
    }
}