package io.zipcoder.polymorphism;

public class Bird extends Pet{
private String birdsName;
private Integer birdsAge;

    public void setAge(Integer age) {
        this.birdsAge = age;
    }

    public Integer getAge() {
        return birdsAge;
    }

    public void setName(String name)
    {
        this.birdsName = name;

    }

    public String getName() {

        return birdsName;

    }

    public Bird(String birdsName,Integer birdsAge) {
        this.birdsName = birdsName;
        this.birdsAge= birdsAge;
    }
    public String speak(){
        return "chirp";
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}
