package data;

import java.util.ArrayList;
import java.util.List;
import entities.Person;

public class PersonData {
    List<Person> list =new ArrayList<Person>();
    public void create(Person d) {
        list.add(d);
    }
}