package data;

import java.util.ArrayList;
import java.util.List;
import entities.Person;

public class PersonData {
    static List<Person> lis =new ArrayList<Person>();
    public List<Person> list() {
        return lis;
    }
    public void create(Person d) {
        lis.add(d);
    }
}