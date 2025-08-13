// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;
import java.util.Map;
class Main {
    public static void main(String[] args) {
        String a = "swiss";
     
        HashMap <Character,Integer> map = new HashMap<>();
       for(char ch: a.toCharArray()){
           map.put(ch, map.getOrDefault(ch,0)+1);
       }
       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           if(entry.getValue()==2){
               System.out.print(entry.getKey());
               return;
           }
       }
    }
}
