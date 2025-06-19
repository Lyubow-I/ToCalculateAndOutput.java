public class ToCalculateAndOutput {
    public static void main(String[] args) {
        // Задание 1
        // Task 1
        int b = 5;
        int c = 3;
        int a = 4 * (b + c - 1)/ 2;
        System.out.println(a);

        /* Task 2
        int n = 26;
        int firstDigit = n / 10;
        int secondDigit = n % 10;
        int sum = firstDigit + secondDigit;
        System.out.println(sum + "(" + firstDigit + "+" + secondDigit +")");

         */

        // Task 3
        /*
        int n = 126;
        int firstDigit = n / 100;
        int secondDigit = (n % 100) / 10;
        int thirdDigit = n % 10;
        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.println(sum + " (" + firstDigit + "+" + secondDigit + "+" + thirdDigit + ")");

         */

        // Task 4
        double n = 123.34;
        int i = (int) n;
        System.out.println(i);

        // Task 5
        int q = 21;
        int w = 8;
        int result = q / w;
        int remainder = q % w;//21 / 8 = 2 и 5 в остатке.
        System.out.println(q + "/" + w + "=" + result + " и " + remainder + " в остатке");

    }
}
