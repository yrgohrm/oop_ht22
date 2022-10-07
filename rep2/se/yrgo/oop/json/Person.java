package se.yrgo.oop.json;

public class Person {
    private String name;
    private String address;
    private String personalNumber;

    public Person(String personalNumber, String name, String address) {
        this.name = name;
        this.address = address;
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }
}
