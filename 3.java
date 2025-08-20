import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TableGenerator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Enter the no. who's table you want : \t ");
        a = input.nextInt();
        int b ;
        System.out.print("upto how many positions, do you want  the table:\t");
        b = input.nextInt();
        List<Integer> table = new ArrayList<>();
        for(int i=1; i<=b; i++){
            int c = a * i;
            table.add(c);
        }
        System.out.println(table);
    }
}
