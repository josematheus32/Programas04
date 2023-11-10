import java.util.Scanner;

public class Programa22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        System.out.println("Digite 10 números inteiros para o vetor A:");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 0) {
                contador++;
            }
        }

        int[] vetorB = new int[contador];
        int indiceB = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 0) {
                vetorB[indiceB] = vetorA[i];
                indiceB++;
            }
        }

        System.out.println("Vetor B (compactado):");
        mostrarVetor(vetorB);

        scanner.close();
    }

    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
