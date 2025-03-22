package stringBufferLearn;

public class try01 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();

        sb.append("dhiman");
        sb.append("ch");
        sb.append("paul");

        System.out.println();
        System.out.println(sb.toString());
        sb.replace(6,8," chandra ");
        System.out.println(sb.toString());
        sb.setCharAt(6,'h');
        System.out.println(sb);

    }
}
