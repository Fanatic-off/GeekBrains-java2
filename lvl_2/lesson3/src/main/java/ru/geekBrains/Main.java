package ru.geekBrains;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        //создаём массив случайных повторяющихся слов
        ArrayList<String> avto = new ArrayList<>(Arrays.asList(
                "BMV", "Mersedes", "Vokswagen", "Audi",
                "Toyota", "Opel", "Range Rover", "Subaru",
                "BMV", "Toyota", "Vokswagen", "Subaru", "Subaru",
                "Toyota", "BMV", "BMV", "Toyota", "Toyota", "Toyota"
        ));

        //преобразуем массив в HashSet для определения уникальных слов
        HashSet<String> avtoHash = new HashSet<>(avto);

        //находим список слов из которых состоит массив
        System.out.println(avtoHash.toString());

        //тест
        int quantity = Collections.frequency(avto, "BMV");
        System.out.println(quantity);

        //пробегаем по массиву, чтобы посчитать сколько раз встречается слово
        for (String key : avtoHash) {//по массиву avto отображается очень много раз. Уточнить!!!
            System.out.println(key + "- " + Collections.frequency(avto, key));
        }

        System.out.println(avto.size());
        System.out.println("============================");

        PhoneBook.bookHashMap();

        searchBySurname("Smith");
    }

    public static void searchBySurname(String surname) {

        if (surname.equals(Person.getSurname())) {
            System.out.println("This surname has this phone number and email:" + Person.getinfo);
        } else {
            System.out.println("Sorry, our phone book doesn't have records about this surname ");
        }
    }
}
