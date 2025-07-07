// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Anagram");
        String a = sc.nextLine();
        System.out.println("Enter the Second Anagram");
        String b = sc.nextLine();
        
        a = a.toLowerCase().replaceAll("\\s","");
        b = b.toLowerCase().replaceAll("\\s","");
        char []arr1 = a.toCharArray();
        char []arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
        System.out.println("Anagram");
    }
    else{
        System.out.print("Not an anagram");
    }
}
}
