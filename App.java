import entities.Person;
import igu.MainFrame;

public class App {
public static void main(String[] args) {
        MainFrame m= new MainFrame();
        m.setVisible(true);
        System.out.println("JFrame inicado");
        Person person= new Person();
        person.setId(5);
    }
}