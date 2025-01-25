package oops1;
import java.util.Scanner;

public class object1 {
   public static void print(student x){
       System.out.println(x.name+" \n"+x.rno+"\n"+x.percentage);
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        student a= new student();
        a.name="Dhiman";
        a.rno=71;
        a.percentage=8.17;
        print(a);
        student b= new student("Bikram",60,7.5);
        print(b);
        System.out.println(student.numberofstudent);

//        student c= new student();
//        c.name= sc.next();


    }
}
