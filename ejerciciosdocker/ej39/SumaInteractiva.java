import java.util.Scanner;

public class SumaInteractiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("La suma es: " + (num1 + num2));
        scanner.close();
    }
}
