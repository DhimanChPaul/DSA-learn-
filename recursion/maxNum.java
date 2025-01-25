public class maxNum {
    static void print(int []arr,int index){
        if (index== arr.length){
            return ;
            // In void no return statement so here return nothing
        }
        System.out.println(arr[index] +"   ");
//        return max(arr[], index+1); this is false statement
         print(arr, index+1);
    }

    static int max(int []arr,int index){
       if(index== arr.length-1){
           return arr[index];
       }
       return Math.max(arr[index],max(arr, index+1));
    }

    public static void main(String[] args) {
        int []a={4,9,6,1,3};
//        max(a[],0);     this is false statement
        print(a,0);
     int x=  max(a,0);
        System.out.println("max no is "+x);

    }
}
