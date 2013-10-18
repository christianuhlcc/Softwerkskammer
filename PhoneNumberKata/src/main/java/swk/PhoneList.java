package swk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PhoneList {

    private List<String> phoneNumbers = new ArrayList<String>();
    private boolean phoneNumbersIsValid = true;

    public void add(String entry) {
        String number = entry.split(":")[1].replace(" ","");
        for(String s : phoneNumbers ) {
           if ( s.startsWith(number)  || number.startsWith(s)) {
               phoneNumbersIsValid = false;
               break;
           }
        }
        phoneNumbers.add(number);
    }

    public boolean isValid() {
        return phoneNumbersIsValid;
    }

}
