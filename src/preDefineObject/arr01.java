package preDefineObject;
import java.util.*;

import static java.util.Collections.binarySearch;

public class arr01 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10,1};

//        int temp= ;
        System.out.println(Arrays.binarySearch( arr, 6));
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
