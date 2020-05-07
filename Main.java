import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt;
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
                    break;
                case 2:
                    System.out.println("**** 2 New ****");
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