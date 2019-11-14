package io.zipcoder.polymorphism;

import java.util.Comparator;

public class AgeComparator implements Comparator<Pet> {



        public int compare(Pet pet1, Pet pet2)
        {
            Integer age1 = pet1.getAge();
            Integer age2 =pet2.getAge();
            return age1.compareTo(age2);
        }
    }

