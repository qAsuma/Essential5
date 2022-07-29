import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
//Создать класс Main. Создать список целых чисел, заполнить его десятью случайными значениями в диапазоне от 10 до 20-ти(включительно).
// Вывести индекс самого большого и самого маленького числа в списке. Используя ListIterator пройтись по списку и увеличить значения на 1, вывести список в консоль.

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(13);
        numbers.add(15);
        numbers.add(17);
        numbers.add(19);
        numbers.add(20);
        numbers.add(12);
        numbers.add(14);
        numbers.add(16);
        numbers.add(18);
        for (int a : numbers) {
            System.out.println(a);
        }
        System.out.println("============================");
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        System.out.println("=========================");

        ListIterator<Integer> listIterator = numbers.listIterator();


        while (listIterator.hasNext()) {
            listIterator.set(listIterator.next() + 1);
        }
            System.out.println(numbers);




        }


    }






