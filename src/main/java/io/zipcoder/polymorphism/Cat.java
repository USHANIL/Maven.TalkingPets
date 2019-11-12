package io.zipcoder.polymorphism;

public class Cat extends Pet {
    private String catName;
    Cat(String name)
    {
        catName = name;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getName() {
        return catName;
    }



    public String speak()
    {
        return "meow";
    }
}
