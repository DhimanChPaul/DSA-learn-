package heap;
import java.util.ArrayList;
public class main {
//    class HeapL<T extends Comparable<T>>{
//
//    }
    public static void main(String[] args) throws Exception {


            heapL<Integer> li= new heapL<>();

            li.insert(112);
            li.insert(12);
            li.insert(412);
            li.insert(712);
            li.insert(1);

        System.out.println(li.remove());
        System.out.println(li.remove());
//        System.out.println(heap.remove());


    }
}
