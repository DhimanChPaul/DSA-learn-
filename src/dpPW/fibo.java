package dpPW;

public class fibo {
    static  int call=0;
    public static int fibo(int n, int arr[]){
        call++;
        if ((n==1 || n==0)){
            return 1;
        }
        //other than calling the samething we store it into the array and then later get data from it
        if (arr[n-1] != -1){
            return arr[n-1];
        }


        System.out.println("call : "+n);

        //here we calculate the same number multiple times it increase time complexity
//        int result=fibo(n-1, arr)+fibo(n-2,arr);
//        arr[n-1]=result;
//        return result;

        return arr[n-1]=fibo(n-1,arr)+fibo(n-2,arr);
    }


    public static void main(String[] args) {
        int n=10;
        int arr[]= new int[n];
        // here we store -1 all of it because then we see whose value is store or not
        for (int i = 0; i < arr.length; i++) {
            arr[i]=-1;
        }
        System.out.println(fibo(n, arr));
        System.out.println("Total call: "+call);
    }
}
