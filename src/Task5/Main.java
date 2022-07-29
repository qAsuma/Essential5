package Task5;
//Используя Intelij IDEA создать проект, пакет.
// Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со школы.
// И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("teacher1");
        arrayList.add("teacher2");
        arrayList.add("teacher3");
        arrayList.add("teacher4");
        arrayList.add("teacher5");
        arrayList.add("teacher6");


        System.out.println("Лучший учитель " + arrayList.indexOf("teacher3"));
        System.out.println("Худший учитель " + arrayList.indexOf("teacher5"));
    }




}
