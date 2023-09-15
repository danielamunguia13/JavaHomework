import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Crea un objeto Scanner para obtener el número de términos
        Scanner scanner = new Scanner(System.in);

        // Pide que ingrese el número de términos de la secuencia de Fibonacci
        System.out.print("Ingrese el número de términos de la secuencia de Fibonacci: ");

        // Lee el número de términos desde la entrada estándar
        int n = scanner.nextInt();

        // Declara las variables para almacenar los términos de Fibonacci
        long primero = 0;
        long segundo = 1;

        // Muestra los primeros dos términos (0 y 1)
        System.out.println("Secuencia de Fibonacci:");
        System.out.print(primero + " " + segundo + " ");

        // Genera el resto de la secuencia
        for (int i = 2; i < n; i++) {
            long siguiente = primero + segundo;
            System.out.print(siguiente + " ");

            // Actualiza los valores de primero y segundo para el siguiente término
            primero = segundo;
            segundo = siguiente;
        }

        // Cierra el Scanner
        scanner.close();
    }
}
