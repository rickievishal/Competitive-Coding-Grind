import java.util.Scanner;

public class FlameFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two names from the user
        System.out.print("Enter the first name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter the second name: ");
        String name2 = scanner.nextLine();

        // Find and print flames between the two names
        System.out.println("Flames between the two names:");
        findFlames(name1, name2);
    }

    public static void findFlames(String name1, String name2) {
        int length = Math.max(name1.length(), name2.length());
        int i = 0;

        while (i < length) {
            char c1 = name1.charAt(i);
            char c2 = name2.charAt(i);

            if (c1 != c2) {
                System.out.print(c1 + " ");
            }
            i++;
        }
    }
}
