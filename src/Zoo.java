import java.util.ArrayList;
import java.util.List;
//Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
//element).
//Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        animal.add("Bear");
        animal.add("Tiger");
        animal.add("Elephant");
        animal.add("Panda");
        animal.add("Jaguar");
        animal.add("Giraffe");
        animal.add("Dog");
        animal.add("Cat");
        for (String str : animal) {
            System.out.println( str + " ");

        }
        System.out.println("=======================");

        animal.remove("Elephant");
        animal.remove("Jaguar");
        animal.remove("Dog");
        for (String str : animal) {
            System.out.println(str + " ");







        }
        System.out.println("=====================");
        System.out.println(animal.size());

    }
}


