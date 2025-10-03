import java.lang.reflect.Array;
import java.util.Arrays;

public class arry {
    public static void main(String[] args){
        String[] fruits = {"Apple","banana","orange","coconut"};
        System.out.println("hello");
        int numFruits = fruits.length;
        System.out.println(numFruits);
        System.out.println(Arrays.toString(fruits));
        for(int i=0; i<fruits.length; i++){
            System.out.print(fruits[i] + ", ");
        }
        System.out.println("Strng");
        Arrays.sort(fruits);
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
