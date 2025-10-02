public class ternaryOperator {
    public static void main(String[] args){

        int score = 55;
        String passOrFail = (score >= 55) ? "Pass" : "Fail";
        int number = 23;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
    }
}

