Ascending  using bubble sort
class Main{
    public static void main (String[] args){
        int [] arr = {3,4,2,5,9,1};
        for(int i = 0; i < arr.length-1;i++){
            for(int j = 0; j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int  temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        
    }
}
Descending  using bubble  sort  
class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 8, 7, 4};

        // Bubble Sort descending
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // swap if left is smaller than right
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Descending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

Ascending Order using collection 
import java.util.Arrays;
class Main{
    public static void main (String[] args){
        int [] arr = {3,4,2,5,9,1};
        Arrays.sort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
        
    }
}
Descending order using collection 
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 7, 6}; // Use Integer, not int, for Collections.reverseOrder()

        // Sort in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print("Descending: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
