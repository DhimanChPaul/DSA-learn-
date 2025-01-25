package oops1.abstractDemo;

public abstract class parent {
//    abstract is to be overriding
//    abstract is  used only when we need to be overriding many times

    int age;

    public parent(int age) {
        this.age = age;
    }

//    abstract parent();
//     abstract  constractor also not allowe;

    static void hi(){
        System.out.println("hey i am here");
    }

    void normal(){
        System.out.println("i am just checking");
    }
    
    abstract void careear(String name);
    abstract void parent(String name,int age);

}
