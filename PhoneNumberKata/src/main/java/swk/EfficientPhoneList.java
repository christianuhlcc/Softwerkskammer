package swk;

import java.util.HashMap;
import java.util.Map;

public class EfficientPhoneList {

    private Map<Integer, Boolean> phoneNumbers = new HashMap<Integer, Boolean>();

    private boolean phoneNumbersIsValid = true;

    public void add(String entry) {
        String number = entry.split(":")[1].replace(" ", "");
        for (int i = 1; i < number.length(); i++) {
            Integer key = Integer.valueOf(number.substring(0, i));
            if (phoneNumbers.get(key) != null)
                if (phoneNumbers.get(key) == true || number.length() - 1 == i)
                    phoneNumbersIsValid = false;
            phoneNumbers.put(key, Boolean.valueOf(i == number.length() - 1));
        }
    }

    public boolean isValid() {
        return phoneNumbersIsValid;
    }

}
