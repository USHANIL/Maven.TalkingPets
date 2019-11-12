package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;


public class CatTest {
    @Test
    public void speakTest() {
        Cat testCat = new Cat("Jinga");
        String expected = "meow";
        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        // Given
        Cat testCat = new Cat("Dinga");
        String expectedName = "Blooky";
        // When
        String actualName = testCat.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);
    }

}
