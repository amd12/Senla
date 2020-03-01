
/*
Можно добавлять и изменять сортируемые объекты в рюкзаке
        путем добавлением или изменение объектов subject .
Изменять вместимость рюкзака в переменной capacityBackpack .
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MyClass {
    public static void main(String[] args) {
        final Subject subject1 = new Subject(4,20);
        final Subject subject2 = new Subject(3,18);
        final Subject subject3 = new Subject(2,14);

        final Subject[] subjects = {subject1,subject2,subject3};

        Arrays.sort(subjects, Comparator.comparingDouble(Subject::worth).reversed() );// сортировка по удельному весу

        System.out.println(Arrays.toString(subjects));

        final int capacityBackpack = 7; // вместимость рюкзака

        int weightSoFar = 0; // текущий вес
        double valueSoFar = 0 ;  //ценность
        int currentSubject = 0;  // индекс текущего предмета

        while (currentSubject < subjects.length && weightSoFar !=capacityBackpack){// пока в рюкзаке есть свободное место
            if (weightSoFar + subjects[currentSubject].getWeight()< capacityBackpack){
                //берем объект целиком
                valueSoFar += subjects[currentSubject].getValue();
                weightSoFar +=subjects[currentSubject].getWeight();
            }else {

                valueSoFar   += ((capacityBackpack - weightSoFar) / (double) subjects[currentSubject].getWeight()) *
                        subjects[currentSubject].getValue();

                weightSoFar = capacityBackpack; //полный рюкзак
            }
            currentSubject++;
        }
        System.out.println("Ценность лучшего набора " + valueSoFar);
    }

}

class Subject {
    private int weight;
    private  int value;

    public Subject(int weight, int value){
        this.weight = weight;
        this.value = value;
    }

    public double worth(){
        return value/(double)weight;
    }

    public int getWeight(){
        return weight;
    }

    public int getValue(){
        return value;
    }

    public String toString() {
        return "{Вес: " + weight + ",Ценность: " + value + "}";
    }
}
