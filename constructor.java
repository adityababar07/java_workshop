public class Constr{
    void constr(int y){
        int x = y;
        System.out.println("x = "+x);
    }
    public static void main(String[] args){
        Constr obj = new Constr();
        obj.constr(10);
    }
}