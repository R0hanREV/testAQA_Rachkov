package lesson_6;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void get(String name) {
        for (Map.Entry<String, List<String>> o : phoneBook.entrySet()) {
            if (o.getKey().equals(name)) {
                System.out.println(name + " : " + o.getValue());
            }
        }
    }

    public void add(String name, String phoneNumber) {
        List<String> phones = phoneBook.computeIfAbsent(name, k -> new ArrayList<>());
        phones.add(phoneNumber);
    }
}

