package ru.geekBrains;

public class Person {

    private final String surname;
    private String phoneNumber;
    private String email;

    public String getinfo() {
        return phoneNumber + " " + email;
    }

    public Person(String surname, String phoneNumber, String email) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }
}
