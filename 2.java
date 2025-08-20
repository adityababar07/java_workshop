import java.util.ArrayList;
import java.util.List;

// In Java, class names should follow UpperCamelCase convention.
public class Arithmetic {
    public static void main (String[] args){
        int a = 2;
        System.out.println("Initial value of a: " + a);

        // Arrays (`int[]`) have a fixed size and you cannot append to them.
        // To create a dynamic list that you can append to, use an `ArrayList`.
        // Note: We use the wrapper class `Integer` because collections can only hold objects, not primitives like `int`.
        List<Integer> table = new ArrayList<>();
        System.out.println("Initial list: " + table);

        // You can easily append elements using the .add() method.
        System.out.println("\nAppending 10...");
        table.add(10);
        System.out.println("List is now: " + table);

        System.out.println("\nAppending 20...");
        table.add(20);
        System.out.println("List is now: " + table);
    }
}