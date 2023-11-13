public class Main {

    public static void main(String[] args) {
        // Llama a la función enviarMatriz con la matriz9 de la clase Matrices
        enviarMatriz(Matrices.matriz7);
    }

    // Función para analizar y mostrar una matriz
    public static void enviarMatriz(String[][] matriz) {
        // Muestra la matriz en la consola
        Matrices.mostrarMatriz(matriz, 6, 6);

        // Verifica si la matriz es mutante utilizando el método analizarMatriz
        if (Matrices.analizarMatriz(matriz, 6, 6)) {
            System.out.println("La matriz presentada es mutante");
        } else {
            System.out.println("La matriz presentada no es mutante");
        }
    }
}
