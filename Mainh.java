//import data.PersonData;
import entities.Person;
import entities.Customer;

public class Mainh {
    public static void main(String[] args) {
        System.out.println("Hola Herencia");
        System.out.println("============Customer SHOW============");
        Customer c= new Customer();
        c.eat();
        c.setName("Empresa 1");
        System.out.println("Customer name:"+c.getName());
        c.setTaxpayerId("RUC 10256398459");
        System.out.println("Customer tax:"+c.getTaxpayerId());
        c.receivePay();

        System.out.println("============Person SHOW============");
        Person p= new Person();
        p.eat();
        p.setName("Persona 1");
        System.out.println("Person name:"+p.getName());
        //p.setTaxpayerId("RUC 10256398459");
        //System.out.println("Person tax:"+p.getTaxpayerId());
    }
}