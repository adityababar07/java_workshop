import java.util.Scanner;

public class methodProblem{
    int addNumbers(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number: \t");
        int a = input.nextInt();
        System.out.print("enter Second number: \t");
        int b = input.nextInt();
        methodProblem obj = new methodProblem();
        System.out.println("Sum of the numbers = " + obj.addNumbers(a,b));

    }
}