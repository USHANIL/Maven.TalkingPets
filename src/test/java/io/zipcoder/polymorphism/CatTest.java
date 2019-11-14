package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;


public class CatTest {
    @Test
    public void speakTest() {
        Cat testCat = new Cat("Jinga",1);
        String expected = "meow";
        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        // Given
        Cat testCat = new Cat("Dinga",1);
        String expectedName = "Blooky";
        // When
        String actualName = testCat.getName();
        // Then
        Assert.assertNotEquals(expectedName, actualName);
    }

}
