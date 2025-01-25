package problem;

public class problem1 {
    public static void main(String[] args) {
        char grade= 'B';
        grade =(char)(grade+8);
        //char word convert it int to charecter
        System.out.println(grade);
        // decode grade
        grade =(char)(grade-8);
        System.out.print(grade);
    }
}
