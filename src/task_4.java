import java.util.Scanner;

class MyClass {

    public static int TextSearch (String text, String search) {
        text = text.toLowerCase();
        search =search.toLowerCase();
        int i = text.indexOf(search);
        int count = 0;
        while (i >= 0) {
            count++;
            i = text.indexOf(search, i + 1);

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = sc.nextLine();
        System.out.println("Введите искомое слово: ");
        String search = sc.nextLine();
        System.out.println("В тексте искомое слово употребляется "+ TextSearch(text, search)+ " раз(а)");

    }
}