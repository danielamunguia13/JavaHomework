import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // Crea un objeto Scanner para obtener el número
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese un número
        System.out.print("Ingresa un número: ");

        // Lee el número
        int numero = scanner.nextInt();

        // Verifica si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }

        scanner.close();
    }
}
