package io.zipcoder.polymorphism;

public class Dog extends Pet{
    private String dogName;
    private Integer dogAge;

    public void setAge(Integer age) {
        this.dogAge = age;
    }

    public Integer getAge() {
        return dogAge;
    }

    @Override
    public String getName() {
        return dogName;
    }

    @Override
    public void setName(String name) {
        this.dogName = name;
    }

    Dog(String name,Integer age)
    {
        this.dogName = name;
        this.dogAge=age;
    }


    public String speak()
    {
        return "woof";
    }


    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
