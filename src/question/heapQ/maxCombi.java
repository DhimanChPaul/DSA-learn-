package question.heapQ;

import java.lang.reflect.Array;
import java.util.*;

public class maxCombi {
    static class pair{
        int sum;
        int idxA;
        int idxB;
        pair(int sum, int idxA, int idxB){
            this.sum=sum;
            this.idxA=idxA;
            this.idxB=idxB;
        }
    }
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        List<Integer> li= new ArrayList<>();
        PriorityQueue<pair> pq= new PriorityQueue<>((a,b)-> b.sum-a.sum);
        Set<String> st= new HashSet<>();

        Arrays.sort(A);
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
        Arrays.sort(B);
        System.out.println("...........");
        for (int i = 0; i < N; i++) {
            System.out.println(B[i]);
        }
        System.out.println("...........");
        int last=N-1;
        pq.offer(new pair(A[last]+B[last],last,last));
        st.add(last+","+last);
        for (int i = 0; i < K; i++) {
            pair curr=pq.poll();
            assert curr != null;
            li.add(curr.sum);
            int x= curr.idxA;
            int y= curr.idxB;

            //now visit (x,y-1)
            if(y>0){
                int sum=A[x]+B[y-1];
                String key=x+","+(y-1);
                System.out.println("sum1: "+sum);
                System.out.println("keys: "+key);
                if(!st.contains(key)){
                    pq.offer(new pair(sum,x,y-1));
                    st.add(key);
                }
            }
            //now call(x-1,y)
            if(x>0){
                int sum=A[x-1]+B[y];
                String key=(x-1)+","+y;
                System.out.println("sum2: "+sum);
                System.out.println("keys: "+key);
                if(!st.contains(key)){
                    pq.offer(new pair(sum,x-1,y));
                    st.add(key);
                }
            }
        }
//        System.out.println(st.containsAll());
        return li;
    }
    public static void main(String[] args) {
        int[] A={371 ,349, 552, 343, 331, 721, 46 ,572 ,512, 469, 890, 608, 917, 719, 830, 104, 159};
        int[] B={681, 150, 595, 597, 209, 778, 666, 965, 203, 658, 273, 404, 389, 898, 847, 253, 959};

        List<Integer> li = maxCombinations(A.length,6,A,B);
        System.out.println(li);
//        1882 1876 1855 1849 1815 1795
        System.out.println("1882 1876 1855 1849 1815 1795");

    }
}
