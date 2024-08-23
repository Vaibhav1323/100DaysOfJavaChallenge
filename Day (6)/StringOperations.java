public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        // Length and indexing
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 0 of str1: " + str1.charAt(0));

        // Substring
        String substr = str1.substring(2, 4);
        System.out.println("Substring of str1: " + substr);

        // Upper and lower case
        System.out.println("Upper case of str1: " + str1.toUpperCase());
        System.out.println("Lower case of str1: " + str1.toLowerCase());

        // Trim and split
        String str4 = "   Hello World   ";
        System.out.println("Trimmed str4: " + str4.trim());
        String[] words = str4.split(" ");
        System.out.println("Split str4 into words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
