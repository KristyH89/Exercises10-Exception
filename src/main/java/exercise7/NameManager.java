package exercise7;

import java.util.ArrayList;
import java.util.Arrays;

public class NameManager {
    private ArrayList<String> names = new ArrayList<>();

    public NameManager() {
        names = new ArrayList<>(Arrays.asList(
                "Anna", "Bernard", "Chris", "Deborah", "Eva",
                "Fredrik", "Gloria", "Hans", "Inge", "Jason",
                "Kristy", "Lennard", "Matteo", "Nova", "Odin",
                "Quinn", "Romeo", "Stefanie", "Tim", "Usher",
                "Vanessa", "William", "Xena", "Yvonne", "Zelda"
        ));
    }

    public void addName(String name) throws DuplicateNameException {
        if (names.contains(name)) {
            throw new DuplicateNameException("Name alreadu exist!");
        }
        names.add(name);
    }

    public void findName(String name) throws NameNotFoundException {
        if (!names.contains(name)) {
            throw new NameNotFoundException("Name not found!");
        }
        System.out.println("Found: " + name);
    }

    public void showNames() {
        System.out.println("Names: " + names);
    }
}
