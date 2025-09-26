import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal Or prerson): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a "+ adjective1 +" zoo");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1+ " was "+adjective2+" and "+verb1+ "!");
        System.out.println("I was "+ adjective3 +"!");
         */

        // Random number:
        Random random = new Random();
        int min =0;
        int max =100;
        int step =0;
        int number1;
        int number2;
        int number3;

        do {
        number1 = random.nextInt(min, max);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);
        step ++;
        }
        while (number1 == number2 || number2 == number3 || number1 == number3);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println("--"+step+"--");
        scanner.close();

    }
}
