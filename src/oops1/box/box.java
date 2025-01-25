package oops1.box;

public class box {
    double hight;
    double width;
    double length;

    public box() {
        this.hight = -1;
        this.width = -1;
        this.length = -1;

    }

    public box(double hight, double width, double length) {
        this.hight = hight;
        this.length = length;
        this.width = width;

    }

    public box(double side) {
        this.hight = side;
        this.length = side;
        this.width = side;
    }

    box(box old) {
        this.hight = old.hight;
        this.length = old.length;
        this.width = old.width;
    }
     static void greeting(){
         System.out.println(" i am in the box class");
     }


    void display() {
        System.out.println("box hight: " + hight);
        System.out.println("box width: " + width);
        System.out.println("box length: " + length);
    }
}

/*
in the same class
class boxWeight extends box {
    // here box is parent class and boxWidth is cldid claas
    // child class extends parent class and use all things
    double weight;
    public boxWeight(){

        this.weight=-1;
    }
    public boxWeight(double weight){
        this.weight=weight;

    }
    boxWeight(double hight,double length,double width,double weight){
        super(hight, width, length);
        // super is a key word which call the parent class constructor
        this.weight=weight;
    }
    boxWeight(double hight,double length,double width){
        super(hight, width, length);
    }
    boxWeight(double side,double weight){
        super(side);
        this.weight=weight;

    }
    void dis(){
        display();
        System.out.println("box weight: "+weight);

    }
}

 */



