import java.util.Scanner;

public class ifElse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter your age:\t");
        age = input.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote!!!");
        }
        else{
            System.out.println("You are not eligible to vote!!!");
        }
    }
}