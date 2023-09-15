import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");

        double numero = scanner.nextDouble();

        // Verifica si el número es positivo, negativo o cero
            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }
            scanner.close();
        }
}


