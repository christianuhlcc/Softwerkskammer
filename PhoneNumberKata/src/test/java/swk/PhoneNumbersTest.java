package swk;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PhoneNumbersTest {

    @Test
    public void testAddSingleNumberIsValid() {
        PhoneList phoneList = new PhoneList();
        phoneList.add("Bob: 91 12 54 26");

        assertTrue(phoneList.isValid(), "PhoneList is not valid");

    }

    @Test
    public void testAddTwoValidNumbersIsValid() {
        PhoneList phoneList = new PhoneList();
        phoneList.add("Bob: 91 12 54 26");
        phoneList.add("Alice: 97 625 992");

        assertTrue(phoneList.isValid(), "PhoneList is not valid");
    }

    @Test
    public void testAddThreeInvalidNumbersIsInvalid() {
        PhoneList phoneList = new PhoneList();
        phoneList.add("Bob: 91 12 54 26");
        phoneList.add("Alice: 97 625 992");
        phoneList.add("Emergency: 911");

        assertFalse(phoneList.isValid(), "Phone List is valid but should not be!");

    }

    @Test
    public void testAddThreeInvalidNumbersInOtherOrderIsInvalid() {
        PhoneList phoneList = new PhoneList();
        phoneList.add("Emergency: 911");
        phoneList.add("Bob: 91 12 54 26");
        phoneList.add("Alice: 97 625 992");
        assertFalse(phoneList.isValid(), "Phone List is valid but should not be!");
    }
}
