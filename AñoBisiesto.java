import java.util.Scanner;
public class AñoBisiesto {
    public static void main(String[] args) {
        // Crea un objeto Scanner para obtener el año
        Scanner scanner = new Scanner(System.in);

        // Pide que se ingrese un año
        System.out.print("Ingresa un año: ");


        int año = scanner.nextInt();

        // Verifica si el año es bisiesto
        boolean esBisiesto = false;

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            esBisiesto = true;
        }

        // Muestra el resultado
        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }

        scanner.close();
    }
}

