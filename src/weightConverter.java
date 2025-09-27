import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double wkgs = 0;
        double wlbs = 0;

        System.out.println("Weight Convertion Program 🏋️");
        System.out.println("1: Convert lbs to Kgs.");
        System.out.println("2: Convert  Kgs to lbs.");
        System.out.print("Choose an Option: ");
        int option = scan.nextInt();
        switch(option){
            case 1 :
                System.out.println("1: Converting  Lbs to Kgs.");
                System.out.print("Enter the weight in Lbs: ");
                wlbs = scan.nextDouble();
                wkgs = wkgs / 2.20462;
                System.out.printf("%g lbs is %.2gKg.\n",wlbs,wkgs);
                break;
            case 2:
                System.out.println("2: Converting  Kgs to lbs.");
                System.out.print("Enter the weight in Kgs: ");
                wkgs = scan.nextDouble();
                wlbs = wkgs * 2.20462;
                System.out.printf("%.2f KG is %.2f lbs.\n",wkgs,wlbs);
                break;
            default:
                System.out.println("The Program End.");

        }
        scan.close();
    }
}
