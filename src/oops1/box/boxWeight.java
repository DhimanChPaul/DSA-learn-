package oops1.box;

public class boxWeight extends box {
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


    void display() {
        super.display();
    }

//    @Override
     static void greeting(){
        System.out.println(" i am in the boxWeight class");
    }
    void dis(){
        display();
        System.out.println("box weight: "+weight);

    }
}
