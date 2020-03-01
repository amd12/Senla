package task_3;

import java.util.Scanner;

class MyClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();


        //Начальное количество слов равно 0
       int count = 0;
        //Если ввели хотя бы одно слово, тогда считать, или конец программы
        if(input.length() != 0){    //подсчитывать количество слов в предложении
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }
        System.out.println("1.Количество слов в предложении: "+count);


            String str = input;
            String reverse = new StringBuffer(str).reverse().toString(); //выводить их в отсортированном виде
            System.out.println("2.Сортировка в обратном порядке: " + reverse);


        String s1 = input, s2 = "";
        s2 = s2 + s1.substring(0, 1).toUpperCase(); //делать первую букву каждого слова заглавной.
        for (int i = 1; i < s1.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(s1.substring(i-1, i)))
                s2 = s2 + s1.substring(i, i+1).toUpperCase();
            else
                s2 = s2 + s1.substring(i, i+1);

        }
        System.out.println("3.Первая буква заглавная: "+s2);
    }
}




