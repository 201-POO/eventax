package data;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import entities.Person;

public class PersonData {
    // falto desc
    // si ok
    static List<Person> lis = new CopyOnWriteArrayList<Person>();
    static int id=0;

    public PersonData() {
    }

    public List<Person> list() {
        return lis;
    }

    public void create(Person d) {
        id = id + 1;
        System.out.println("ID:" + id);
        d.setId(id);
        lis.add(d);
    }

    public void delete(int id) {
        for (Person d : lis) {
            if (id == d.getId()) {
                lis.remove(d);
                System.out.println("Eliminado " + d.getName());
            }
        }
    }
}