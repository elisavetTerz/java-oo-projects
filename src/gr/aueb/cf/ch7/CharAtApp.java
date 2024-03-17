package gr.aueb.cf.ch7;

public class CharAtApp {

    public static void main(String[] args) {

        String inputString = "Hello, World!";
        convertToASCII(inputString);
    }

    /**
     * For-each: traverse the string from index (position) 0 to length()-1.
     * Method charAt(index):create a char variable for every character of the input string.
     * Typecast every char to int in order to take the ASCII decimal number.
     * @param str user's input is a string
     */
    public static void convertToASCII(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int asciiValue = (int) c;
            System.out.println("Character: " + c + ", ASCII value: " + asciiValue);
        }
    }
}

