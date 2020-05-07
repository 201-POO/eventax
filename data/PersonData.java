package data;

import java.util.ArrayList;
import java.util.List;
import entities.Person;

public class PersonData {
    List<Person> lis =new ArrayList<Person>();
   // public static int id;

    public PersonData(){
   //     id=0;
    }
    public List<Person> list() {
        return lis;
    }
    public void create(Person d) {
        int id = lis.size() +1;
        System.out.println("ID:"+id);
        d.setId(id);
        lis.add(d);
    }
    public void delete(int id) {
        System.out.println("ID:"+id);
        for(Person d: lis){
            System.out.println("Deleted:"+d.getId() + "\t" + d.getName());
            if (d.getId() == id){
                try {
                    lis.remove(d);
                    System.out.println("Eliminado");
                } catch (java.util.ConcurrentModificationException e2) {
                    System.out.println("si exist e2="+e2);
                }
            }
        }
    }
}