 class Company {
    String name;

    public  void run(){
        System.out.println("Company!");
    }
}

class CFC extends Company{
    String slogan;

    public  void run(){
        System.out.println("Cargils Food City!");
    }

}

class Test3{
    public static void main(String[] args) {
        Company c=new CFC();
        c.name="Cargills pvt ltd!";
        CFC cfc=(CFC) c;
        c.name="Goldi!";
        cfc.slogan="Gedara Yana gaman";
        System.out.println(c.name);

        c.run();
        System.out.println(c.name);
        System.out.println(cfc.slogan);

        cfc.run();
    }
}
