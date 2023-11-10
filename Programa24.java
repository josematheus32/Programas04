import java.util.Scanner;

public class Programa24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorOriginal = new int[15];

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }

        int[] vetorPrimos = encontrarPrimos(vetorOriginal);

        System.out.println("Vetor resultante contendo os números primos:");
        mostrarVetor(vetorPrimos);

        scanner.close();
    }

    public static int[] encontrarPrimos(int[] vetor) {
        int contadorPrimos = 0;

        for (int num : vetor) {
            if (ehPrimo(num)) {
                contadorPrimos++;
            }
        }

        int[] vetorPrimos = new int[contadorPrimos];

        int indicePrimos = 0;
        for (int num : vetor) {
            if (ehPrimo(num)) {
                vetorPrimos[indicePrimos] = num;
                indicePrimos++;
            }
        }

        return vetorPrimos;
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void mostrarVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
