import java.util.Scanner;

public class exo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the intrest rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("enter the # of years: ");
        years = scanner.nextInt();
        amount = principal * Math.pow(1+rate / timesCompounded, timesCompounded*years);
        System.out.println("The amount after " + years + " is: $" + amount);





    scanner.close();

    }
}
