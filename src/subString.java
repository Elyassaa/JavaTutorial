import java.util.Scanner;

public class subString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Type your email: ");
        String email = scan.nextLine();
        if (email.contains("@")){
            System.out.println("Email must contain @");
        }
        String userName = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);
        //String domain = email.substring(email.indexOf("@")+1,email.length());

        System.out.println("Email: "+ email + "\n Username: " + userName + "\n Domain: "+ domain);

        scan.close();





    }
}