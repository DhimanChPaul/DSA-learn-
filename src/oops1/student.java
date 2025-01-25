package oops1;

public class student {
    String name;
    int rno;
    double percentage;
     static int numberofstudent;

    public student(){

    }
    public  student ( String nam, int roll, double marks){
        name= nam;
        rno= roll;
        percentage=marks;
        numberofstudent++;

    }
}
