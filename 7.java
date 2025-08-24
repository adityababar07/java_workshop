class Student{
    static String name;
    static int roll;

    void display(){
        System.out.println("name =\t" + name);
        System.out.println("roll =\t" + roll);

    }


    public static void main(String[] args){
        Student obj = new Student();
        Student.name = "aditya";
        Student.roll = 1;
        obj.display();
        Student.roll = 37;
        obj.display();

    }
}