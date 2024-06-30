import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a ord: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Palindrome word.");
        } else {
            System.out.println("Not a Palindrome word.");
        }
    }
    public static boolean isPalindrome(String input) {
        String sanitizedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedInput = new StringBuilder(sanitizedInput).reverse().toString();
        return sanitizedInput.equals(reversedInput);
    }
}
