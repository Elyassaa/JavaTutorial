import java.util.Scanner;

public class stringMethod {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name = " Elyassaa m b ";
        String password = "1234Abc";


        int length = name.length();
        char letter = name.charAt(length-1);
        int index = name.indexOf("o"); // find the index of the first 'o'
        int lasIndex = name.lastIndexOf("o");
         //name = name.toUpperCase();
         //name = name.toLowerCase();
        name = name.trim();
        System.out.println(letter);
        System.out.println(length);

        length = name.length();
        System.out.println(length);

        //boolean fill = name.isEmpty(); // check if the name is empty or not .
        //System.out.println(fill);


        System.out.print("Enter the password: ");
        String passInp = scanner.nextLine();

        boolean isPassed = passInp.equalsIgnoreCase(password); // this can password ignored lowerCase/UpperCase.

        if (passInp.equals(password)){
            System.out.println("Welcome " + name);
        }
        else{
            System.out.println("Sorry! wrong password..");
        }

    }
    }
