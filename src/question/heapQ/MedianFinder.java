package question.heapQ;

import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> smallVal = new PriorityQueue<>((a,b)->b-a);
    PriorityQueue<Integer> maxVal = new PriorityQueue<>();

    public MedianFinder() {

    }

    public void addNum(int num) {
        smallVal.offer(num);
        if(smallVal.size()-maxVal.size()>1){
            maxVal.offer(smallVal.poll());
        }
        if (!maxVal.isEmpty()){
            if(smallVal.peek()>maxVal.peek()){
                int temp=maxVal.poll();
                maxVal.offer(smallVal.poll());
                smallVal.offer(temp);
            }
        }


        System.out.println(smallVal);
        System.out.println("........");
        System.out.println(maxVal);

    }

    public double findMedian() {

        double ans=0.0;
        if (smallVal.isEmpty()){
            return ans;
        }
        if (smallVal.size() > maxVal.size()){
            return smallVal.poll();
        }

        else {
            ans = (double) (smallVal.poll() + maxVal.poll()) / 2.0;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
