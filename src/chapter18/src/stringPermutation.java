import java.util.Scanner;


public class stringPermutation {
    public static void main(String[] args) {
        String perm = userString();
        displayPermutation(perm);
    }

    public static void displayPermutation(String s) {
        displayPermutation(" ", s);
    }

    public static void displayPermutation(String s1, String s2) {
        if (s2.length() == 0) System.out.println(s1);
        for (int i = 0; i < s2.length(); i++) {
            displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
        }
    }

    public static String userString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
       
        return input.nextLine();
    
    
    }

    
}