package morningchallenge;

import java.util.Scanner;

/**
 * Created by Jay Vaghani
 */
public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word you want to reverse : \n");
        String str = scanner.nextLine();
        String reverse = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // Extract each character
            reverse = ch + reverse; // adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + reverse);
        reverseWord(str);
    }

    public static void reverseWord(String str) {
        char try1[] = str.toCharArray();
        String reverse = "";
        for (int i = try1.length - 1; i >= 0; i--) {
            reverse = reverse + try1[i];
        }
        System.out.println(reverse);
    }
}
