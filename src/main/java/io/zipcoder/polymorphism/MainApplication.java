package io.zipcoder.polymorphism;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.PrintStream;
import java.util.*;


/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    Integer petAmount = 0;
    Console console = new Console(System.in, System.out);
    private Dog dog;
    private Cat cat;
    private Bird bird;
    ArrayList<Pet> petsList = new ArrayList<Pet>();
    Map<String, Integer> petMap = new HashMap<String, Integer>();


    public static void main(String[] args) {
        MainApplication ma = new MainApplication();
        ma.askNumberOfPets();
        ma.printPets();
        ma.sortPets();
        ma.printPets();

    }

    public void sortPets() {
        //Collections.sort(petsList);
        Comparator comp = new AgeComparator();
        Collections.sort(petsList,comp);
    }





    public void askNumberOfPets() {
        // Collections.sort(petsList);

        petAmount = console.getIntegerInput("how many pets you have?");
        for (int i = 0; i < petAmount; i++) {
            askType();
        }
    }

    public void askType() {
        Integer userInput = console.getIntegerInput(
                "\nWhat type of pet do you have\n\n" +
                        "1. Dog\n" + "2. cat\n" + "3. Bird\n");
        String userInputName = console.getStringInput(
                "\nWhat is the name of your Pet?\n");
        Integer userInputAge = console.getIntegerInput("\nwhat is the age of your pet\n");

        menuAction(userInput, userInputName, userInputAge);
    }

    private void menuAction(Integer input, String inputName, Integer inputAge) {

        switch (input) {
            case 1:
                dog = new Dog(inputName, inputAge);

                //  dog.speak();
                petsList.add(dog);
                //petMap.put(inputName, inputAge);
                break;
            case 2:
                cat = new Cat(inputName, inputAge);
                // cat.speak();
                petsList.add(cat);
                //petMap.put(inputName, inputAge);
                break;
            case 3:
                bird = new Bird(inputName, inputAge);
                // bird.speak();
                petsList.add(bird);
                //petMap.put(inputName, inputAge);
                break;
            default:
                invalidSelectionMessage();
                askType();
                break;
        }
    }

    public String invalidSelectionMessage() {
        String message = "Invalid selection. Please try again.";
        console.print(message);
        return message;
    }

    public void printPets() {
        console.println(String.format("Hey.. You have %s pets.", petAmount));
        for (int i = 0; i < petsList.size(); i++) {

            //Integer age = petsList.get(i).getAge();

            console.println("you have a pet %s and his name is %s and he is %d year old and he says %s"
                    ,petsList.get(i).getClass().getSimpleName(),petsList.get(i).getName(),petsList.get(i).getAge()
                    ,petsList.get(i).speak());
            console.println(petsList.get(i).getName()+" "+ petsList.get(i).getAge());

        }


    }


}