package compare;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2){
        //if it return a positive number then it return o2
        //if it return a negative number then it return o1
        return o2-o1;
//        return o1-o2;
    }
}
public class comprator01 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(30);
        list.add(13);
        list.add(23);
        list.add(20);

        list.sort(new MyComparator());
        System.out.println(list);

        List<String> li= new ArrayList<>();
        li.add("hello");
        li.add("hi");
        li.add("abc");
        li.add("cde");
        li.add("abcd");

//        Comparator<String> comparator=Comparator.comparing(l)
    }
}
