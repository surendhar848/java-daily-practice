import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        String a = "Hello world";
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : a.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find the character with maximum frequency
        char maxChar = ' ';
        int maxCount = 0;

        for (char ch : map.keySet()) {
            if (map.get(ch) > maxCount) {
                maxCount = map.get(ch);
                maxChar = ch;
            }
        }

        System.out.println("Most frequent character: '" + maxChar + "' occurred " + maxCount + " times.");
    }
}
