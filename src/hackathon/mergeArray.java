package hackathon;

public class mergeArray {
    public static void main(String[] args) {
//         [1, 3, 5], [2, 4, 6]
        int arr1[]={1, 3, 5};
        int arr2[]={2,4,6};
        int n1 = arr1.length, n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        while (j < n2) {
            merged[k++] = arr2[j++];
        }
        for (int l = 0; l < n1 + n2; l++) {
            System.out.println(merged[l]);
        }
//        int k=0;
//        int j=0;
//        int arr[]=new int[(li1.length+ li2.length)];
//        System.out.println(arr.length);
//        System.out.println(li2[li2.length-1]);
//        for (int i = 0; i < arr.length; i++) {
//            if (li1[j]<li2[k]){
//                arr[i]=li1[j];
//                j++;
//                if (j>(li1.length-1)){
//                    j= li1.length-1;
//                }
//            }
//            else{
//                arr[i]=li2[k++];
//                if (k > (li2.length-1)){
//                    k= li2.length-1;
////                    k++;
//                }
////                if (k== li1.length){
////                    break;
////                }
//            }
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
