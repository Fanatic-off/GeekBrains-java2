package ru.geekBrains;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {

    public static void bookHashMap() {

        Person person1 = new Person("Ivanov", "89991112233", "Iv33@mail.com");
        Person person2 = new Person("Petrov", "89114445577", "Petr77@mail.com");

        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(person1);
        personHashSet.add(person2);

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put(person1.getSurname(), person1.getinfo());
        phoneBook.put(person2.getSurname(), person2.getinfo());

        System.out.println("Phonebook contains :");
        System.out.println(phoneBook);
    }
}


