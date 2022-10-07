package se.yrgo.oop.json;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Person jim = new Person("450812-1234", "Jim Smith-Bobby", "Storgatan 2");

        Gson gson = new Gson();

        String json = gson.toJson(jim);

        System.out.println(json);
    }
}