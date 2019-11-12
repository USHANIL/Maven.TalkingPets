package io.zipcoder.polymorphism;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    Integer petAmount=0;
    Console console = new Console(System.in, System.out);
    private Dog dog;
    private Cat cat;
    private Bird bird;
    ArrayList<Pet> petsList = new ArrayList<Pet>();

public static  void  main(String[]args)
{
    MainApplication ma = new MainApplication();
    ma.askNumberOfPets();
    ma.printPets();


}

    public void askNumberOfPets() {
        petAmount = console.getIntegerInput("how many pets you have?");
        for(int i=0;i<petAmount; i++){
            askType();
        }
    }
    public  void  askType(){
        Integer userInput = console.getIntegerInput(
                "\nWhat type of pet do you have\n\n" +
                        "1. Dog\n"+"2. cat\n"+"3. Bird\n");
        String userInputName = console.getStringInput(
                "\nWhat is the name of your Pet?\n");

        menuAction(userInput, userInputName);
    }
    private void menuAction(Integer input, String inputName){

        switch(input){
            case 1:
            dog  =new Dog(inputName);
          //  dog.speak();
            petsList.add(dog);
            break;
            case 2:
            cat = new Cat(inputName);
           // cat.speak();
                petsList.add(cat);
            break;
            case 3:
            bird =new Bird(inputName);
           // bird.speak();
                petsList.add(bird);
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

    public void printPets()
    {
        console.println(String.format("Hey.. You have %s pets.", petAmount));
        for (int i=0 ; i<petsList.size(); i++) {
            //console.println(petsList.get(i).getName());
            //console.println(petsList.get(i).speak());
            console.println("hey your pets name is %s and he says %s ",petsList.get(i).getName(),petsList.get(i).speak());
        }


      //  System.out.println(ArrayList.toString(petsList));

    }

}


