package io.zipcoder.polymorphism;

public class Dog extends Pet{
    private String dogName;

    @Override
    public String getName() {
        return dogName;
    }

    @Override
    public void setName(String name) {
        this.dogName = name;
    }

    Dog(String name)
    {
        this.dogName = name;
    }


    public String speak()
    {
        return "woof";
    }



}
