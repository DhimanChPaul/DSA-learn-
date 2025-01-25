package oops1.abstractDemo;

public  class son extends parent {

    public  son(int age){
        super(age);
    }

//    @Override
//    static void hi() {
//        super.hi();
//    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void careear(String name) {
        System.out.println("i am going to be a "+name);
    }

    @Override
    void parent(String name, int age) {
        System.out.println("my name is "+name+"and age is "+age);
    }
}
