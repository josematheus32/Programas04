import java.util.Scanner;

public class Programa11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorOriginal = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }

        int[] vetorPares = new int[vetorOriginal.length];
        int[] vetorImpares = new int[vetorOriginal.length];

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < vetorOriginal.length; i++) {
            if (vetorOriginal[i] % 2 == 0) {
                vetorPares[contadorPares] = vetorOriginal[i];
                contadorPares++;
            } else {
                vetorImpares[contadorImpares] = vetorOriginal[i];
                contadorImpares++;
            }
        }

        System.out.println("Vetor de Números Pares:");
        mostrarVetor(vetorPares, contadorPares);

        System.out.println("Vetor de Números Ímpares:");
        mostrarVetor(vetorImpares, contadorImpares);

        scanner.close();
    }

    public static void mostrarVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
