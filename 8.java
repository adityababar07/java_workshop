class Car{
    String model_name;
    int price;
    String color;

    public void display(String model_name, int price, String color){
        System.out.println("model_name =\t" + model_name);
        System.out.println("price =\t" + price);
        System.out.println("color =\t" + color);
    }
    public static void main(String[] args){
        Car obj = new Car();
        obj.display("BMW", 40000000, "black");
    }
}