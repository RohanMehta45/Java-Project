import java.util.Scanner;

public class SingleDigitSum {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        if (r == 0) {
            System.out.println("0");
        } else {
            int res = sumOfDigits(n) * r;
            while (res >= 10) {
                res = sumOfDigits(res);
            }
            System.out.println(res);
        }
    }
}
