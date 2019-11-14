package io.zipcoder.polymorphism;

import org.junit.Test;
import org.junit.Assert;

public class BirdTest {
    @Test
    public void speakTest() {
        Bird testBird = new Bird("Pinky",3);
        String expected = "chirp";
        String actual = testBird.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        // Given
        Bird testBird = new Bird("Blooky",6);
        String expectedName = "Blooky";
        // When
        String actualName = testBird.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
