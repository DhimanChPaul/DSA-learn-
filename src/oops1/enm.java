package oops1;

public class enm {
    String name;
    String empno;
     enm(String name, String empno){
        this.empno=empno;
        this.name=name;
     }
    void display(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        enm ob  =new enm("ayan","abcd");
        ob.display();
    }
}
