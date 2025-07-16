// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String a = sc.nextLine();
        String b = a.toLowerCase().replaceAll("\\s","");
        StringBuilder result = new StringBuilder(b);
        result.reverse();
        if(b.equals(result.toString())){
        
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not a palindrome");
    }
    
     System.out.print("Enter the Integer:");
     int c = sc.nextInt();
     int d = c;
     int num = 0;
     while(c!=0){
         int digit = c%10;
         num = num*10+digit;
         c=c/10;
     }
     if(num == d){
     System.out.println("palindrome");
     }
     else{
         System.out.println("Not a palindrome");
     }
}
}
