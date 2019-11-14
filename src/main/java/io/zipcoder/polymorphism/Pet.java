package io.zipcoder.polymorphism;

import java.util.Comparator;

public abstract class Pet implements Comparable <Pet>{
    private String name;
     private Integer age;
    Pet()
    {
        this.name = "";
        this.age = 0;
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
    public void setAge(Integer inputAge)
    {
        age = inputAge;
    }
    public Integer getAge()
    {
        return age;
    }

}
