package question.greedy;

import java.util.ArrayList;

public class facKnapsack {
    static class Item{
        int val;
        int weight;
        float percent;

        Item(int val,int weight){
            this.val=val;
            this.weight=weight;
            this.percent= (float) val /weight;
        }
    }
    static double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        double ans=0.0;
        int n= values.length;
         ArrayList<Item> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(new Item(values[i], weights[i]));
        }
        li.sort((a,b) -> Float.compare(b.percent, a.percent));
        for (int i = 0; i < n; i++) {
            System.out.println(li.get(i).val);
            System.out.println(li.get(i).weight);
            System.out.println(li.get(i).percent);
            System.out.println("..........");
        }


    return ans;
    }


    public static void main(String[] args) {
        int[] val={60, 100, 130};
        int[] weight={10, 20, 30};

        fractionalKnapsack(val,weight,50);
    }
}
