package io.zipcoder.polymorphism;

public class Dog extends Pet{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    Dog(String name)
    {

    }


    public String speak()
    {
        return "woof";
    }



}
