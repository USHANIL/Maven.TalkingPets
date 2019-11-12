package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speakTest() {
        Dog testDog = new Dog("Blacky");
        String expected = "meow";
        String actual = testDog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        // Given
        Dog testDog = new Dog("Browny");
        String expectedName = "Browny";
        // When
        String actualName = testDog.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
