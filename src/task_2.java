package task_2;

import java.util.Scanner;

class MainClass {

    public static void main (String[]  args) {
        System.out.println("Введите два числа:");
     Medod medod = new Medod();
     medod.NokNod();
     medod.Сonclusion();
}

public static class Medod {

    Scanner sc = new Scanner(System.in);

    private int n = 2, nod, nok;
     int P = 1 ;
    public void NokNod() {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            if (sc.hasNextInt()){ // Проверяю корректность ввода
            a[i] = sc.nextInt();
            }else {
                System.out.println("Извините, но это явно не число.");
            }
        }


        for (int i = 0; i < a.length; i++) { //Нахождение НОД
            if (i + 1 < a.length) {
                for (int j = i + 1; j <= i + 1; j++) {
                    nod = gcd(a[i], a[j]);
                    P = a[i] * a[j];
                    nok = P / nod;
                }
                a[i + 1] = nod;
                a[i + 1] = nok;
            }
        }


    }
    public void Сonclusion() {
        System.out.println("НОД " + n + "ух чисел равен = " + nod);
        System.out.println("НОК " + n + "ух чисел равен = " + nok);
    }

    static int gcd(int a, int b) { //метод вычисляющий НОД
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
}