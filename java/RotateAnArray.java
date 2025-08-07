import java.util.Arrays;
class Main {
    public static void main (String[] args){
        int  [] a = {1,2,3,4,5,6,7};
        int  n = a.length;
        int k = 3;
        int   count =0;
        int [] rotated = new int [n];
        for(int i = n-k; i < n; i++){
            rotated[count++] = a[i];
        }
        for(int i = 0; i < n-k;  i++){
            rotated[count++] = a[i];
        }
        System.out.print(Arrays.toString(rotated));
    }
}
