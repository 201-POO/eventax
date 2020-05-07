import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("***** CRUD PERSON *****");
        System.out.println("1 List ");
        System.out.println("2 New ");
        System.out.println("0 Exit ");
        System.out.println("Choice option: ");
        int opt= input.nextInt();
        System.out.println("You chosed: "+opt);
        

    }
}