import java.util.Scanner;

public class bank {
        public static void main(String[] args){

            // Java banking program
            Scanner scan = new Scanner(System.in);
            double balance = 0;
            int choice =5;
            while (choice != 0){
                choice = menu();
                switch (choice){
                case 1 ->{
                    System.out.println("1. Show Balance:");
                    if (balance == 0){
                        System.out.println("Your Account is empty");
                    }else{
                        System.out.println("You have "+ balance + "DA");
                    }
                }
                case 2 ->{
                    System.out.println("2. Deposit");
                    System.out.println("Enter the amount you want to deposit: ");
                    double value = scan.nextDouble();
                    balance = value;
                    if (value <= 0) {
                        System.out.println("Are u kidding? Enter a real value.");
                    }
                }
                case 3 ->{
                    System.out.println("3. Withdraw: ");
                    System.out.print("Enter the amount you want to withdraw : ");
                    double deposed = scan.nextDouble();
                    if (deposed > balance) {
                        System.out.println("Sorry..! your account has not this amount value. ");
                    }else {
                    balance = balance - deposed;
                    }
                }
                case 4 ->{
                    choice =0;
                }
                default ->{
                    System.out.println("Enter only selected interval choice.");
                }
            }
            }
        }
        static int menu() {
            Scanner inpt = new Scanner(System.in);
            System.out.println(" * Banking Program");
            System.out.println("*****************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");
            System.out.print("Enter your choice: ");
            return inpt.nextInt();
        }
}
