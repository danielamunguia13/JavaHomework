public class PromedioArreglos {
    public static void main(String[] args) {
        int[] arreglo = { 59, 23, 15, 49, 200 };
        double promedio = calcularPromedio(arreglo);
        System.out.println("El promedio del arreglo es: " + promedio);
    }

    public static double calcularPromedio(int[] arreglo) {
        int suma = 0;

        // Suma todos los elementos del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        // Divide la suma por la cantidad de elementos para obtener el promedio
        double promedio = (double) suma / arreglo.length;

        return promedio;
    }
}

