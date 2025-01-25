package oops1.box;

public class boxP extends boxWeight{
    double cost;
    boxP(){
        this.cost=-1;
    }
    boxP(double cost){
        this.cost=cost;

    }
    boxP(double side,double weight, double cost){
        super(side, weight);
        this.cost=cost;
    }
    boxP(double hight,double length,double width,double weight, double cost){
        super(hight, width, length,cost);
        // super is a key word which call the parent class constructor
        // in the sub class or child class
        this.cost=cost;
    }


    void disP() {
        super.dis();
        System.out.println("cost is: "+cost);
    }

}
