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
                   
                    System.out.print("Ingrese Name: ");
                    String n= input.nextLine(); 
                    input.nextLine();   
                    System.out.print("Name: "+n);    
                                            
                    System.out.print("Ingrese Sex: ");
                    String s= input.nextLine();
                    input.nextLine();
                    System.out.print("Sex: "+s);

                    Person d = new Person();
                    d.setName(n);
                    d.setSex(s);
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