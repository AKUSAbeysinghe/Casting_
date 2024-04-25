 class Employee {
    String name;
    public void print(){
        System.out.println("Employee print method called!");
    }
}

class SE extends Employee{
    int age;

    public  void print(){
        System.out.println("SE print method called!");
    }
}

class Test2{
    public static void main(String[] args) {
        Employee e=new SE();
        e.name="Lahiru";
        SE s=(SE) e;
        s.age =22;
        System.out.println(s.name);
        System.out.println(s.age);
        s.print();
    }
}
