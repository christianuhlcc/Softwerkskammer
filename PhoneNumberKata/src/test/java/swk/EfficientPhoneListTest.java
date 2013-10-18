package swk;

import org.junit.Ignore;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class EfficientPhoneListTest {

    @Test
    public void testAddSingleNumberIsValid() {
        EfficientPhoneList phoneList = new EfficientPhoneList();
        phoneList.add("Bob: 91 12 54 26");

        assertTrue(phoneList.isValid(), "PhoneList is not valid");

    }

    @Test
    public void testAddTwoValidNumbersIsValid() {
        EfficientPhoneList phoneList = new EfficientPhoneList();
        phoneList.add("Bob: 91 12 54 26");
        phoneList.add("Alice: 97 625 992");

        assertTrue(phoneList.isValid(), "PhoneList is not valid");
    }

    @Test
    public void testAddThreeInvalidNumbersIsInvalid() {
        EfficientPhoneList phoneList = new EfficientPhoneList();
        phoneList.add("Bob: 91 12 54 26");
        phoneList.add("Alice: 97 625 992");
        phoneList.add("Emergency: 911");

        assertFalse(phoneList.isValid(), "Phone List is valid but should not be!");

    }

    @Test
    public void testAddThreeInvalidNumbersInOtherOrderIsInvalid() {
        EfficientPhoneList phoneList = new EfficientPhoneList();
        phoneList.add("Emergency: 911");
        phoneList.add("Bob: 91 12 54 26");
        phoneList.add("Alice: 97 625 992");
        assertFalse(phoneList.isValid(), "Phone List is valid but should not be!");
    }


    @Test
    @Ignore
    public void testPerformanceOfList() {
        EfficientPhoneList list = new EfficientPhoneList();
        List<String> buffer = new ArrayList<String>();
        System.out.println("filling list");
            Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (long l = 0; l < 1000000 ; l++ ) {
            String name = String.valueOf(Math.abs(rand.nextInt()));
            String number = String.valueOf(Math.abs(rand.nextInt()));
            buffer.add(name + ":" + number);
        }
        System.out.println("importing list");
        for(String s : buffer) {
            list.add(s);
        }

    }
}
