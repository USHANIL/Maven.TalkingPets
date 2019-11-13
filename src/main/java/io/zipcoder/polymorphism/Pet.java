package io.zipcoder.polymorphism;

public abstract class Pet {
    private String name;

    Pet()
    {

    }


    protected String speak() {

        return "grrrrr";

    }

    public void setName(String inputName)
    {
        name = inputName;
    }

    public String getName()
    {
        return name;
    }

}
