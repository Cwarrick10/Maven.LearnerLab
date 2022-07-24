package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;
public class TestPerson {
    @Test
    public void testConstructors() {
        //Given
        Person person = new Person(25, "Bob");
        //When
        String studName = person.getName();
        long studId = person.getId();
        //Then
        Assert.assertEquals(25, studId);
        Assert.assertEquals("Bob", studName);
    }

    @Test

    public void setName() {
        //Given
        Person person = new Person(0, "");


        //When
        person.setName("Andy");
        String s = person.getName();

        //Then
        Assert.assertEquals("Andy", s);


    }


}
