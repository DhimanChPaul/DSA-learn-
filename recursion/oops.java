public class oops {
    public static class Student{
        String name;
        int roll;
        double percentage;

    }
    public static void print(Student x){
        System.out.println(x.name +"\n"+ x.roll +"\n"+ x.percentage);
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.name= "Dhiman"+" paul";
        x.roll= 71;
        x.percentage=75.74;
        print(x);
    }
}
