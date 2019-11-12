package io.zipcoder.polymorphism;

public class Cat extends Pet {
    public void setCatName(String catName) {
        this.catName = catName;
    }

    private String catName;

    public String getCatName() {
        return catName;
    }

    Cat(String name)
    {
        catName = name;
    }

    public String speak()
    {
        return "Meowwwww";
    }
}
