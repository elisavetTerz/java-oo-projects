package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * This App takes a user-input string through scanner
 * and contains two methods:  encrypt and decrypt.
 * Encrypt method: replacing each string character with its next ASCII character.
 * Decrypt: replacing each string character with its previous ASCII character.
 */
public class EncryptionDecryptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a STRING: ");
        String inputStr = scanner.nextLine();

        //Encryption
        System.out.println("Encrypted String: " + encryptToASCII(inputStr));

        //Decryption
        System.out.println("Decrypted String: " + decryptToASCII(inputStr));

    }

    public static String encryptToASCII(String str) {
        StringBuilder encryptedString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char encryptedChar = (char) (currentChar + 1);
            int asciiValue = (int) encryptedChar;
            encryptedString.append(encryptedChar);
            System.out.println("Character: " + currentChar + ", Encrypted Character: " + encryptedChar + ", ASCII value: " + asciiValue);
        }
        return encryptedString.toString();
    }

    public static String decryptToASCII(String str) {
        StringBuilder decryptedString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char decryptedChar = (char) (currentChar - 1);
            int asciiValue = (int) decryptedChar;
            decryptedString.append(decryptedChar);
            System.out.println("Character: " + currentChar + ", Decrypted Character: " + decryptedChar + ", ASCII value: " + asciiValue);
        }
        return decryptedString.toString();
    }
}
