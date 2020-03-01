package task_1;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Metod metodin = new Metod();
        metodin.PrimeComposite();
        metodin.EvenOdd();
    }
}


class Metod {

    Scanner sc = new Scanner(System.in);
    private int n = sc.nextInt();


    public   void PrimeComposite() {
        if (n < 2)
            System.out.println( "Введите целые числа кроме 0 и 1");
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print("Число "+ n +" составное");
                return;
            }
        }
                System.out.println("Число" + n + "простое");
    }

    public  void EvenOdd(){
        if (n % 2 == 0) {
            System.out.print(" и четное");
        } else {
            System.out.print(" и не четное\n");
            System.out.println("!Вы ввели не четное целое число!");
        }
    }
}






