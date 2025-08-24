public class methodOverloading{

    int add (int a, int b){
            return a+b;
        }
    int add (int a, int b, int c){
        return a+b+c;
    }

    int add(int a , double b, int c){
        return (int) (a-b+c);
    }
    public static void main(String[] args){
        methodOverloading obj = new methodOverloading();
        System.out.println(obj.add(1, 2.3, 3));
    }
}