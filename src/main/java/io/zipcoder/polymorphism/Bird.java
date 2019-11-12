package io.zipcoder.polymorphism;

public class Bird extends Pet{
private String birdsName;

    public void setBirdsName(String name) {

        this.birdsName = birdsName;
    }

    public String getBirdsName() {

        return birdsName;
    }

    public Bird(String birdsName) {
        this.birdsName = birdsName;
    }
    public String speak(){
        return "tweet";
    }
}
