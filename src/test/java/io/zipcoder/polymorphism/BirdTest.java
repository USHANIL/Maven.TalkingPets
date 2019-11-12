package io.zipcoder.polymorphism;

import org.junit.Test;
import org.junit.Assert;

public class BirdTest {
    @Test
    public void speakTest() {
        Bird testBird = new Bird("Pinky");
        String expected = "chirp";
        String actual = testBird.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameTest(){
        // Given
        Bird testBird = new Bird("Blooky");
        String expectedName = "Blooky";
        // When
        String actualName = testBird.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}
