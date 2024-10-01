import java.util.Scanner;

class Keyread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer:");
        int a = sc.nextInt();

        System.out.println("Enter any float:");
        float b = sc.nextFloat();

        System.out.println("Enter any double:");
        double c = sc.nextDouble();
        
        // Consume the leftover newline character
        sc.nextLine();

        System.out.println("Enter any char:");
        char d = sc.nextLine().charAt(0);

        System.out.println("Enter any sentence:");
        String e = sc.nextLine();

        System.out.println("The entered values are:");
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Char: " + d);
        System.out.println("Sentence: " + e);
    }
}
