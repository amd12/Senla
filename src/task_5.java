
import java.util.Scanner;

 class MainClass {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите от 0 до 100: ");
         int i;
            int n = in.nextInt();
            if (!(n < MIN_VALUE || n > MAX_VALUE)) {
                for ( i = MIN_VALUE; i < n + 1; i++) {
                    if (Test.Palindrome(i)) System.out.println(i);
                }
                System.out.println("\nПалиндром: "+i);
            } else System.out.println("Возможный диапазано только от 0 до 100");

    }
}

class Test {
    static boolean Palindrome(int i) {
        int next = 0;
        int temp = i;

        while (temp != 0) {
            next = (next * 10) + (temp % 10);
            temp /= 10;
        }
        return i == next;
    }
}