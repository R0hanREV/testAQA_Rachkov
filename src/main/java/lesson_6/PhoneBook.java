package lesson_6;

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
        for (Map.Entry<String, List<String>> o : phoneBook.entrySet()) {
            if (!phoneBook.containsKey(name)) {
                phoneBook.put(name, new ArrayList<>());
            }
            if (o.getKey().equals(name)) {
                o.getValue().add(phoneNumber);
            }
        }
    }

    void printAll() {
        System.out.println("\n=== ВЕСЬ ТЕЛЕФОННЫЙ СПРАВОЧНИК ===");
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(String.join(", ", entry.getValue()));

        }
    }
}
