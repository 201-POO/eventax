import java.util.List;
import java.util.Scanner;

import data.PersonData;
import entities.Person;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt=0;
        PersonData pData = new PersonData();
        do {
            System.out.println("***** CRUD PERSON *****");
            System.out.println("1 List ");
            System.out.println("2 New ");
            System.out.println("0 Exit ");
            System.out.println("Choice option: ");
            opt = input.nextInt();
            System.out.println("You chosed: " + opt);
            input.nextLine(); //Limpiar el buffer
            switch (opt) {
                case 1:
                    System.out.println("****** 1 List *****");
                    List<Person> lis= pData.list();
                    System.out.println("Name \t Sex");
                    for(Person d: lis){
                        System.out.println(d.getName()+"\t"+d.getSex());
                    }
                    break;
                case 2:
                    System.out.println("**** 2 New ****");
                    Person d = new Person();
                    
                    System.out.print("Ingrese Name: ");
                    d.setName(input.nextLine());               
                    System.out.print("Ingrese Sex: ");
                    d.setSex(input.nextLine());

                    pData.create(d);
                    break;
                case 3:
                    System.out.println("By ");
                    break;
                default:
                    System.out.println("Incorrecto");
                    break;
            }

        } while (opt != 0);

    }
}