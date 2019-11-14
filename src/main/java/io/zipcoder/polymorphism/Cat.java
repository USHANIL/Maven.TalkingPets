package io.zipcoder.polymorphism;

public class Cat extends Pet {
    private String catName;
    private Integer catAge;

    public void setAge(Integer catAge) {
        this.catAge = catAge;
    }

    public Integer getAge() {
        return catAge;
    }

    Cat(String name,Integer age)
    {
        catName = name;
        catAge= age;

    }

    public void setName(String catName) {
        this.catName = catName;
    }

    public String getName() {
        return catName;
    }



    public String speak()
    {
        return "meow";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
