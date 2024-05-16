package week_4_java_hw;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Programme_3_FindVowelOrConsonant {
    public static void checkVowelOrConsonant(String letter) {
        //check length of string
        //if user enter more then one character error message get printed
        if (letter.length() > 1) {
            System.out.println("Error. not a single character.");
            //if user enter a symbol
        } else if (!(isItALetter(letter))) {
            System.out.println("Error. not a letter. Enter uppercase or lowercase");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("Input letter is vowel");
        } else {
            System.out.println("Input letter is consonant");
        }
    }

    //check this is letter or not
    public static boolean isItALetter(String l) {
        return l.charAt(0) > 96 && l.charAt(0) < 123;
    }

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        String str = scanner.next().toLowerCase();
        //calling static method directly
        checkVowelOrConsonant(str);
        //closing scanner
        scanner.close();
    }
}
