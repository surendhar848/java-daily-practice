public class StringReverse {
    public static void main(String[] args) {
        String input = "surendhar";
        StringBuilder result = new StringBuilder(input);
        result.reverse();

        System.out.println("Reversed string: " + result.toString());
    }
}
