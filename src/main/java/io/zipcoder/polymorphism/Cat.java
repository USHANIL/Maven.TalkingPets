package io.zipcoder.polymorphism;

public class Cat extends Pet {
    private String catName;

    Cat(String name)
    {
        catName = name;
    }

    public String speak()
    {
        return "Meowwwww";
    }
}
