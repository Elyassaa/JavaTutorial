import java.util.Random;
import java.util.Scanner;

public class dicerole {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int inpt;
        int dice;

        int count=0;
        System.out.print("Enter the # of the role you want: ");
        inpt = scan.nextInt();
        for (int i=0; i<inpt; i++){
            dice = random.nextInt(1,7);
           switch (dice){
               case 1->{
                   System.out.println(" ------");
                   System.out.println("   ⚪  ");
                   System.out.println(" ------");
               }
               case 2->{
                   System.out.println(" ------");
                   System.out.println("  ⚪  ");
                   System.out.println("  ⚪  ");
                   System.out.println(" ------");
               }
               case 3->{
                   System.out.println(" ------");
                   System.out.println(" ⚪     ");
                   System.out.println("   ⚪   ");
                   System.out.println("     ⚪   ");
                   System.out.println(" ------");
               }
               case 4->{
                   System.out.println(" ------");
                   System.out.println(" ⚪  ⚪ ");
                   System.out.println("        ");
                   System.out.println(" ⚪  ⚪ ");
                   System.out.println(" ------");
               }
               case 5->{
                   System.out.println(" ------");
                   System.out.println(" ⚪  ⚪ ");
                   System.out.println("   ⚪   ");
                   System.out.println(" ⚪  ⚪ ");
                   System.out.println(" ------");
               }
               case 6->{
                   System.out.println(" ------");
                   System.out.println(" ⚪  ⚪ ");
                   System.out.println(" ⚪  ⚪ ");
                   System.out.println(" ⚪  ⚪ ");
                   System.out.println(" ------");
               }
           }
           System.out.println("Your role: "+ dice);
           count +=dice;
        }
        System.out.println("Total role: "+ count);
    }
}

